package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota buscas?");
		Integer nota = sc.nextInt();
		int a = 1;
		for (int i = 0; i < listaNotas.length; i++) {
			if (nota.equals(listaNotas[i])) {
				System.out.println("La nota buscada existe y está en la posición " + i);
				a = 0;
				break;
			}
		}
		if (a == 1) {
			System.out.println("La nota buscada no existe");
		}
		sc.close();
	}

}
