package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Profesor profesor = new Profesor();
	System.out.println("Introduce el nombre: ");
	String nombre = sc.nextLine();
	profesor.setNombre(nombre);
	System.out.println("Introduce la edad: ");
	Integer edad = sc.nextInt();
	profesor.setEdad(edad);
	
	System.out.println("El profesor se llama: " + profesor.getNombre());
	System.out.println("El profesor tiene: " + profesor.getEdad() + " años.");
	sc.close();}

}
