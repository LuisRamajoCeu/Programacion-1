package ejercicio06;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();
		try {
			while (true) {
				try {
					System.out.println("Programa iniciado, escribe 'salir' para terminar");
					if(sc.nextLine().equals("salir")) {
						break;
					}
					System.out.print("Introduce el género: ");
					String genero = sc.nextLine();
					persona.setGenero(genero);
					System.out.print("Introduce la altura: ");
					Integer alturaInt = sc.nextInt();
					BigDecimal altura = new BigDecimal(alturaInt);
					persona.setAltura(altura);
					System.out.println(persona);
					sc.nextLine();
				} catch (ParametroIncorrectoException e) {
					System.out.println(e.getMessage());
				}
			}
		} finally {
			System.out.println("Programa terminado");
			sc.close();
		}
	}

}
