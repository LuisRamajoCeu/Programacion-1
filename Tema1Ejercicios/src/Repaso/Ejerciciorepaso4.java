package Repaso;

import java.util.Scanner;

public class Ejerciciorepaso4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime tu número favorito: ");
	Integer numero = sc.nextInt();
	sc.nextLine();
	System.out.println("Dime tu ciudad favorita");
	String ciudad = sc.nextLine();
	System.out.println("Tu número favorito es " + numero + " y tu ciudad favorita es " + ciudad);
	sc.close();
	}

}
