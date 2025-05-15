package ejercicioRepaso02.app;

import java.math.BigDecimal;
import java.sql.SQLException;

import ejercicioRepaso02.modelo.Planta;
import ejercicioRepaso02.servicio.PlantaAlturaException;
import ejercicioRepaso02.servicio.ServicioPlanta;

public class EjercicioRepaso02 {

	public static void main(String[] args) {
		Planta planta = new Planta(1,"Planta 1","Exterior",BigDecimal.ONE);
		try {
			ServicioPlanta servicio = new ServicioPlanta();
			servicio.insertarPlanta(planta);
		} catch (SQLException e) {
			e.getMessage();
		} catch (PlantaAlturaException e) {
			e.getMessage();
		}
	}

}
