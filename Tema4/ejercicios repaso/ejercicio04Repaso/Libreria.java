package ejercicio04Repaso;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
	private List<Libros> listaLibros;
	private String direccion;
	private Integer numTfno;
	
	public Libreria() {
		this.listaLibros = new ArrayList<>();
	}
	
	public Libros obtenerLibroMasAntiguo(List<Libros> listaLibros) {
		int i = 0;
		if(!listaLibros.isEmpty()) {
		Libros masAntiguo = listaLibros.get(0);
		for(int j = 0; i < listaLibros.size();j++) {
			if(i != 0) {
				Libros libroAnterior = listaLibros.get(j-1);
			if(listaLibros.get(j).getFechaEdicion().isBefore(libroAnterior.getFechaEdicion())) {
				masAntiguo = listaLibros.get(j);
			}
			}
		i = 1;
		}
		return masAntiguo;
		}
		return null;
	}
	
	
	public Integer obtenerPesoTotalDeLibros(List<Libros> listaLibros){
		Integer pesoTotal = 0;
		List<LibrosFisicos> listaFisicos = new ArrayList<>();
		for(int i = 0; i < listaLibros.size(); i++) {
			listaFisicos.addAll(i);
				pesoTotal = pesoTotal + listaLibros.get(i).getPeso();
			
		}
		
		return pesoTotal;
	}
	
	
}
