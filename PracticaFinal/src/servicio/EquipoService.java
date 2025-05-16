package servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EquipoService {
	private OpenConnection openConn;
	
	public EquipoService() throws SQLException{
		openConn = new OpenConnection();
	}
	
	public void verEquipos() throws SQLException{
		String sql = "INSERT INTO PLANTAS VALUES (?,?,?,?,?)";
		try(Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
		
		}catch(SQLException e) {
			throw e;
		}
	}
	
	
}
