package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int meses_año = 12;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuánto te gustaría ganar al año?");
		Integer año = sc.nextInt();
		int mes = año / meses_año;
		System.out.println("Tu sueldo mensual sería de " + mes + " euros");
		sc.close();
	}

}
