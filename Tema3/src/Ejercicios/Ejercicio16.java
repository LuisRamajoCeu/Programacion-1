package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un texto:");
	String texto = sc.nextLine();
	String textoMin = texto.toLowerCase();
	String[] array = textoMin.split("");
	int cont = 0;
	for(int i = 0; i < array.length; i++) {
		if(array[i].contains("a")) {
			cont++; 	}	}
	System.out.println("Este texto tiene " + cont + " a.");
	
	sc.close();}

}
