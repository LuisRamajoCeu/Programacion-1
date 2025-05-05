package ejercicio09.servicio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ejercicio09.modelo.Persona;

public class PersonasServicio {

	private OpenConnection openConn;

	public PersonasServicio() throws SQLException {
		openConn = new OpenConnection();
	}

	public Persona consultarPersona(String dniPedido) throws SQLException {
		ResultSet rs = null;
		try (Connection conn = openConn.getNewConnection(); Statement stmt = conn.createStatement()) {
			String sql = "SELECT * FROM PERSONAS WHERE DNI = '" + dniPedido + "'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setDni(rs.getString("DNI"));
				p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
				return p;
			} else {
				return null;
			}
		}

	}

	public List<Persona> buscarPersonas(String palabra) throws SQLException {
		List<Persona> lista = new ArrayList<>();
		ResultSet rs = null;
		try (Connection conn = openConn.getNewConnection(); Statement stmt = conn.createStatement()) {
			String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + palabra + "%' OR APELLIDOS LIKE " + "'%"
					+ palabra + "%'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setDni(rs.getString("DNI"));
				p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
				lista.add(p);
			}
		}
		return lista;
	}

	public void insertarPersona(Persona personaInsertada) throws SQLException {
		String sqlInsert = "INSERT INTO PERSONAS (DNI,NOMBRE,APELLIDOS,FECHA_NACIMIENTO) VALUES (?,?,?,?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sqlInsert)) {
			System.out.println(sqlInsert);
			stmt.setString(1, personaInsertada.getDni());
			stmt.setString(2, personaInsertada.getNombre());
			stmt.setString(3, personaInsertada.getApellidos());
			stmt.setDate(4, Date.valueOf(personaInsertada.getFechaNacimiento()));
			stmt.execute();
		} catch (Exception e) {
			System.out.println("Error en el metodo insertar");
		}
	}

	public void actualizarPersona(Persona persona) throws SQLException {
		String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NACIMIENTO = ? WHERE DNI = '"
				+ persona.getDni() + "'";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			System.out.println(sql);
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellidos());
			stmt.setDate(3, Date.valueOf(persona.getFechaNacimiento()));
			int c = stmt.executeUpdate();
			if (c == 0) {
				System.out.println("No hay ninguna persona con ese DNI");
			} else {
				System.out.println("Se ha actualizado: 1 persona");
			}
		} catch (Exception e) {
			System.out.println("Error en el metodo actualizar");
		}
	}

	public void borrarPersona(String dni) throws SQLException {
		String sql = "DELETE FROM PERSONAS WHERE DNI = '" + dni + "'";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			System.out.println(sql);
			int c = stmt.executeUpdate();
			if (c == 0) {
				System.out.println("No hay ninguna persona con ese DNI");
			} else {
				System.out.println("Se ha borrado: 1 persona");
			}
		} catch (Exception e) {
			System.out.println("Error en el metodo borrar");
		}
	}
	
	public void insertarPersonas(List<Persona> listaPersonas) throws SQLException {
		String sqlInsert = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sqlInsert)) {
			conn.setAutoCommit(false);
			try {
				for(Persona personaInsertada : listaPersonas) {
					insertar(personaInsertada,conn);
				}
				conn.commit();
			}catch (SQLException e) {
				System.out.println("Error en el metodo insertar");
				conn.rollback();
				throw e;
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	private void insertar(Persona personaInsertada,Connection conn) throws SQLException{
		String sqlInsert = "INSERT INTO PERSONAS (DNI,NOMBRE,APELLIDOS,FECHA_NACIMIENTO) VALUES (?,?,?,?)";
		try(PreparedStatement stmt = conn.prepareStatement(sqlInsert);){
			stmt.setString(1, personaInsertada.getDni());
			stmt.setString(2, personaInsertada.getNombre());
			stmt.setString(3, personaInsertada.getApellidos());
			stmt.setDate(4, Date.valueOf(personaInsertada.getFechaNacimiento()));
			stmt.execute();
		}
	}
	
	public void borrarPersonasA() {
		String consultaMay = "SELECT DNI FROM PERSONAS WHERE EXTRACT(YEAR FROM FECHA_NACIMIENTO) < 2007";
		try (Connection conn = openConn.getNewConnection(); Statement stmt = conn.createStatement()) {
			conn.setAutoCommit(false);
			try {
				ResultSet rs = null;
				rs = stmt.executeQuery(consultaMay);
				int c = 0;
				while(rs.next()) {
					String del = "DELETE FROM PERSONAS WHERE DNI = ";
					del = del + "'" + rs.getString("DNI") + "'";
					PreparedStatement delete = conn.prepareStatement(del);
					c = c + delete.executeUpdate();
				}
				conn.commit();
				System.out.println("Se han borrado "+ c + " personas");
			
		} catch (SQLException e) {
			System.out.println("Error sql en el metodo borrar mayores");
			conn.rollback();
		} 
		
	}
	catch(Exception e) {
		System.out.println("Error en el metodo borrar mayores");
		
	}
	
}
	
}

