package ejercicio04Repaso;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
	private List<Libros> listaLibros;
	private String direccion;
	private Integer numTfno;
	
	public Libreria() {
		listaLibros = new ArrayList<>();
	}
	
	public List<Libros> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libros> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumTfno() {
		return numTfno;
	}

	public void setNumTfno(Integer numTfno) {
		this.numTfno = numTfno;
	}

	public Libros obtenerLibroMasAntiguo(List<Libros> listaLibros) {
if(listaLibros!=null &&  !this.listaLibros.isEmpty()) {
			
			Libros old = this.listaLibros.get(0);
			for (Libros libro : this.listaLibros) {
				//si es mas antigua que la que tengo:
				if(libro.getFechaEdicion().isBefore(old.getFechaEdicion())) {
					old = libro; //me quedo con el libro nuevo
				}
			}
			return old;
		}
		return null;		
	}

	
	
	public Integer obtenerPesoTotalDeLibros(List<Libros> listaLibros){
		Integer pesoTotal = 0;
		for (Libros libro : this.listaLibros) {			
			pesoTotal += libro.getPeso();			
		}
		return pesoTotal;
	}
	
	public Double obtenerNumPaginasMedio(List<Libros> listaLibros) {
		Double totalPaginas = 0.0;
		Double libros = 0.0;
		if(!listaLibros.isEmpty() && listaLibros!=null) {
		for (Libros libro : this.listaLibros) {
			totalPaginas += libro.getNumPaginas();
			libros ++;
		}
		if(libros > 0.0) {
			return totalPaginas/libros;
		}
		}
		return libros;
	}
	
	
	
}
