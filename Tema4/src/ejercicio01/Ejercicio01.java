package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena = sc.nextLine();
		String cadenaModificada = getMayusculas(cadena);
		System.out.println(cadenaModificada);
		sc.close();
	}

	public static String getMayusculas(String cadena) {
		String cadenaModificada = cadena.trim().toUpperCase();
		return cadenaModificada;
		//return cadena.trim().toUpperCase();
	}

}
