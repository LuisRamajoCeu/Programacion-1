package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre de usuario: ");
		String usuario = sc.nextLine().toUpperCase().trim();
		Integer usuarionumc = usuario.length();
		if (usuarionumc < 10) {
			System.out.println("El usuario debe tener al menos 10 carácteres.");
		}
		if (usuario.contains(" ")) {
			System.out.println("No puede contener un espacio.");
		} else if (usuarionumc >= 10 && !usuario.contains(" ")) {
			System.out.println("Tu nombre de usuario es: " + usuario);
		}
		sc.close();
	}
}
