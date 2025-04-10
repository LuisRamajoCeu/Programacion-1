package ejercicio02.app;

import java.sql.SQLException;
import java.util.Scanner;

import ejercicio02.modelo.Persona;
import ejercicio02.servicio.PersonasServicio;



public class Ejercicio02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el dni: ");
		String dniPedido = sc.nextLine();
		try {
			PersonasServicio service = new PersonasServicio();
			Persona p = service.consultarPersona(dniPedido);
			if(p == null) {
				System.out.println("No existe ninguna persona con ese DNI");
			}else {
				System.out.println(p);
			}
			System.out.println(service.buscarPersonas());
		
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Excepcion en main: " + e.getMessage());
		}finally {
			sc.close();
		}
		
	}
	
}