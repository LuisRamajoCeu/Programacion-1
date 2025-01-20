package ejercicio20;

import ejercicio21.Persona;

public class Alumno extends Persona{
	public Alumno(String dni) {
		super();
		this.dni = dni;
	}
	private String dni;
	private Double nota;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Double aprobar() {
		if(nota < 5.0) {
			nota = 6.0;
		}return nota;
				
	}
	
}
