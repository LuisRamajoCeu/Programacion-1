package ejercicio38;

import java.util.ArrayList;
import java.util.List;

	public class ColaCadenas  {
		
		private List<String> cola;
		
		public ColaCadenas() {
			cola = new ArrayList<>();
		}
		
		public void añadirCadena(String cadena){
			cola.add(cadena);
		}
		public String sacarCadena() {
			
			// si hacemos get(0) y est vacia, da un error
			if (cola.isEmpty()) {
				return null;
			}
			String cadena = cola.get(0);
			cola.remove(0);
			return cadena;
			// o return cola.remove(0)
		}
		
		public Integer getTamaño() {
			return cola.size();
		}

		
		@Override
		public String toString() {
			return cola.toString();
		}
	}

