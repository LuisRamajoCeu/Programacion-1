package ejercicio21;

import ejercicio22.Curso;

public class Persona extends Curso{
	private String nombre;
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
}
