package ejercicio02.servicio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejercicio01.modelo.Persona;

public class PersonasServicio {

	private OpenConnection openConn;

	public PersonasServicio() throws SQLException {
		openConn = new OpenConnection();
		System.out.println("Conexion establecida " + openConn);
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

	public List<Persona> buscarPersonas(String dniPedido) throws SQLException {
		List<Persona> lista = new ArrayList<>();
		ResultSet rs = null;
		try (Connection conn = openConn.getNewConnection(); Statement stmt = conn.createStatement()) {
			String sql = "SELECT * FROM PERSONAS";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setDni(rs.getString("DNI"));
				p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
				lista.add(p);
			} else {
				return null;
			}
		}
		return lista;
	}

}
