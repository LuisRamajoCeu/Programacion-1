package ejercicio04Repaso;

import java.time.LocalDate;

public class LibrosFisicos extends Libros{
	
	private Integer ancho;
	private Integer alto;
	private Integer peso;
	
	public LibrosFisicos(String titulo, String autor, LocalDate fechaEdicion, Integer numPaginas,Integer ancho,Integer alto,Integer peso) {
		super(titulo, autor, fechaEdicion, numPaginas);
		this.ancho = ancho;
		this.alto = alto;
		this.peso = peso;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return super.toString() + " - ancho: "+ this.ancho+ " - alto: "+this.alto+" - peso: "+this.peso;
	}
	
}
