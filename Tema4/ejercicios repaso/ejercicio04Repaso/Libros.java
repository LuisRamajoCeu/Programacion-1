package ejercicio04Repaso;

import java.time.LocalDate;

public class Libros {
	private String titulo;
	private String autor;
	private LocalDate fechaEdicion;
	private Integer numPaginas;
	
	public Libros(String titulo, String autor, LocalDate fechaEdicion,Integer numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
		this.numPaginas = numPaginas;
		
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
	
	
}
