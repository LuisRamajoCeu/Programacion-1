package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String contraseña;
	String susti;
	do {
		System.out.println("Introduce una contraseña de al menos 8 carácteres");
		contraseña = sc.nextLine().trim();
		susti = contraseña.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0").replaceAll("t", "7");
		
	}while(contraseña.length() < 8); {
		System.out.println(susti);
	}
	sc.close();
	}

}
