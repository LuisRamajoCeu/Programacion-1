package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimientos {
	protected BigDecimal importe;
	protected LocalDate fecha;
	
	
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	
	
		
	
}
