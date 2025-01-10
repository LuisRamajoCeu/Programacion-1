package ejercicio06;

import java.util.Scanner;

import ejercicio05.Ejercicio05;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		Integer n1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		Integer n2 = sc.nextInt();
		Integer resultado = Ejercicio05.sumar(n1, n2);
		System.out.println("La suma es: " + resultado);
		sc.close();
	}
	}
