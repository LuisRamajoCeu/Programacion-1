package ejercicioRepasoB01.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Libreria {
	private String nombre;
	private Map<String,Libro> mapa;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Map<String, Libro> getMapa() {
		return mapa;
	}
	public void setMapa(Map<String, Libro> mapa) {
		this.mapa = mapa;
	}
	
	public Libreria(String nombre) {
		this.nombre = nombre;
		this.mapa = new HashMap<String,Libro>();
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public BigDecimal getTasacionCompleta() {
		BigDecimal tasacion = BigDecimal.ZERO;
		Collection<Libro> libros = mapa.values();
		for(Libro l : libros) {
			tasacion = tasacion.add(l.getPrecio());
		}
		return tasacion;
	}
	
	public BigDecimal getPrecioMedio() {
		BigDecimal precioTotal = BigDecimal.ZERO;
		int cont = 0;
		Collection<Libro> libros = mapa.values();
		for(Libro l : libros) {
			precioTotal = precioTotal.add(l.getPrecio());
			cont++;
		}
		if(cont != 0) {
		return precioTotal.divide(new BigDecimal(cont), 2,RoundingMode.HALF_UP);
		}else {
			return precioTotal;
		}
	}
	
	public List<Libro> getLibrosBaratos(){
		List<Libro> lista = new ArrayList<>();
		Collection<Libro> libros = mapa.values();
		for(Libro l : libros) {
			if(l.getPrecio().compareTo(new BigDecimal(10)) >= 0) {
				lista.add(l);
			}
		}
		return lista;
	}
	
}
