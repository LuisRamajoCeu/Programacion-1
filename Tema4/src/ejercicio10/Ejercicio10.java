package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		String[] array = { "Hola", "Como", "Estas", "Hoy" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número del 0 al 3");
		Integer n = sc.nextInt();
		sc.close();
		ArrayUtils.imprimirArray(array);
		
		System.out.println("*******************");
		String cad = ArrayUtils.obtenerPalabra(array, n);
		System.out.println(cad);
	}

}
