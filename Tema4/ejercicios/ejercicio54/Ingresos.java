package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ingresos extends Movimientos{
	private String descripcion;

	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Ingresos(LocalDate fecha, BigDecimal importe, String descripcion) {
		super.fecha = fecha;
		super.importe = importe;
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		return "I - "+getFecha()+" - "+getImporte()+" - "+descripcion;
	}
	
}
