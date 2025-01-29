package ejercicio38;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
	private List<String> pilaEspera; 
	public PilaCadenas() {
		pilaEspera = new ArrayList<>();
	}
	public void añadirCadena(String cadena) {
		pilaEspera.add(cadena);
	}
	public String sacarCadena() {
		if(pilaEspera.isEmpty()) {
				return null;
		}else {
			String cadena = pilaEspera.get(pilaEspera.size()-1);
			pilaEspera.remove(p -1);
			return cadena;
		}
	}
	public Integer getTamaño() {
		Integer tamaño = pilaEspera.size();
			return tamaño;
		}
}
