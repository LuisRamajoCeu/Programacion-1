package ejercicio04Repaso;

import java.time.LocalDate;

public class Ejercicio04Repaso {

	public static void main(String[] args) {
		//1
		System.out.println("Apartado 1");
		Libreria libreria = new Libreria();
		libreria.setDireccion("Avda. de los sueños perdidos, 89");
		libreria.setNumTfno(954696954);
		//2
		System.out.println("Apartado 2");
		LibrosFisicos fisico1 = new LibrosFisicos("hola", "Joselito", LocalDate.of(2007,2,24), 213, 12, 20, 312);
		LibrosFisicos fisico2 = new LibrosFisicos("adios", "Pepe", LocalDate.of(2020,6,22), 351, 10, 16, 240);
		//3
		System.out.println("Apartado 3");
		LibrosDigitales digital1 = new LibrosDigitales("hola", "Joselito", LocalDate.of(2005,5,12),162);
		LibrosDigitales digital2 = new LibrosDigitales("adios", "Pepe", LocalDate.of(2015,9,1),231);
		//4
		System.out.println("Apartado 4");
		libreria.getListaLibros().add(fisico1);
		libreria.getListaLibros().add(fisico2);
		libreria.getListaLibros().add(digital1);
		libreria.getListaLibros().add(digital2);
		//5
		System.out.println("Apartado 5");
		System.out.println("Libro mas antiguo: "+libreria.obtenerLibroMasAntiguo(libreria.getListaLibros()));
		System.out.println("Media de paginas: "+libreria.obtenerNumPaginasMedio(libreria.getListaLibros()));
		System.out.println("Peso total: "+libreria.obtenerPesoTotalDeLibros(libreria.getListaLibros()));

		
		
		
	}

}
