package EjerciciosRepaso;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		int num;
		do {
			System.out.println("1 - Pasar de Pesetas a Euros");
			System.out.println("2 - Pasar de Euros a Pesetas");
			System.out.println("3 - Salir");
			System.out.println("Selecciona una opción: ");
			num = sc.nextInt();
			Double pesEuro = 0.00601;
			Double euroPes = 166.386;
			if (num == 1) {
				System.out.println("Introduce el valor en pesetas: ");
				Float pesetas = sc.nextFloat();
				System.out.println("El valor en euros es: " + df.format(pesEuro * pesetas));
				System.out.println();
			}
			if (num == 2) {
				System.out.println("Introduce el valor en euros: ");
				Integer euros = sc.nextInt();
				System.out.println("El valor en euros es: " + df.format(euroPes * euros));
				System.out.println();
			}
		} while (num == 1 || num == 2);
		{
			if (num == 3) {
				System.out.println("Programa terminado");
			}
		}

		sc.close();
	}

}
