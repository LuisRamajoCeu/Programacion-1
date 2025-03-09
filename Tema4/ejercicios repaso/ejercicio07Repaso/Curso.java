package ejercicio07Repaso;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Curso {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private BigDecimal precio;
	private Integer numPlazasTotales;
	private Integer numPlazasOcupadas;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Integer getNumPlazasTotales() {
		return numPlazasTotales;
	}
	public void setNumPlazasTotales(Integer numPlazasTotales) {
		this.numPlazasTotales = numPlazasTotales;
	}
	public Integer getNumPlazasOcupadas() {
		return numPlazasOcupadas;
	}
	public void setNumPlazasOcupadas(Integer numPlazasOcupadas) {
		this.numPlazasOcupadas = numPlazasOcupadas;
	}


	public Curso(String nombre, BigDecimal precio, Integer numPlazasTotales) {
		this.nombre = nombre;
		this.precio = precio;
		this.numPlazasTotales = numPlazasTotales;
		this.numPlazasOcupadas = 0;
	}
	
	public Integer getDuracionCurso() {
		Period periodo = fechaInicio.until(fechaFin);
		Integer duracionCurso = periodo.getMonths() + periodo.getYears() * 12;
		return duracionCurso;
	}
	
	public Boolean isPlazasLibres() {
		Boolean isLibre = false;
		if((numPlazasTotales - numPlazasOcupadas) > 0) {
			isLibre = true;
		}
		return isLibre;
	}
	
	public BigDecimal getPrecioMes() {
		BigDecimal precioMes = this.precio.divide(new BigDecimal(this.getDuracionCurso()),2, RoundingMode.HALF_UP);
		return precioMes;
	}
	
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precio="
				+ precio + ", numPlazasTotales=" + numPlazasTotales + ", numPlazasOcupadas=" + numPlazasOcupadas + "]";
	}
	
	
	
	
}
