package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int actual = 2024;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es tu año de nacimiento?");
		Integer año = sc.nextInt();
		int edad = actual - año;
		System.out.println("Su edad es " + edad + "años");
		sc.close();

	}

}
