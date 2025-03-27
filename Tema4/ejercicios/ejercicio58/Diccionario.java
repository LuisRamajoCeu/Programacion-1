package ejercicio58;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String,List<String>> mapa;
	
	public void cargarDiccionario(List<String> lista) {

	}
	
	public void borrarDiccionario() {
		mapa.clear();
	}
	
	public String imprimirPalabras(String letra) {
		String palabras = "";
		for(int i = 0; i < mapa.get(letra).size(); i++) {
			palabras = palabras + " " + mapa.get(letra).get(i);
		}
		return palabras;
	}
}
