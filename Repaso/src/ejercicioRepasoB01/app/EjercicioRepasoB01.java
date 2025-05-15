package ejercicioRepasoB01.app;

import java.math.BigDecimal;
import java.sql.SQLException;

import ejercicioRepasoB01.modelo.Libreria;
import ejercicioRepasoB01.modelo.LibroNormal;
import ejercicioRepasoB01.modelo.LibroSegundaMano;
import ejercicioRepasoB01.servicio.LibreriaService;
import ejercicioRepasoB01.servicio.LibroException;

public class EjercicioRepasoB01 {

	public static void main(String[] args) {
		
		LibroNormal libro1 = new LibroNormal("Libro 1","Autor 1","1",new BigDecimal(10));
		LibroSegundaMano libro2 = new LibroSegundaMano("Libro 2","Autor 2","2",new BigDecimal(5),5);
		Libreria libreria = new Libreria("Libreria 1");
		try {
			LibreriaService servicio = new LibreriaService();
			servicio.insertarLibroNuevo(libro1);
			servicio.insertarLibroNuevo(libro2);
			libro2.setPrecioBase(new BigDecimal(7));
			servicio.actualizarPrecioLibroNuevo(libro2);
			System.out.println(libreria.getPrecioMedio());
			//System.out.println(libreria.getLibrosBaratos());
			//System.out.println(libreria.getTasacionCompleta());
		} catch (SQLException e) {
			e.getMessage();
		} catch (LibroException e) {
			e.getMessage();
		}
		
		
	}

}
