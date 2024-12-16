package Ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuántos números quieres?");
	Integer tam = sc.nextInt();
	// Crear el array con ese tamaño
	Integer[] numeros = new Integer[tam];
	Integer[] numeros2 = new Integer[tam];	
		// Recorremos el array y solicitamos un numero 
		// al usuario para meterlo en la posicion i
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el numero de la posicion " + i);
			Integer x = sc.nextInt();
			numeros[i] = x;
		}
		// Recorrer el array para imprimirlo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		//Segundo array
		System.out.println();
		for(int i = 0, j = numeros.length-1; i < numeros2.length; i++, j--) {
			numeros2[i] = numeros[j];
		}
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i] + " ");
		}
		sc.close();
	}
}
