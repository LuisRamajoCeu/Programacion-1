package ejercicioRepaso02.servicio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ejercicio09.servicio.OpenConnection;
import ejercicioRepaso02.modelo.Planta;

public class ServicioPlanta {
	private List<Planta> plantas = new ArrayList<>();
	private OpenConnection openConn;
	
	public ServicioPlanta() throws SQLException{
		openConn = new OpenConnection();
	}
	
	public void insertarPlanta(Planta p) throws PlantaAlturaException,SQLException{
		String sql = "INSERT INTO PLANTAS VALUES (?,?,?,?,?)";
		try(Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
		if(p.getAltura().compareTo(BigDecimal.TWO) > 0) {
			throw new PlantaAlturaException("La planta ha superado la altura permitida");
		}else {
			p.setFechaPlantacion(LocalDate.now());
			plantas.add(p);
			stmt.setInt(1, p.getId());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getTipo());
			stmt.setBigDecimal(4, p.getAltura());
			stmt.setDate(5, Date.valueOf(p.getFechaPlantacion()));			
		}
		}catch(SQLException e) {
			throw e;
		}
	}
	
	public void actualizarPlantasMedias() throws SQLException {
		String sql = "UPDATE PLANTAS SET TIPO = 'Media Altura' WHERE ALTURA BETWEEN 1 AND 1.5";
		try(Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			
		}catch(SQLException e) {
			throw e;
		}
	}
	
}
