package ejercicio59;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Geografia {
	private Map<String, String> mapa;

	public Geografia() {
		mapa = new HashMap<>();
	}

	public Boolean agregarPais(String pais, String capital) {
		Boolean estaba = mapa.containsKey(pais.toUpperCase());
		String comp = capital.substring(0, 1).toUpperCase() + capital.substring(1).toLowerCase();
		mapa.put(pais.toUpperCase(), comp);
		return estaba;
	}

	public String obtenerCapital(String pais) {
		return mapa.getOrDefault(pais.toUpperCase(), "");
	}

	public String imprimirPaises() {
		String paises = "";
		if (!mapa.isEmpty() && mapa != null) {
			Set<Entry<String, String>> entry = mapa.entrySet();
			for (Entry<String, String> e : entry) {
				paises = paises + "PAIS: " + e.getKey() + " - CAPITAL: " + e.getValue() + "\n";
			}
		}
		return paises;
	}

	public void eliminarPais(String pais) {
		mapa.remove(pais.toUpperCase());
	}

	public BigDecimal calcularLongitudMediaPaises() {
		BigDecimal media = BigDecimal.ZERO;
		BigDecimal cantidad = BigDecimal.ZERO;
		if (!mapa.isEmpty() && mapa != null) {
			Set<String> nombres = mapa.keySet();
			for (String pais : nombres) {
				media = media.add(new BigDecimal(pais.length()));
				cantidad = cantidad.add(BigDecimal.ONE);
			}
			media = media.divide(cantidad, 2, RoundingMode.HALF_UP);
		}
		return media;
	}

	public void eliminarPaisConCapitalLetra(String letra) {
		Set<Entry<String, String>> entry = mapa.entrySet();
		Iterator<Entry<String, String>> it = entry.iterator();
		while (it.hasNext()) {
			if (it.next().getValue().startsWith(letra.toUpperCase())) {
				it.remove();
				break;
			}
		}
	}

	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer count = 0;
		for (String capital : mapa.values()) {
			if (capital.startsWith(letra.toUpperCase())) {
				count++;
			}
		}
		return count;
	}

	public String imprimirNumeroPaisesLetra(String letra) {
		// entryset,foreach,getValue if(capital.startswith(letraUper) imprimir = arriba
		Set<Entry<String,String>> entry = mapa.entrySet();
		
		return count;
	}

	public void mismaLetra() {
		// comparar entryKey y entryValue,bolean
	}

}
