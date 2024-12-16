package Ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cu�ntos n�meros me vas a dar??");
		Integer tam = scanner.nextInt();
		// Crear el array con ese tama�o
		Integer[] numeros = new Integer[tam];
		// Recorremos el array y solicitamos un n�mero al usuario para meterlo en la posici�n i
		for (int i = 0; i < numeros.length; i++) { System.out.println("Dame el n�mero de la posici�n " + i);
			Integer x = scanner.nextInt();
			numeros[i] = x; 	}
		// Cerramos scanner
		scanner.close();												
		// Recorrer el array para imprimirlo
		for (int i = 0; i < numeros.length; i++) {System.out.print(numeros[i] + " ");}
		System.out.println();
		// Ahora ordenamos el array
		for (int i = 0; i < numeros.length; i++) {
			Integer menor = numeros[i];
			for (int j = i; j < numeros.length; j++) {
				if (numeros[j] < menor) {
					// Intercambio la posici�n i con la j (pongo el menor donde tiene que estar)
					numeros[i] = numeros[j];
					numeros[j] = menor;
					menor = numeros[i];	}}
			numeros[i] = menor;	}
		// Recorrer el array para imprimirlo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

	}

}
