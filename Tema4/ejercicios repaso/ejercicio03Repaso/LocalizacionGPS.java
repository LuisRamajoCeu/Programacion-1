package ejercicio03Repaso;

import java.math.BigDecimal;

public class LocalizacionGPS {
	private BigDecimal latitud;
	private BigDecimal longitud;
	
	public BigDecimal getLatitud() {
		return latitud;
	}
	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}
	public BigDecimal getLongitud() {
		return longitud;
	}
	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}
	
	public LocalizacionGPS(BigDecimal latitud, BigDecimal longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
}
