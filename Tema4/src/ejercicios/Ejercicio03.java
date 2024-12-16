package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean repetir = true;
		System.out.println("Introduce una cadena: ");
		String cadena = sc.nextLine();
		while (repetir) {
			System.out.println("Introduce 1 o 2: ");
			Integer numero = sc.nextInt();
			sc.close();
			if (numero == 1) {
				String cadenaMayus = uno(cadena);
				System.out.println(cadenaMayus);
				repetir = false;
			} else if (numero == 2) {
				String cadenaMinus = dos(cadena);
				System.out.println(cadenaMinus);
				repetir = false;
			} else {
				System.out.println("Introduce 1 o 2");
				repetir = true;
			}
		}
	}

	public static String uno(String cadena) {
		return cadena.trim().toUpperCase();
	}

	public static String dos(String cadena) {
		return cadena.trim().toLowerCase();
	}
}
