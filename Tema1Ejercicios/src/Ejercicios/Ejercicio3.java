package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos años tienes?");
		Integer edad = sc.nextInt();
		System.out.println("Su edad es " + edad + " años");
		sc.close();
		sc.close();
	}
}
