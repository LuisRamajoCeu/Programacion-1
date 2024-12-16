package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto = sc.nextLine();
		Integer caract = texto.length();
		for (int i = 0; i < caract; i += 5) {
			Integer fin = Math.min(i + 5, caract);
			String cinco = texto.substring(i, fin);
			System.out.println(cinco);
		}
		sc.close();
	}

}
