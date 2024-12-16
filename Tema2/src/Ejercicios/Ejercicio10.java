package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1;
		String palabra2;
		do {
			System.out.println("Dime una palabra");
			palabra1 = sc.nextLine();
			System.out.println("Dime otra palabra");
			palabra2 = sc.nextLine();
		} while (palabra1.isBlank() || palabra2.isBlank());
		if (palabra1.compareToIgnoreCase(palabra2) < (0)) {
			System.out.println("Orden alfabético");
			System.out.println(palabra1);
			System.out.println(palabra2);
		} else {
			System.out.println("Orden alfabético");
			System.out.println(palabra2);
			System.out.println(palabra1);
		}
		sc.close();

	}
}
