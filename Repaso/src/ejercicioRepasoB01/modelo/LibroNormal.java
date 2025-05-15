package ejercicioRepasoB01.modelo;

import java.math.BigDecimal;

public class LibroNormal extends Libro{
	
	public LibroNormal(String titulo,String autor,String ISBN,BigDecimal precio) {
		super(titulo, autor, ISBN, precio);
	}
	
	@Override
	public BigDecimal getPrecio() {
		return super.getPrecioBase();
	}

	@Override
	public String toString() {
		return "LibroNormal [getPrecio()=" + getPrecio() + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
				+ ", getISBN()=" + getISBN() + "]";
	}
	
	
}
