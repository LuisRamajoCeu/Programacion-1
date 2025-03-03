package ejercicio02Repaso;

import java.math.BigDecimal;

public class Movil extends Telefono{
	private BigDecimal longitud;
	private BigDecimal latitud;
	public Movil(Integer numero,BigDecimal longitud,BigDecimal latitud) {
		super(numero);
		this.longitud = longitud;
		this.latitud = latitud;
	}
}
