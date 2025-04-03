package ejercicio05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros5 {
	private List<Integer> lista;

	public SacoNumeros5() {
		this.lista = new ArrayList<>();
	}

	public void addNumeros(Integer num) {
		if (num != -1) {
			lista.add(num);
		}
	}

	@Override
	public String toString() {
		return "Lista=" + lista;
	}

	public Integer getNumero(Integer posicion) {
		if (posicion == -1) {
			return null;
		}
		return lista.get(posicion);
	}

	public BigDecimal division() {
		try {
			BigDecimal resultado = new BigDecimal(lista.get(0));
			for(int i = 1; i < lista.size();i++) {
				BigDecimal siguiente = new BigDecimal(lista.get(i));
				resultado = resultado.divide(siguiente,2,RoundingMode.HALF_UP);
			}
			return resultado;
		}
		catch(ArithmeticException e) {
			return BigDecimal.ZERO;
		}
		catch(IndexOutOfBoundsException e) {
			return BigDecimal.ZERO;
		}finally {
			System.out.println("División completa");
		}
	}
}
