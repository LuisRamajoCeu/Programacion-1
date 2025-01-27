package ejercicio35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Curso curso = new Curso();	
	Integer idCurso = 1;
	String descCurso = "DAM-DAW";
	curso.setDescripcion(descCurso);
	curso.setIdentificador(idCurso);
		
	List<Alumno> alumnos = new ArrayList<>(); 
	for(int i = 0; i <3; i++) {
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
	alumnos.add(alumno) ;
	System.out.println(alumnos.toString());
	}
	Iterator<Alumno> it = alumnos.iterator();
	while(it.hasNext()) {
		Alumno alumno = it.next();
		System.out.println(alumno);
	}
	
	if(alumnos.get(0).equals(alumnos.get(1)) 
		|| alumnos.get(1).equals(alumnos.get(2))
		|| alumnos.get(0).equals(alumnos.get(2))){
		System.err.println("Error: hay al menos 2 alumnos iguales");
	}else {
		System.out.println("Felicidades: todos los alumnos son diferentes");
	}
	sc.close();
	}
}