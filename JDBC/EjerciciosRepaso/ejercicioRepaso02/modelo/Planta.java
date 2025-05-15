package ejercicioRepaso02.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Planta {
	private int id;
	private String nombre;
	private String tipo;
	private BigDecimal altura;
	private LocalDate fechaPlantacion;
	
	public Planta(int id, String nombre, String tipo, BigDecimal altura) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.altura = altura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public LocalDate getFechaPlantacion() {
		return fechaPlantacion;
	}

	public void setFechaPlantacion(LocalDate fechaPlantacion) {
		this.fechaPlantacion = fechaPlantacion;
	}
	
}
