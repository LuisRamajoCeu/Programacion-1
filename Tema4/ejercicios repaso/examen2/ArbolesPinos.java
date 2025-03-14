package examen2;

import java.math.BigDecimal;

public class ArbolesPinos extends Arboles {
	public static final BigDecimal ALTURA_MIN_PINOS = new BigDecimal(100);
	public static final BigDecimal PRECIO_CM_PINOS = new BigDecimal(0.2);

	public ArbolesPinos(Integer numSerie) {
		super(numSerie);
	}

	@Override
	public BigDecimal getAlturaMinimaExport() {
		return ALTURA_MIN_PINOS;
	}

	@Override
	public BigDecimal getPrecioExportCm() {
		return PRECIO_CM_PINOS;
	}

	@Override
	public Boolean sePuedeExportar() {
		Boolean sePuede = false;
		if (super.getAltura().compareTo(ALTURA_MIN_PINOS) >= 0 && getAltura() != null) {
			sePuede = true;
		}
		return sePuede;
	}

}
