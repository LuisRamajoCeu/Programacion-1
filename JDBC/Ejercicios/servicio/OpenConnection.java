package servicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConnection {
	
	public static Connection getNewConnection() throws SQLException{
		String usuario = "PROGRAMACION";
		String password = "PROGRAMACION";
		
		String url = "jdbc:driver:thin:@//localhost:1521/XE";
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driverClass);
		}catch(ClassNotFoundException e) {
			System.err.println("No se encuentra el driver JDBC. Revisa su configuracion");
			throw new RuntimeException(e);
		}
		Connection conn = DriverManager.getConnection(url,usuario,password);
		return conn;
	}
}
