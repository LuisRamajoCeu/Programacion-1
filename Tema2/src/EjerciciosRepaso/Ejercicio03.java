package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		do {
			System.out.println("*** MENÚ ***");
			System.out.println("  1. Abrir");
			System.out.println("  2. Guardar");
			System.out.println("  3. Modificar");
			System.out.println("  4. Salir");
			System.out.println();
			System.out.println("Elige una opción:");
			numero = sc.nextInt();
			if (numero == 1) {
				System.out.println("Se ha elegido la opción Abrir.");
			} else if (numero == 2) {
				System.out.println("Se ha elegido la opción Guardar.");
			} else if (numero == 3) {
				System.out.println("Se ha elegido la opción Modificar.");
			} else if (numero == 4) {
				System.out.println("Bye Bye");
			} else {
				System.out.println("Esa opción no es correcta");
			}
		} while (numero != 4);
		sc.close();
	}

}
