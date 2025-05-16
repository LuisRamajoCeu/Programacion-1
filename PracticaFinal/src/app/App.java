package app;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		try {
		do {
			opcion = menu(sc);
		}while(opcion != 0);
		}catch(Exception e) {//SQLEXCEPTION
			e.getMessage();
		}
		
		sc.close();
	}	
	
		private static int menu(Scanner sc) {
			Boolean opcionIncorrecta;
			int opcion;
			do {
				System.out.println("Elige una de estas opciones:");
				System.out.println("\t(1) Ver todos los equipos registrados\n\t(2) Crear nuevo "
						+ "equipo\n\t(3) Consultar un equipo por su código\n\t(0) Salir");
				opcion = sc.nextInt();
				if(opcion < 0 || opcion > 3) {
					opcionIncorrecta = true;
					System.out.println("Opción incorrecta");
				}else {
					opcionIncorrecta = false;
				}
				}while(opcionIncorrecta);
			if(opcion == 1) {
				//verTodosLosEquipos();
			}else if(opcion == 2) {
				//crearNuevoEquipo();
			}else if(opcion == 3) {
				//consultarEquipoPorCodigo();
			}else {
				System.out.println("Saliendo del programa");
			}
			return opcion;
		
	
	
	
	}
		
}
