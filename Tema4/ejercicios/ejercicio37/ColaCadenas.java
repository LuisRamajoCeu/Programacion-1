package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	private List<String> colaEspera; 
	public ColaCadenas() {
		colaEspera = new ArrayList<>();
	}
	public void añadirCadena(String cadena) {
		colaEspera.add(cadena);
	}
	
	public String sacarCadena() {
		if(colaEspera.isEmpty()) {
				return null;
		}else {
			String cadena = colaEspera.get(0);
			colaEspera.remove(0);
			return cadena;
		}
		
	}
	public Integer getTamaño() {
		return colaEspera.size();
	}
	@Override
	public String toString() {
		String string = "ColaCadenas [colaEspera=" + colaEspera + "]";
		colaEspera.clear();
		return string;
	}
	
}
