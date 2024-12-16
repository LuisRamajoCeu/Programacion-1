package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una palabra: ");
	String palabra = sc.nextLine();
	Integer carac = palabra.length();
	for(int i = carac - 1; i>=0; i--) {
		System.out.print(palabra.charAt(i));
	}
	sc.close();	
	}

}
