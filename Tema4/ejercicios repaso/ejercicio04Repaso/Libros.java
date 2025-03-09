package ejercicio04Repaso;

import java.time.LocalDate;

public abstract class Libros {
	private String titulo;
	private String autor;
	private LocalDate fechaEdicion;
	private Integer numPaginas;
	
	public Libros(String titulo, String autor, LocalDate fechaEdicion,Integer numPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
		this.numPaginas = numPaginas;
		
	}
	
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

	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public Integer getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public abstract Integer getPeso();
	
	public String toString() {
		return "titulo=" + titulo + ", autor=" + autor + ", fechaEdicion=" + fechaEdicion + ", paginas="
				+ numPaginas;

	}
}
