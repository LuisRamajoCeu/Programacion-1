package ejercicioRepasoB01.modelo;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Libro {
	private String titulo;
	private String autor;
	private String ISBN;
	private BigDecimal precio;
	private BigDecimal precioBase;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public abstract BigDecimal getPrecio();
	public BigDecimal getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	
	public Libro(String titulo,String autor,String ISBN,BigDecimal precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.precioBase = precio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(ISBN, other.ISBN);
	}
	
	
	
	
}
