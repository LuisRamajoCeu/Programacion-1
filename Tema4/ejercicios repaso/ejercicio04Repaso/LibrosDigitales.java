package ejercicio04Repaso;

import java.time.LocalDate;

public class LibrosDigitales extends Libros{
	public LibrosDigitales(String titulo, String autor, LocalDate fechaEdicion, Integer numPaginas) {
		super(titulo, autor, fechaEdicion, numPaginas);
		
	}
	@Override
	public Integer getPeso() {
		return 0;
	}


	@Override
	public String toString() {
		return super.toString();
	}

}
