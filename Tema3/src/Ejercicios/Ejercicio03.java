package Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuántos números quieres?");
	Integer tam = sc.nextInt();
	// Crear el array con ese tamaño
	Integer[] numeros = new Integer[tam];		
	// Recorremos el array y solicitamos un numero 
	// al usuario para meterlo en la posicion i
	for (int i = 0; i < numeros.length; i++) {
		System.out.println("Dame el n�mero de la posici�n " + i);
		Integer x = sc.nextInt();
		numeros[i] = x;					
	}
	// Recorrer el array para imprimirlo
	for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i] + " ");
	}
	sc.close();
	}
}