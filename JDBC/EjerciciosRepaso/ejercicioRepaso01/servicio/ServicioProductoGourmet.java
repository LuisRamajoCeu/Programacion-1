package ejercicioRepaso01.servicio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ejercicio09.servicio.OpenConnection;
import ejercicioRepaso01.modelo.ProductoGourmet;

public class ServicioProductoGourmet {
	private OpenConnection openConn;

	public ServicioProductoGourmet() throws SQLException{
		openConn = new OpenConnection();
	}
	
	public void insertarUnProducto(ProductoGourmet producto) throws SQLException,ProductoInvalidoException {
		try(Connection conn = openConn.getNewConnection()) {
			insertarProducto(producto, conn);
		}catch(SQLException e) {
			System.out.println("Error sql en metodo insertar un producto");
			throw e;
		}catch(Exception e) {
			System.out.println("Error en metodo insertar un producto");
		}
	}
	
	public void insertarProducto(ProductoGourmet producto,Connection conn) throws SQLException,ProductoInvalidoException{
		String sql = "INSERT INTO productos_gourmet values (?,?,?,?,?)";
		try(PreparedStatement stmt = conn.prepareStatement(sql)) {
			if(producto.getPrecio().compareTo(BigDecimal.ZERO) <= 0) {
				throw new SQLException("El precio debe de ser mayor que cero");
			}
			stmt.setInt(1, producto.getId());
			stmt.setString(2, producto.getNombre());
			stmt.setString(3, producto.getTipo());
			stmt.setBigDecimal(4, producto.getPrecio());
			stmt.setBoolean(5, producto.getDisponible());
			stmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("Error sql en metodo insertar producto");
			throw e;
		}catch(Exception e) {
			System.out.println("Error en metodo insertar producto");
		}
	}
	
	public void insertarListaProductos(List<ProductoGourmet> listaProductos) throws SQLException,ProductoInvalidoException{
		try(Connection conn = openConn.getNewConnection()) {
			conn.setAutoCommit(false);
			try {
				for(ProductoGourmet producto : listaProductos) {
					insertarProducto(producto,conn);
				}
				conn.commit();
			}catch(SQLException e) {
				conn.rollback();
				System.out.println("Error sql en metodo insertar producto, se deshace los inserts");
				throw e;
			}
		} catch(SQLException e) {
			throw e;
		} 
	}
	
	public List<ProductoGourmet> consultaTipoProductoGourmets(String tipo) throws SQLException,ProductoNoEncontradoException{
		String sql = "SELECT * FROM productos_gourmet WHERE tipo = ?";
		List<ProductoGourmet> lista = new ArrayList<>();
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, tipo);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ProductoGourmet p = new ProductoGourmet(rs.getInt("id"), rs.getString("nombre"), 
				rs.getString("tipo"),rs.getBigDecimal("precio"), rs.getBoolean("disponible"));
				lista.add(p);
			}
		} catch(SQLException e) {
			throw e;
		}
		if (lista.isEmpty()) {
			throw new ProductoNoEncontradoException("No se encontró el producto con tipo: " + tipo);
		}		
		return lista;
	}
	
	public void eliminaProducto(Integer id) throws SQLException,ProductoNoEncontradoException{
		String sql = "DELETE FROM productos_gourmet WHERE id = ?";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, id);
			int filas = stmt.executeUpdate();
			if (filas == 0) {
				throw new ProductoNoEncontradoException("No se encontró el producto con id: "+id);
			}
		} catch(SQLException e) {
			throw e;
		}
	}
	
}

