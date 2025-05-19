package ejercicioRepaso01.app;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import ejercicioRepaso01.modelo.ProductoGourmet;
import ejercicioRepaso01.servicio.ProductoInvalidoException;
import ejercicioRepaso01.servicio.ProductoNoEncontradoException;
import ejercicioRepaso01.servicio.ServicioProductoGourmet;

public class EjercicioRepaso01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			ServicioProductoGourmet servicio = new ServicioProductoGourmet();
			/*
			 * List<ProductoGourmet> lista = new ArrayList<>(); ProductoGourmet producto1 =
			 * new ProductoGourmet(1, "Plato 1", "Cena", new BigDecimal(31.232), true);
			 * lista.add(producto1); ProductoGourmet producto2 = new ProductoGourmet(2,
			 * "Plato 2", "Comida", new BigDecimal(57.46), false); lista.add(producto2);
			 * ProductoGourmet producto3 = new ProductoGourmet(3, "Plato 3", "Comida", new
			 * BigDecimal(12.78), true); lista.add(producto3); servicio.eliminaProducto(1);
			 * servicio.eliminaProducto(2); servicio.eliminaProducto(3);
			 * servicio.insertarListaProductos(lista);
			 * System.out.println(servicio.consultaTipoProductoGourmets("Comida"));
			 * //servicio.eliminaProducto(4); Collection<ProductoGourmet> values =
			 * servicio.consultarProductosDisponibles().values(); List<ProductoGourmet>
			 * listaDisponibles = new ArrayList<>(values); for (ProductoGourmet p :
			 * listaDisponibles) { System.out.println(p); }
			 * System.out.println(servicio.consultarProductosDisponibles());
			 */
			List<ProductoGourmet> lista = new ArrayList<>();
			for (int i = 0; i < 1; i++) {
				Boolean disponible = false;
				System.out.println("Escribe el id:");
				Integer id = sc.nextInt();
				sc.nextLine();
				System.out.println("Escribe el nombre del plato:");
				String nombre = sc.nextLine();
				System.out.println("Escribe el tipo de plato:");
				String tipo = sc.nextLine();
				System.out.println("Escribe el precio:");
				Double precio = sc.nextDouble();
				System.out.println("Escribe si está disponible (1/0):");
				Integer disponibleInt = sc.nextInt();
				if (disponibleInt == 1) {
					disponible = true;
				}
				ProductoGourmet producto = new ProductoGourmet(id, nombre, tipo, new BigDecimal(precio), disponible);
				lista.add(producto);
			}
			servicio.insertarListaProductos(lista);
			// 2
			sc.nextLine();
			System.out.println("Introduce un tipo para consultar:"); 
			String tipo =sc.nextLine();
			System.out.println(servicio.consultaTipoProductoGourmets(tipo));
			// 3
			Collection<ProductoGourmet> values = servicio.consultarProductosDisponibles().values();
			List<ProductoGourmet> listaDisponibles = new ArrayList<>(values);
			ProductoGourmet masCaro = null;
			int c = 0;
			for (ProductoGourmet p : listaDisponibles) {
				if (c == 0) {
					masCaro = p;
				}
				if (p.getPrecio().compareTo(masCaro.getPrecio()) > 0) {
					masCaro = p;
				}
				c = 1;
			}
			System.out.println("El producto mas caro es: " + masCaro);
			// 4
			System.out.println("Escribe un id para consultar un producto disponible: ");
			Integer idConsultar = sc.nextInt();
			ProductoGourmet productoSolicitado = null;
			for (ProductoGourmet p : listaDisponibles) {
				if (p.getId() == idConsultar) {
					productoSolicitado = p;
				}
			}
			if(productoSolicitado != null) {
				System.out.println(productoSolicitado);
			}else {
				throw new ProductoNoEncontradoException("No existe ese id en un producto disponible");
			}
			//5
			System.out.println("Escribe un id para eliminar un producto disponible: ");
			Integer idEliminar = sc.nextInt();
			ProductoGourmet productoEliminar = null;
			for (ProductoGourmet p : listaDisponibles) {
				if (p.getId() == idEliminar) {
					productoEliminar = p;
				}
			}
			servicio.eliminaProducto(idEliminar);
			System.out.println("Se ha eliminado el producto con id: " + idEliminar);
			

		} catch (SQLException e) {
			System.out.println("Error en main");
		} catch (ProductoInvalidoException e) {
			e.getMessage();
		} catch (ProductoNoEncontradoException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
