package ejercicio19;

public class Alumno {
	
	private String dni;
	private String nombre;
	private Integer edad;
	private Double nota;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
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

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Double aprobar() {
		if(nota < 5.0) {
			nota = 5.0;
		}return nota;
				
	}
}
