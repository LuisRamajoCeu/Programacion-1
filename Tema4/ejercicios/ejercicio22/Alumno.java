package ejercicio22;

	public class Alumno {
		private String dni;
		private Double nota;
		private Curso curso;
		private String nombre;
		private Integer edad;
		
		public Alumno(String dni) {
			super();
			this.dni = dni;
		}
		
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
		public Curso getCurso() {
			return curso;
		}

		public void setCurso(Curso curso) {
			this.curso = curso;
		}
}
