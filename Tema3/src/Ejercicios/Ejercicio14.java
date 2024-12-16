package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe una frase: ");
	String fraseInicial = sc.nextLine();
	String[] Array = fraseInicial.split(" ");
	String primMinus = Array[0].toLowerCase();
	for(int i = 1; i < Array.length; i++) {
	primMinus += Array[i].substring(0,1).toUpperCase() 
	+ Array[i].substring(1).toLowerCase();
	}
	System.out.println(primMinus);
	sc.close();}

}
