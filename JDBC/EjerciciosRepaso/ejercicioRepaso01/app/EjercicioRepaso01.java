package ejercicioRepaso01.app;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ejercicioRepaso01.modelo.ProductoGourmet;
import ejercicioRepaso01.servicio.ProductoInvalidoException;
import ejercicioRepaso01.servicio.ProductoNoEncontradoException;
import ejercicioRepaso01.servicio.ServicioProductoGourmet;

public class EjercicioRepaso01 {

	public static void main(String[] args) {
		try {
			ServicioProductoGourmet servicio = new ServicioProductoGourmet();
			List<ProductoGourmet> lista = new ArrayList<>();
			ProductoGourmet producto1 = new ProductoGourmet(1, "Plato 1", "Cena", new BigDecimal(31.232), true);
			lista.add(producto1);
			ProductoGourmet producto2 = new ProductoGourmet(2, "Plato 2", "Comida", new BigDecimal(57.46), false);
			lista.add(producto2);
			ProductoGourmet producto3 = new ProductoGourmet(3, "Plato 3", "Comida", new BigDecimal(12.78), true);
			lista.add(producto3);
			servicio.insertarListaProductos(lista);
			System.out.println(servicio.consultaTipoProductoGourmets("Comida"));
			
		} catch (SQLException e) {
			System.out.println("Error en main");
		}catch (ProductoInvalidoException e) {
			e.getMessage();
		}
			catch (ProductoNoEncontradoException e) {
			e.getMessage();
			System.out.println("a");
		}
		
	}

}
