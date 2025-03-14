package examen2;

import java.math.BigDecimal;

public class ArbolesFrutales extends Arboles {
	public static final BigDecimal ALTURA_MIN_FRUTALES = new BigDecimal(150);
	public static final BigDecimal PRECIO_CM_FRUTALES = new BigDecimal(0.5);

	private String especie;

	public ArbolesFrutales(Integer numSerie, String especie) {
		super(numSerie);
		this.especie = especie;
	}

	@Override
	public BigDecimal getAlturaMinimaExport() {
		return ALTURA_MIN_FRUTALES;
	}

	public String getEspecie() {
		return especie;
	}

	@Override
	public BigDecimal getPrecioExportCm() {
		return PRECIO_CM_FRUTALES;
	}

	@Override
	public Boolean sePuedeExportar() {
		Boolean sePuede = false;
		if (super.getAltura().compareTo(ALTURA_MIN_FRUTALES) >= 0 && getAltura() != null) {
			sePuede = true;
		}
		return sePuede;
	}

}
