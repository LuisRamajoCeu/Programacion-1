package ejercicio03Repaso;

import java.math.BigDecimal;

public class Ejercicio03Repaso {

	public static void main(String[] args) {
		//1
		System.out.println("Apartado 1");
		LocalizacionGPS gps = new LocalizacionGPS(new BigDecimal(234.212313), new BigDecimal(222.224744));
		Movil movil = new Movil(654654654, gps);
		Fijo fijo = new Fijo(954954954,"Calle 2, Casa 32");
		//2
		System.out.println("Apartado 2");
		System.out.println(movil.consultarNumero());
		System.out.println(fijo.consultarNumero());
		//3
		System.out.println("Apartado 3");
		movil.marcar(654654654);
		//4
		System.out.println("Apartado 4");
		movil.marcar(610610610);
		//5
		System.out.println("Apartado 5");
		movil.colgar();
		//6
		System.out.println("Apartado 6");
		movil.colgar();

	}

}
