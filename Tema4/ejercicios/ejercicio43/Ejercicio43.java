package ejercicio43;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio43 {

	public static void main(String[] args) {
	// apartado 1
		Actor blasActor = new Actor();
		blasActor.setNombre("Blas Blau");
		blasActor.setNacionalidad("España");
		blasActor.setFechaNacimiento(1983);
		Actor lauraActor = new Actor();
		lauraActor.setNombre("Laura Pozo");
		lauraActor.setNacionalidad("Italia");
		lauraActor.setFechaNacimiento(1981);
		Actor marcelActor = new Actor();
		marcelActor.setNombre("Marcel Cade");
		marcelActor.setNacionalidad("Suiza");
		marcelActor.setFechaNacimiento(2001);
		Actor violetaActor = new Actor();
		violetaActor.setNombre("Violeta Volo");
		violetaActor.setNacionalidad("Rusia");
		violetaActor.setFechaNacimiento(1999);
	
	// apartado 2
		Director saraDirector = new Director();
		saraDirector.setNombre("Sara Marea");
		saraDirector.setNacionalidad("Portugal");
		saraDirector.setFechaNacimiento(1994);
	
	// apartado 3
		Guionista marcoGuionista = new Guionista();
		marcoGuionista.setNombre("Marco Smith");
		marcoGuionista.setNacionalidad("Reino Unido");
		marcoGuionista.setFechaNacimiento(1988);
		Guionista chengGuionista = new Guionista();
		chengGuionista.setNombre("Cheng Shu");
		chengGuionista.setNacionalidad("China");
		chengGuionista.setFechaNacimiento(1977);
	
	// apartado 4
		Pelicula pelicula4 = new Pelicula();
		pelicula4.setFechaEstreno(2027);
		pelicula4.setTitulo("Do you know Joe Blas?");
		List<Actor> lista4 = new ArrayList<>();
		lista4.add(blasActor);
		lista4.add(lauraActor);
		
		pelicula4.setDirector(saraDirector);
		pelicula4.setGuionista(marcoGuionista);
		System.out.println(pelicula4.toString());
	
	// apartado 5
		
		
	// apartado 6
		System.out.println(pelicula4.getActores());
	}

}
