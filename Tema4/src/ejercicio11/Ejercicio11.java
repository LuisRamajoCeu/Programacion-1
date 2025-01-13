package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		String[] array = { "Hola", "Como", "Estas", "Hoy" };
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Introduce un número del 0 al 3");
		Integer n = sc.nextInt();
		
		ArrayUtils.imprimirArray(array);
		
		System.out.println("*******************");
		String cad = ArrayUtils.obtenerPalabra(array, n);
		System.out.println(cad);
		
		System.out.println("*******************");
		*/
		System.out.println("Escribe una palabra del array: ");
		String palabra = sc.nextLine();
		Integer i = ArrayUtils.buscarPalabra(array, palabra);
		System.out.println(i);
		sc.close();
	}

}
