package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		Integer num1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		Integer num2 = sc.nextInt();
		System.out.println("*** MENÚ ***");
		System.out.println("  1. Sumar");
		System.out.println("  2. Restar");
		System.out.println("  3. Multiplicar");
		System.out.println("  4. Dividir");
		System.out.println("  0. Salir");
		System.out.println();
		System.out.println("Elige una opción:");
		Integer eleccion = sc.nextInt();
		if (eleccion == 1) {
			System.out.println("Se ha elegido la opción Sumar.");
			System.out.println("El resultado es: " + num1 + num2);
		} else if (eleccion == 2) {
			System.out.println("Se ha elegido la opción Restar.");
			System.out.println("El resultado es: " + (num1 - num2));
		} else if (eleccion == 3) {
			System.out.println("Se ha elegido la opción Multiplicar.");
			System.out.println("El resultado es: " + num1 * num2);
		} else if (eleccion == 4) {
			System.out.println("Se ha elegido la opción Dividir");
			if (num1 != 0 || num2 != 0) {
				System.out.println("No se puede dividir el 0.");
			} else {
				System.out.println("El resultado es: " + num1 / num2);
			}
		} else if (eleccion == 0) {
			System.out.println("Saliendo");
		} else {
			System.out.println("Esa opción no es correcta");
		}
		sc.close();
	}

}
