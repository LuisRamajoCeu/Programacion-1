package ejercicio27;

import java.util.Objects;

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
			return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + ", nombre=" + nombre + ", edad="
					+ edad + "]";
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
			return (dni != null && dni.length() == 9);
		}
		
		
}
