package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer descuento;
		System.out.println("¿Cuál es el precio de la unidad?");
		float precio = sc.nextFloat();
		System.out.println("¿Cuántas unidades has comprado?");
		Integer unidades = sc.nextInt();
		if (unidades > 100) {
			descuento = 40;
		} else if (unidades < 100 && unidades > 24) {
			descuento = 25;
		} else if (unidades > 9 && unidades < 25) {
			descuento = 10;
		} else {
			descuento = 0;
		}
		float subtotal = precio * unidades;
		float fin = subtotal - ((subtotal * descuento) / 100);
		System.out.println("El subtotal es: " + subtotal + " euros.");
		System.out.println("El descuento es de: " + ((subtotal * descuento) / 100));
		System.out.println("El total es: " + fin);
		sc.close();
	}

}
