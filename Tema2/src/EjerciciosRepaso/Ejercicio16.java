package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		for (int i = 0; i < palabra.length(); i++) {
		System.out.println(palabra.substring(i, i+1));
		}
		sc.close();
	}

}
