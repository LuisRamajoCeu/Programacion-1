package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer tam;
	do {
	System.out.println("¿Cuántos números quieres?");
	tam = sc.nextInt();
		}while(tam <= 2); 
	Integer[] fibo = new Integer[tam];
	fibo[0] = 0;
	fibo[1] = 1;
	for(int i = 2; i < fibo.length; i++) {
		fibo[i] = fibo[i-1] + fibo[i-2];
	}
	for(int i = 0; i < fibo.length; i++) {
		System.out.println(fibo[i] + " ");
	}
	
	sc.close();}
}
