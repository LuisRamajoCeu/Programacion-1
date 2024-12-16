package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num;
		Integer suma;
		do {
			System.out.println("Escribe un número mayor que 0: ");
			num = sc.nextInt();
		} while (num < 1);
		{
			suma = 0;
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					suma += i;
				}
			}

		}
		System.out.println("La suma de todos los números impares entre el 1 y el " + num + " es: " + suma);

		sc.close();
	}

}
