package ejercicio29;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {
	private String dni;
	private Double nota;
	private Curso curso;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni.toUpperCase(); //Ej 26
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	/*public Double aprobar() {
		if(nota < 5.0) {
			nota = 6.0;
		}return nota;
					
	}*/
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", curso=" + curso + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(curso, dni, edad, nombre, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
			if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}
		
	public Boolean validarDNI(String dni) {
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");	 
		Matcher match = patron.matcher(dni); 
			return (match.matches() && dni != null && dni.length() == 9);
		}
		public Boolean validarNombre(String nombre) { 
				return (nombre != null && nombre.length() >= 10);
		}
		public Boolean validarEdad(Integer edad) { 
			return (edad != null && edad >= 10 && edad <= 65);
		}
		
		
}
