package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Introduce un texto que empiece por hola y termine"
					+ " por hastaluego: ");
			String texto = sc.nextLine().trim();
			if (texto.startsWith("hola") && texto.endsWith("hastaluego")) {
				String mensaje = texto.substring(4, texto.length() - 10).trim();
				System.out.println("El mensaje es: " + mensaje);
				break;
			} else {
				System.out.println("Error, repítelo de nuevo.");
			}
		}
		sc.close();
	}
}