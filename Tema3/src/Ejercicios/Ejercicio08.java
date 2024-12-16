package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuántos números quieres?");
	Integer tam = sc.nextInt();
	// Crear el array con ese tamaño
	Integer[] numeros = new Integer[tam];		
	// Recorremos el array y solicitamos un numero 
	// al usuario para meterlo en la posicion i
	for (int i = 0; i < numeros.length; i++) {
		System.out.println("Dame el numero de la posicion " + i);
		Integer n = sc.nextInt();
		numeros[i] = n;
	}
	for(int i = 0, j = numeros.length-1; i < j; i++, j--) {
		Integer auxiliar = numeros [i];
		numeros[i] = numeros[j];
		numeros[j] = auxiliar;
	}
	// Recorrer el array para imprimirlo
	for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i] + " ");
	}
	sc.close();
	}
}