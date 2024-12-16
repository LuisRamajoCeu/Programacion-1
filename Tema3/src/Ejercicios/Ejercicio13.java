package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una palabra: ");
	String palabra = sc.nextLine();
	String[] letra = palabra.split("");
	for(int i = palabra.length() - 1; i >= 0; i--) {
		System.out.println(letra[i]);
	}
	sc.close();}

}
