package ejercicio55;

import java.math.BigDecimal;

public class Ejercicio55 {

	public static void main(String[] args) {
	//1
	Evaluacion evaluacion = new Evaluacion();
	
	//2
	System.out.println("Apartado 2");
	evaluacion.addNota("2332323D", new BigDecimal(7.2));
	evaluacion.addNota("6332363F", new BigDecimal(5.2));
	evaluacion.addNota("0912399Z", new BigDecimal(9.1));
	evaluacion.addNota("7561323B", new BigDecimal(3.2));
	evaluacion.addNota("2913853R", new BigDecimal(4.9));
	System.out.println(evaluacion);
	
	//3
	System.out.println("Apartado 3");
	evaluacion.addNota("2332323D", new BigDecimal(8.5));
	System.out.println(evaluacion);
	
	//4
	System.out.println("Apartado 4");
	evaluacion.corregirNota("2332323D", new BigDecimal(8));
	evaluacion.corregirNota("2332323H", new BigDecimal(7));	
	System.out.println(evaluacion);
	
	//5
	System.out.println("Apartado 5");
	System.out.println(evaluacion.obtenerNotaAlumno("7561323B"));
	System.out.println(evaluacion.obtenerNotaMedia());
	
	//6
	System.out.println("Apartado 6");
	System.out.println(evaluacion.obtenerCantidadAprobados());
	
	//7
	System.out.println("Apartado 7");
	System.out.println(evaluacion.obtenerSuspensos());
	
	//8
	System.out.println("Apartado 8");
	evaluacion.borrarAprobados();
	System.out.println(evaluacion);
	
	}

}
