package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean error = false;
		do {
			System.out.println("Dame un correo, por favor: ");
			String email = sc.nextLine();

			if (!email.contains("@")) {
				error = true;
			}
			if (email.contains("@.")) {
				error = true;
			}
			if (email.endsWith(".")) {
				error = true;
			}
		} while (error == true);
		sc.close();
	}

}
