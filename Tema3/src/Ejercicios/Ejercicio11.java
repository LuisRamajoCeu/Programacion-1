package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime tu nombre y tus apellidos: ");
	String nombreCompleto = sc.nextLine();
	String[] espacio = nombreCompleto.split(" ");
	String nombre = espacio[0];
	String apellido1 = espacio[1];
	String apellido2 = espacio[2];
	System.out.println("Nombre: " + nombre + ".");
	System.out.println("Primer apellido: " + apellido1 + ".");
	System.out.println("Segundo apellido: " + apellido2 + ".");
	sc.close();
	}

}
