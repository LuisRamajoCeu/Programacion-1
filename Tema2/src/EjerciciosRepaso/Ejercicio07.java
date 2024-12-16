package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma;
		int num;
		while (true) {
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
			if (num == 0) {
				System.out.println("Programa terminado.");
				break;
			} else if (num > 0 && num <= 10) {
				suma = 0;
				int calculo = 0;
				for (int contador = 0; contador < 10; contador++) {

					calculo = calculo + num;
					if (contador < 9) {
						System.out.print(calculo + " + ");
					} else {
						System.out.print(calculo); 
					}
					suma = suma + calculo;
				}

				System.out.println("= " + suma);
			} else {
				System.out.println("Número inválido. Por favor, introduce un número entre 1 y 10.");
			}
		}

		sc.close();
	}
}
