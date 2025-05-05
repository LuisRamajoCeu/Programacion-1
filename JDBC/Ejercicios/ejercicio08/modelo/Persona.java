package ejercicio08.modelo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ejercicio08.servicio.DatosIncompletosException;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fechaNacimiento;

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento.toLocalDate();
	}

	public void setFechaNacimientoLocalDate(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean validar() throws DatosIncompletosException {
		if (dni.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || fechaNacimiento == null) {
			throw new DatosIncompletosException();
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento="
				+ DateTimeFormatter.ofPattern("dd/MM/yyyy").format(fechaNacimiento) + "]";
	}

}
