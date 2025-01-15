package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Introduce el Dni del alumno: ");
	String dni = sc.nextLine();
	System.out.println("Introduce el Nombre del alumno: ");
	String nombre = sc.nextLine();
	System.out.println("Introduce la edad del alumno: ");
	Integer edad = sc.nextInt();
	System.out.println("Introduce la nota del alumno: ");
	Double nota = sc.nextDouble();

	Alumno alumno1 = new Alumno(dni);
	//alumno1.setDni(dni);
	alumno1.setNombre(nombre);
	alumno1.setEdad(edad);
	alumno1.setNota(nota);
	System.out.println("DNI: " + alumno1.getDni());
	System.out.println("Nombre: " + alumno1.getNombre());
	System.out.println("Edad: " + alumno1.getEdad());
	System.out.println("Nota: " + alumno1.getNota());
	System.out.println("Nota aprobada: " + alumno1.aprobar());
		
	sc.close();
	}

}
