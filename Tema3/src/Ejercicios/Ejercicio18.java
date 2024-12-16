package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un texto:");
	String palabra = sc.nextLine();
	String[] array = palabra.split("");
	for(String deletreo : array) {
		System.out.println(deletreo);
	}
	sc.close();}

}
