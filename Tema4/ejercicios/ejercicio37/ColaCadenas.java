package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	List<String> colaEspera = new ArrayList<>();
	public void añadirCadena(String cadena) {
		colaEspera.add(cadena);
	}
	public String sacarCadena() {
		if(colaEspera.size() > 0) {
			return colaEspera.get(0);
		}else {
			return null;
		}
	}
}
