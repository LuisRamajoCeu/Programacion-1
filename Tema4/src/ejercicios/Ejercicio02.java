package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena = sc.nextLine();
		String cadenaModificada = getMinusculas(cadena);
		System.out.println(cadenaModificada);
		sc.close();
	}

	public static String getMinusculas(String cadena) {
		String cadenaModificada = cadena.trim().toLowerCase();
		return cadenaModificada;
		
	}
}
