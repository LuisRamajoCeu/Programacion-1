package ejercicioRepasoB01.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ejercicioRepasoB01.modelo.Libro;

public class LibreriaService {
	private OpenConnection openConn;
	
	public LibreriaService() throws SQLException{
		openConn = new OpenConnection();
	}
	
	public void insertarLibroNuevo(Libro libro) throws LibroException {
		String sql = "INSERT INTO LIBROS (isbn, titulo, autor, precio) VALUES (?, ?, ?, ?)";
		try(Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, libro.getISBN());
			stmt.setString(2, libro.getTitulo());
			stmt.setString(3, libro.getAutor());
			stmt.setBigDecimal(4, libro.getPrecio());
			stmt.execute();
			//añadir a mapa
		}catch(SQLException e) {
			e.printStackTrace();
			throw new LibroException("Error al insertar el libro");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error insertar");
		}
	}
	
	public Boolean actualizarPrecioLibroNuevo(Libro libro) throws LibroException {
		String sql = "UPDATE LIBROS SET PRECIO = ? WHERE ISBN = ?";
		int contUpdate = 0;
		try(Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setBigDecimal(1, libro.getPrecio());
			stmt.setString(2, libro.getISBN());
			contUpdate = stmt.executeUpdate();
			if(contUpdate > 0) {
				return true;
			}else {
				return false;
			}
		}catch(SQLException e) {
			throw new LibroException("Error al actualizar el libro del libro");
		}
	}
}
