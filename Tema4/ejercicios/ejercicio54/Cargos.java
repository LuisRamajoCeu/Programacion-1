package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cargos extends Movimientos{
	private String cif;
	
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	
	
	public Cargos(LocalDate fecha, BigDecimal importe, String cif) {
		super.fecha = fecha;
		super.importe = importe;
		this.cif = cif;
	}
	
	
	@Override
	public String toString() {
		return "C - "+getFecha()+" - "+getImporte()+" - "+cif;
	}
	
	
}
