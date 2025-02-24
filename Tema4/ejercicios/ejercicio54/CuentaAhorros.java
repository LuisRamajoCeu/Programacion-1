package ejercicio54;

import java.math.BigDecimal;
import java.util.List;

public class CuentaAhorros {
	private BigDecimal numero;
	private List<Movimientos> movimientos;
	public BigDecimal getNumero() {
		return numero;
	}
	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}
	public List<Movimientos> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimientos> movimientos) {
		this.movimientos = movimientos;
	}
	
	public CuentaAhorros(BigDecimal numero) {
		this.numero = numero;
	}
	public void añadirMovimiento(Movimientos movimiento) {
		movimientos.add(movimiento);
	}
	public Double dineroTotal() {
		
		return null;
	}
	
}
