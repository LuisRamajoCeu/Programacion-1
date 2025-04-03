package ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {
	private List<Integer> lista;

	public SacoNumeros() {
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
		if(posicion == -1) {
			return null;
		}
		return lista.get(posicion);
	}
	
}
