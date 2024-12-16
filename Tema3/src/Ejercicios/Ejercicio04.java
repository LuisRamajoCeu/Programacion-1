package Ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Solicitar tamaño del array (cantidad de numeros)
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, dime el tamaño del array");
		Integer tam = sc.nextInt();
		// Crear el array con ese tamaño
		Integer[] numeros = new Integer[tam];
		// Recorremos el array y solicitamos un numero 
		// al usuario para meterlo en la posicion i
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el numero de la posicion " + i);
			Integer x = sc.nextInt();
			numeros[i] = x;
			}
		// Recorrer el array para imprimirlo
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
			}
		// Cerramos scanner
		sc.close();	}
}
