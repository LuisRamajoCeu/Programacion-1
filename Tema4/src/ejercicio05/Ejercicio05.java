package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		Integer n1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		Integer n2 = sc.nextInt();
		Integer resultado = sumar(n1, n2);
		System.out.println("La suma es: " + resultado);
		sc.close();
	}
	public static Integer sumar(Integer n1, Integer n2) {
		Integer suma = n1 + n2;
		return suma;
	}
}
