package ejercicio29;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
	Boolean dniCorrecto = false;
	Boolean nombreCorrecto = false;
	Boolean edadCorrecto = false;

	Scanner sc = new Scanner(System.in);
	Curso curso = new Curso();	
	Integer idCurso = 1;
	String descCurso = "DAM-DAW";
	curso.setDescripcion(descCurso);
	curso.setIdentificador(idCurso);
	
	Alumno[] alumnos = new Alumno[3]; 
	for(int i = 0; i <alumnos.length; i++) {
	Alumno alumno = new Alumno();
	do {
	System.out.println("Introduce el Dni del alumno: ");
	String dni = sc.nextLine();
	if(!alumno.validarDNI(dni)) {
		System.err.println("Dni no valido");
	}else {
		dniCorrecto = true;
		alumno.setDni(dni);
	}
	System.out.println("Introduce el Nombre del alumno: ");
	String nombre = sc.nextLine();
	if(!alumno.validarNombre(nombre)) {
		System.err.println("Nombre no valido");
	}else {
		nombreCorrecto = true;
		alumno.setNombre(nombre);
	}
	System.out.println("Introduce la edad del alumno: ");
	Integer edad = sc.nextInt();
	if(!alumno.validarEdad(edad)) {
		System.err.println("Edad no valida");
	}else {
		edadCorrecto = true;
		alumno.setEdad(edad);
	}
	if(curso == null) {
		System.err.println("Curso no valido");
	}
	}while(!dniCorrecto && !nombreCorrecto && !edadCorrecto && curso != null); 
	alumno.setCurso(curso);
	alumnos[i] = alumno;
	System.out.println(alumno.toString());
	}
	sc.close();}

}
