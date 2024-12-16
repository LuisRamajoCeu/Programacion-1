package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número por pantalla: ");
		Integer numero = sc.nextInt();
		Integer multiplicacion;
		for (Integer multiplicador = 0; multiplicador <= 10; multiplicador++) {
			multiplicacion = numero * multiplicador;
			System.out.println(numero + " x " + multiplicador + " = " + multiplicacion);
		}
		sc.close();
	}

}
