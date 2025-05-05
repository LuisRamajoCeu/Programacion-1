package ejercicio08.app;

import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio08.servicio.DatosIncompletosException;
import ejercicio08.modelo.Persona;
import ejercicio08.servicio.PersonasServicio;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean parar = false;
		try {
			do {
				System.out.println(
						"********MENÚ********\n1. Consultar persona.\n2. Buscar persona.\n3. "
						+ "Insertar persona.\n4. Actualizar persona.\n5. Borrar persona.\n6. Insertar lista.\n7. Salir");
				int opcion = sc.nextInt();
				sc.nextLine();
				switch (opcion) {
				case 1:
					try {
						System.out.print("Escribe el dni: ");
						String dniPedido = sc.nextLine();
						PersonasServicio service = new PersonasServicio();
						Persona p = service.consultarPersona(dniPedido);
						if (p == null) {
							System.out.println("No existe ninguna persona con ese DNI");
						} else {
							System.out.println(p);
						}
						break;
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Excepcion en main: " + e.getMessage());
					}
				case 2:
					try {
						System.out.print("Escribe la palabra a buscar: ");
						String palabra = sc.nextLine();
						PersonasServicio service = new PersonasServicio();
						List<Persona> lista = service.buscarPersonas(palabra);
						if (lista.isEmpty()) {
							System.out.println("No existe ninguna persona con esa palabra");
						} else {
							System.out.println(lista);
						}
						break;
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Excepcion en main: " + e.getMessage());
					}
				case 3:
					try {
						PersonasServicio service = new PersonasServicio();
						Boolean error = true;
						do {
							Persona p = new Persona();
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
								if (p.validar()) {
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
						break;
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Excepcion en main: " + e.getMessage());
					}
				case 4:
					try {
						PersonasServicio service = new PersonasServicio();
						Persona p = new Persona();
						System.out.println("Introduce datos para actualizar en la base de datos");
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
							if (p.validar()) {
								service.actualizarPersona(p);
							}
						} catch (DateTimeException e) {
							System.out.println("La fecha indicada no es correcta. Empieza de nuevo");
							sc.nextLine();
						} catch (DatosIncompletosException e) {
							System.out.println("Los datos están incompletos");
							sc.nextLine();
						}
					}catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Excepcion en main: " + e.getMessage());
					}
					break;
				case 5:
					try {
						PersonasServicio service = new PersonasServicio();
						System.out.println("Introduce el dni para borrar a una persona en la base de datos");
						System.out.println("Dni: ");
						String dni = sc.nextLine();
						service.borrarPersona(dni);
					}catch (Exception e) {
						e.printStackTrace();
						System.out.println("Excepcion en main: " + e.getMessage());
					}
					break;
				case 6:
					try {
						PersonasServicio service = new PersonasServicio();
						Boolean error = true;
						List<Persona> listaPersonas = new ArrayList<>();
						Boolean mas = true;
						do {
						do {
							try {
							Persona p = new Persona();
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
							LocalDate fecha = LocalDate.of(año, mes, dia);
							fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							p.setDni(dni);
							p.setNombre(nombre);
							p.setApellidos(apellidos);
							p.setFechaNacimientoLocalDate(fecha);
							if (p.validar()) {
								listaPersonas.add(p);
							}
							sc.nextLine();
							System.out.println("¿Quieres añadir otro? (S/N)");
							String otro = sc.nextLine();
							if(otro.equalsIgnoreCase("n")) {
								mas = false;
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
							} catch(Exception e) {
								System.out.println("Excepcion");
								error = true;
								sc.nextLine();
							}
						} while(error);
						} while(mas);
						service.insertarPersonas(listaPersonas);
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Excepcion sql en main: " + e.getMessage());
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Excepcion en main: " + e.getMessage());
					}
					break;
				case 7:
					System.out.println("Saliendo del programa");
					parar = true;
					break;
				default:
					System.out.println("Opcion inválida");
				}
			} while (!parar);

		} catch (Exception e) {
			System.out.println("Excepcion principal");
		} finally {
			sc.close();
		}
	}
}
