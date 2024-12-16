package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número entero: ");
		String a = sc.nextLine();
		System.out.println("Dime un número decimal: ");
		Double b = sc.nextDouble();
		System.out.println("Dime un número entero: ");
		Float c = sc.nextFloat();
		// Conversiones
		Long x1 = Long.parseLong(a);
		String x2 = b.toString();
		Integer x3 = b.intValue();
		Long x4 = c.longValue();
		System.out.println("El valor de x1 es: " + x1 + ". El valor de x2 es: " 
		+ x2 + ". El valor de x3 es: " + x3
				+ ". El valor de x4 es: " + x4);
		sc.close();
	}

}
