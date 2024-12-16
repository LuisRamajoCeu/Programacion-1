package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio07 {
	public static final Double P_FIJO = 0.24;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] dividir1 = null;
		int cont = 0;
		System.out.println("Escribe tu telegrama");
		String frase = sc.nextLine();
		dividir1 = frase.split(" ");
		for (int i = 0; i < dividir1.length; i++) {
			if (dividir1[i].equalsIgnoreCase("STOP")) {
				cont++;
			}
		}
		Double longitud = (double) (dividir1.length - cont);

		System.out.println("El precio es " + longitud * P_FIJO);

		sc.close();
	}

}
