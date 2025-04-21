package ejercicio02.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import ejercicio02.modelo.Persona;
import ejercicio02.servicio.PersonasServicio;

public class Ejercicio02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe la palabra a buscar: ");
		String palabra = sc.nextLine();
		try {
			PersonasServicio service = new PersonasServicio();
			List<Persona> lista = service.buscarPersonas(palabra);
			if(lista.isEmpty()) {
				System.out.println("No existe ninguna persona con esa palabra");
			}else {
				System.out.println(lista);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Excepcion en main: " + e.getMessage());
		}finally {
			sc.close();
		}
		
	}
	
}