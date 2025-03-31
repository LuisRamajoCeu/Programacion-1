package ejercicio5;

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

	public BigDecimal division(int posicion) {
		List<BigDecimal> listaDivision = new ArrayList<BigDecimal>();
		try {
			if (lista.size() > 1) {
				for (int i = 0; i < lista.size() - 1; i = i + 2) {
					try {
						BigDecimal anterior = new BigDecimal(lista.get(i));
						BigDecimal actual = new BigDecimal(lista.get(i + 1));
						if (lista.get(i) == 0 || lista.get(i + 1) == 0) {
							throw new ArithmeticException();
						} else {
							listaDivision.add(anterior.divide(actual, 2, RoundingMode.HALF_UP));
						}
						if (lista.size() % 2 != 0) {
							throw new ArithmeticException();
						}
					} catch (ArithmeticException ar) {
						listaDivision.add(BigDecimal.ZERO);
					}
				}
			} else {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException ar) {
			listaDivision.add(BigDecimal.ZERO);
		} finally {
			System.out.println("La división de esa posicion es: ");
		}
		try {
		return listaDivision.get(posicion);
		}catch(IndexOutOfBoundsException i) {
			return BigDecimal.ZERO;
		}
	}
}
