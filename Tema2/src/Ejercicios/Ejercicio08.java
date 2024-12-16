package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num1;
		Integer num2;
		do {
			System.out.println("Dime un número: ");
			num1 = sc.nextInt();
			System.out.println("Dime otro número: ");
			num2 = sc.nextInt();
		} while (!num1.equals(num2));
		{
			System.out.println("Adiós.");
		}
		sc.close();

	}

}
