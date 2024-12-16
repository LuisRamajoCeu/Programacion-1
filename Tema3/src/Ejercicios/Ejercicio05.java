package Ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos numeros me vas a dar??");
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
		Integer maximo = numeros[0];
		Integer minimo = numeros[0];
		Integer posMaximo = 0;
		Integer posMinimo = 0;
		Integer suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			System.out.println();
			if (numeros[i] > maximo) {
				maximo = numeros[i];
				posMaximo = i;
			}
			else if (numeros[i] < minimo) {
				minimo = numeros[i];
				posMinimo = i;
			}
			suma = suma + numeros[i];
		}
		Integer media = suma/numeros.length;
		System.out.println("Maximo: " + maximo + " en posicion " + posMaximo);
		System.out.println("Minimo: " + minimo + " en posicion " + posMinimo);
		System.out.println("Media: " + media);
		// Cerramos scanner
		sc.close();
	}
}
