package examen2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Plantacion {
	private String cif;
	private List<Arboles> listaArboles;

	public Plantacion(String cif) {
		this.cif = cif;
		this.listaArboles = new ArrayList<>();
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public void addArbol(Arboles arbol) {
		this.listaArboles.add(arbol);
	}

	public List<Arboles> getArbolesAnualidad(Integer año) {
		List<Arboles> arbolesAño = new ArrayList<>();
		if (!listaArboles.isEmpty() && listaArboles != null) {
			for (int i = 0; i < this.listaArboles.size(); i++) {
				Integer añoArbol = listaArboles.get(i).getFechaPlantacion().getYear();
				if (añoArbol == año) {
					arbolesAño.add(listaArboles.get(i));
				} else if (i == this.listaArboles.size() - 1) {
					return null;
				}
			}
		} else {
			return null;
		}
		return arbolesAño;
	}

	public BigDecimal getAlturaTotal() {
		BigDecimal alturaTotal = BigDecimal.ZERO;
		if (!listaArboles.isEmpty() && listaArboles != null) {
			for (Arboles arbol : listaArboles) {
				alturaTotal = alturaTotal.add(arbol.getAltura());
			}
		}
		// He usado el rounding del dividir porque no sabia como hacerlo al multiplicar
		BigDecimal redondear = alturaTotal.divide(new BigDecimal(1), 2, RoundingMode.HALF_UP);
		return redondear;
	}

	public BigDecimal calcularGananciaExportacion() {
		BigDecimal ganancia = BigDecimal.ZERO;
		if (!listaArboles.isEmpty() && listaArboles != null) {
			for (Arboles arbol : listaArboles) {
				if (arbol.sePuedeExportar()) {
					ganancia = ganancia.add(arbol.getPrecioExportCm().multiply(arbol.getAltura()));
				}
			}
			return ganancia;
		} else {
			return BigDecimal.ZERO;
		}
	}

	public void exportarArboles() {
		if (!listaArboles.isEmpty() && listaArboles != null) {
			for (int i = 0; i < listaArboles.size(); i++) {
				if (listaArboles.get(i).sePuedeExportar()) {
					listaArboles.remove(i);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Plantacion " + cif + " - " + listaArboles.size() + " árboles con " + getAlturaTotal() + " cm totales";
	}

}
