package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número");
		Integer numero = sc.nextInt();
		Integer multiplicador = 0;
		Integer multiplicacion;
		System.out.println("*********** LA TABLA DEL NÚMERO " + numero + " ***********");
		while (multiplicador <= 10)	{
			multiplicacion = numero * multiplicador;
			System.out.println(numero + " x " + multiplicador + " = " + multiplicacion);
			multiplicador++;
		}
		sc.close();
	}

}
