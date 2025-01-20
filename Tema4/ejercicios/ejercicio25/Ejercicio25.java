package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Curso curso = new Curso();	
	Integer idCurso = 1;
	String descCurso = "DAM-DAW";
	curso.setDescripcion(descCurso);
	curso.setIdentificador(idCurso);
	
	
	
	Alumno[] alumnos = new Alumno[3]; 
	for(int i = 0; i <alumnos.length; i++) {
	Alumno alumno = new Alumno();
	System.out.println("Introduce el Dni del alumno: ");
	String dni = sc.nextLine();
	alumno.setDni(dni);
	System.out.println("Introduce el Nombre del alumno: ");
	String nombre = sc.nextLine();
	alumno.setNombre(nombre);
	System.out.println("Introduce la edad del alumno: ");
	Integer edad = sc.nextInt();
	alumno.setEdad(edad);
	System.out.println("Introduce la nota del alumno: ");
	Double nota = sc.nextDouble();
	alumno.setNota(nota);
	alumno.setCurso(curso);
	alumnos[i] = alumno;
	System.out.println(alumno.toString());
	}
	for(Alumno alumno : alumnos) {
		System.out.println(alumno);
	}
	if(alumnos[0].equals(alumnos[1]) 
			|| alumnos[1].equals(alumnos[2])
			|| alumnos[0].equals(alumnos[2])){
		System.err.println("Error: hay al menos 2 alumnos iguales");
	}else {
		System.out.println("Felicidades: todos los alumnos son diferentes");
	}
	sc.close();}

}
/*System.out.println("Dime el id del curso");
	Integer idCurso = sc.nextInt();
	sc.nextLine();
	System.out.println("Dime la descripcion del curso");
	String descCurso = sc.nextLine();
		
	curso.setDescripcion(descCurso);
	curso.setIdentificador(idCurso);
	
	System.out.println("DNI: " + alumno.getDni());
	System.out.println("Nombre: " + alumno.getNombre());
	System.out.println("Edad: " + alumno.getEdad());
	System.out.println("Nota: " + alumno.getNota());
	*/