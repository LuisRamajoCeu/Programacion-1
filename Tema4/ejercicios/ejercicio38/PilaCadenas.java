package ejercicio38;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
	
	private List<String> pila;
	
	public PilaCadenas() {
		pila = new ArrayList<>();
	}
	
	public void añadirCadena(String cadena){
		pila.add(cadena);
	}
	public String sacarCadena() {
		if (pila.isEmpty()) {
			return null;
		}
		String cadena = pila.get(pila.size()-1);
		pila.remove(pila.size()-1);
		return cadena;
		//o pila.remove(pila.size()-1);
	}
	
	public Integer getTamaño() {
		return pila.size();
	}

	@Override
	public String toString() {
		return pila.toString();
	}
	
}

