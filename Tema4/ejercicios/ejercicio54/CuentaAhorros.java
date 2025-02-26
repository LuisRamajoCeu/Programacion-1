package ejercicio54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class CuentaAhorros {
	private String numeroCuenta;
	private List<Movimientos> movimientos;
	private BigDecimal dineroCuenta;
	public static final String TIPO_CARGOS = "C";
	public static final String TIPO_INGRESOS = "I";
	public static final String TIPO_RETIRADAS = "R";
	public static final String TIPO_TODOS = "T";

	
	public BigDecimal getDineroCuenta() {
		return dineroCuenta;
	}
	public void setDineroCuenta(BigDecimal dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumero(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	
	public CuentaAhorros(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.movimientos = new ArrayList<>();
		this.dineroCuenta = new BigDecimal(0);
	}
	public List
	
	public void añadirMovimiento(Movimientos movimiento) {
		movimientos.add(movimiento);
		this.dineroCuenta.add(movimiento.importe);
	}
	public BigDecimal dineroTotal() {
		BigDecimal saldoTotal = BigDecimal.ZERO;
		
		for(Movimientos mov : movimientos) {
			if(mov.getTipo().equalsIgnoreCase(TIPO_INGRESOS)) {
				saldoTotal = saldoTotal.add(mov.getImporte());
			}else {
				saldoTotal = saldoTotal.subtract(mov.getImporte());
			}
		}
		return saldoTotal.setScale(2,RoundingMode.HALF_DOWN);
	}
	
	public void mostrarMovimientos(String tipo){
		if(tipo.equalsIgnoreCase(TIPO_TODOS)) {
		for(Movimientos mov : movimientos) {
				System.out.println(mov);
		}}else if(tipo.equalsIgnoreCase(TIPO_CARGOS)) {
			Cargos.mostrarCargos();
		}else if(tipo.equalsIgnoreCase(TIPO_INGRESOS)) {
			Ingresos.mostrarIngresos();
		}else if(tipo.equalsIgnoreCase(TIPO_RETIRADAS)) {
			Retiradas.mostrarRetiradas();
		}
	}
	
	
}
