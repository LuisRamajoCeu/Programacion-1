package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número mayor que 0: ");
		Integer num = sc.nextInt();
		for (int columna = 0; columna < num; columna++) {
			for (int linea = 0; linea < num; linea++) {
				if (linea == columna) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
sc.close();
	}

}
