package Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] palabras = new String[3];		
		// Recorremos el array y solicitamos una palabra 
		// al usuario para meterlo en la posicion i
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce una palabra");
			String x = sc.nextLine();
			palabras[i] = x;					
		}
		// Recorrer el array para imprimirlo
		for (int i = 0; i < 3; i++) {
			System.out.print(palabras[i]);
		}
		sc.close();
	}
}