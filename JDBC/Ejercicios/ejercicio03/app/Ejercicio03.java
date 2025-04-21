package ejercicio03.app;

import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import ejercicio03.modelo.DatosIncompletosException;
import ejercicio03.modelo.Persona;
import ejercicio03.servicio.PersonasServicio;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Escribe la palabra a buscar: ");
		String palabra = sc.nextLine();*/
		Persona p = new Persona();
		try {
			PersonasServicio service = new PersonasServicio();
			/*List<Persona> lista = service.buscarPersonas(palabra);
			if (lista.isEmpty()) {
				System.out.println("No existe ninguna persona con esa palabra");
			} else {
				System.out.println(lista);
			}*/
			Boolean error = true;
			do {
				Boolean validado = false;
				System.out.println("Introduce datos para insertar en la base de datos");
				System.out.println("Dni: ");
				String dni = sc.nextLine();
				System.out.println("Nombre: ");
				String nombre = sc.nextLine();
				System.out.println("Apellidos: ");
				String apellidos = sc.nextLine();
				// Fecha
				System.out.println("Año de nacimiento: ");
				Integer año = sc.nextInt();
				System.out.println("Mes de nacimiento: ");
				Integer mes = sc.nextInt();
				System.out.println("Dia de nacimiento: ");
				Integer dia = sc.nextInt();
				try {
					LocalDate fecha = LocalDate.of(año, mes, dia);
					fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					p.setDni(dni);
					p.setNombre(nombre);
					p.setApellidos(apellidos);
					p.setFechaNacimientoLocalDate(fecha);
					validado = p.validar();
					if (validado) {
						service.insertarPersona(p);
					}
					error = false;
				} catch (DateTimeException e) {
					System.out.println("La fecha indicada no es correcta. Empieza de nuevo");
					error = true;
					sc.nextLine();
				} catch (DatosIncompletosException e) {
					System.out.println("Los datos están incompletos");
					error = true;
					sc.nextLine();
				}
			} while (error);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Excepcion en main: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
