package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una dirección web en "
	+ "este formato (PROTOCOLO://PARTE1.PARTE2.PARTE3):");
	String direccion = sc.nextLine().trim();
	String[] array1 = direccion.split(".//");
	String parte2 = array1[1];
	String[] array2 = parte2.split("\\.");
	System.out.println(array1[0] + "://");
	for (String parte : array2) {
	System.out.println(parte);
	}
	sc.close();}

}
