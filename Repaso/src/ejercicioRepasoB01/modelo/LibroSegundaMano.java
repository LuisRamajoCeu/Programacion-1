package ejercicioRepasoB01.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LibroSegundaMano extends Libro {
	private Integer antigüedad;
	
	public Integer getAntigüedad() {
		return antigüedad;
	}
	public void setAntigüedad(Integer antigüedad) {
		this.antigüedad = antigüedad;
	}

	public LibroSegundaMano(String titulo,String autor,String ISBN,BigDecimal precio,Integer antigüedad) {
		super(titulo,autor,ISBN,precio);
		this.antigüedad = antigüedad;
	}
	@Override
	public BigDecimal getPrecio() {
		return super.getPrecioBase().divide(BigDecimal.TWO,2,RoundingMode.HALF_UP);
	}
	@Override
	public String toString() {
		return "LibroSegundaMano [antigüedad=" + antigüedad + ", getPrecio()=" + this.getPrecio() + ", getTitulo()="
				+ getTitulo() + ", getAutor()=" + getAutor() + ", getISBN()=" + getISBN() + "]";
	}
	
	
}
