package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Retiradas extends Movimientos{
	public Retiradas(LocalDate fecha, BigDecimal importe) {
		super.fecha = fecha;
		super.importe = importe;
	}

	
	@Override
	public String toString() {
		return "R - "+getFecha()+" - "+getImporte();
	}
}
