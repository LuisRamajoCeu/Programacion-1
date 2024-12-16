package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
	int[]cuadr = new int[6];
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe un número");
	int c = sc.nextInt();
	for(int i = 0; i < cuadr.length; i++) {
		int m = c*c;
		cuadr[i]=m;
		c++;
	}for(int s = 0; s < cuadr.length; s++) {
		System.out.println(cuadr[s]);
	}
	
	
	sc.close();}

}
