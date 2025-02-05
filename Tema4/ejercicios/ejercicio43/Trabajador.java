package ejercicio43;

public abstract class Trabajador {
	private String nombre;
	private Integer fechaNacimiento; 
	private String nacionalidad;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Integer fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public abstract void getSueldo();
}

