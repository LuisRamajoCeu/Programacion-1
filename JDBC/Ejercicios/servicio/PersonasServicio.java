package servicio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Persona;

public class PersonasServicio {
	
	private OpenConnection openConn;
	 
	public PersonasServicio() {
		openConn = new OpenConnection();
		System.out.println("Conexion establecida "+openConn);
	}
	public void consultarPersona(String dniPedido) {
		String sql = "SELECT * FROM PERSONAS WHERE DNI = '23345678U'";
		Persona persona = new Persona();
		try(Connection conn = OpenConnection.getNewConnection(); Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery(sql);
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String dni = rs.getString("dni");
				Date fechaNacimiento = rs.getDate("fecha_nacimiento");
				persona.setDni(dni);
				persona.setNombre(nombre);
				persona.setApellidos(apellido);
				persona.setFechaNacimiento(fechaNacimiento);
		}catch(SQLException e) {
			System.err.println("Error accediendo a BBDD");
		}
		System.out.println(persona.getDni());
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellidos());
		System.out.println(persona.getFechaNacimiento());
	}
	
}
