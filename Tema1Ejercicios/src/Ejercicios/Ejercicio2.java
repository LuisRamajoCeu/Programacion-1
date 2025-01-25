package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre de usuario");
		String nombre = sc.nextLine();
		System.out.println("Bienvenido " + nombre);
		System.out.println("¿De dónde eres?");
		String lugar = sc.nextLine();
		System.out.println("¿Qué tal se vive en " + lugar);
		sc.nextLine();
		System.out.println("Gracias. Un saludo");
		sc.close();

	}

}
