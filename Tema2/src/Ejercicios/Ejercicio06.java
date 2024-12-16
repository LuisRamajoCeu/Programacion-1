package Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		while (contador <= 5) {
			System.out.println("Mi nombre es Luis. Linea " + contador);
			contador++;
		}
		sc.close();
	}

}
