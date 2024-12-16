package Ejercicios;

import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime tu nombre");
	String nombre = sc.nextLine();
	System.out.println("Dime tu apellido");
	String apellido = sc.nextLine();
	System.out.println("Su nombre completo es: " + nombre + " " + apellido);
	sc.close(); 
	}
}