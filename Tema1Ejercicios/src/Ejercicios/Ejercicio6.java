package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		double dato_iva = 0.21;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es el precio sin IVA?");
		double noiva = sc.nextFloat();
		double iva = noiva * dato_iva;
		System.out.println("El IVA aplicado es " + iva);
		double total = iva + noiva;
		System.out.println("El precio final es " + total);
		sc.close();
	}

}
