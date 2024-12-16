package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean repite = true;
		while (repite) {
			System.out.println("Introduce un texto que empiece por hola y termine por hastaluego: ");
			String texto = sc.nextLine().trim();
			if (texto.startsWith("hola") && texto.endsWith("hastaluego")) {
				String mensaje = texto.substring(4, texto.length() - 10).trim();
				System.out.println("El mensaje es: " + mensaje);
				repite = true;
			}else if(texto.startsWith("hola")&& texto.endsWith("adios")){
				repite = false;
			} else {
				System.out.println("Error, repítelo de nuevo.");
				repite = true;
			}
		
		}
		sc.close();}
	
}
