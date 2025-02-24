package ejercicio53;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Hucha {
	private BigDecimal ahorros;
	Boolean negativo = false;
	BigDecimal cero = ahorros;
	public Hucha() {
		this.ahorros = BigDecimal.ZERO.setScale(2);
	}
	public BigDecimal meterDinero(BigDecimal importe) {
		if(negativo) {
			this.ahorros = cero;
			negativo = false;
			return ahorros;
		}
		this.ahorros = ahorros.add(importe);
		return ahorros;
	}
	public BigDecimal sacarDinero(BigDecimal importe) {
		
		if(ahorros.compareTo(importe) >= 0) {
		this.ahorros = ahorros.subtract(importe);
		return ahorros;
		}else{
			cero = ahorros;
			negativo = true;
			ahorros = BigDecimal.ZERO;
			return ahorros;
		}
	}
	public BigDecimal contarDinero() {
		return ahorros;
	}
	public BigDecimal romperHucha() {
		BigDecimal romper = ahorros;
		this.ahorros = BigDecimal.ZERO;
		return romper;
	}
	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00€");
		String ahorrosFormateado = formato.format(ahorros);
		return "En la hucha hay: " + ahorrosFormateado;
	}
	
	
}
