package ejercicio07;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
	Sociedad sociedad = new Sociedad();
	Scanner sc = new Scanner(System.in);
	try {/*
		while(true) {
			System.out.print("Introduce el genero: ");
			String genero = sc.nextLine();
			System.out.print("Introduce la altura: ");
			double alturaDob = sc.nextDouble();
			sociedad.addPersona(genero, new BigDecimal(alturaDob));
		}*/
			
		
	sociedad.addPersona("H", new BigDecimal(1.9));
	sociedad.addPersona("H", new BigDecimal(1.77));
	sociedad.addPersona("M", new BigDecimal(1.67));
	sociedad.addPersona("H", new BigDecimal(1.82));	
	sociedad.addPersona("M", new BigDecimal(1.74));	
	sociedad.calcularAlturaMedia("total");
	}catch(ParametroIncorrectoException e) {
		System.out.println(e.getMessage());
	}catch(ListaVaciaException e) {
		System.out.println(e.getMessage());
	}
	
	}

}
