package examen2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class Arboles {
	private Integer numSerie;
	private LocalDate fechaPlantacion;
	private BigDecimal altura;

	public LocalDate getFechaPlantacion() {
		return fechaPlantacion;
	}

	public void setFechaPlantacion(LocalDate fechaPlantacion) {
		this.fechaPlantacion = fechaPlantacion;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public Integer getNumSerie() {
		return numSerie;
	}

	public Arboles(Integer numSerie) {
		this.numSerie = numSerie;
		this.fechaPlantacion = LocalDate.now();
		this.altura = BigDecimal.ZERO;
	}

	public abstract BigDecimal getAlturaMinimaExport();

	public abstract BigDecimal getPrecioExportCm();

	public Integer getEdad() {
		Period periodo = this.fechaPlantacion.until(LocalDate.now());
		Integer edad = periodo.getMonths() + (periodo.getYears() * 12);
		return edad;
	}

	public abstract Boolean sePuedeExportar();

	@Override
	public int hashCode() {
		return Objects.hash(numSerie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arboles other = (Arboles) obj;
		return Objects.equals(numSerie, other.numSerie);
	}

}
