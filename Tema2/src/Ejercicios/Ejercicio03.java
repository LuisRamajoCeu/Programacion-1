package Ejercicios;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime el precio del producto sin IVA");
	Double sinIva = sc.nextDouble();
	sc.nextLine();
	System.out.println("Dime cuál es el tipo de IVA que se le aplica:");
	System.out.println("1. Normal (21%)");
	System.out.println("2. Reducido (10%)");
	System.out.println("3. Superreducido (4%)");
	System.out.println("4. Exento (0%)");
	String tipoIva = sc.nextLine();
	if (tipoIva.equals("normal")) {
		System.out.println("El precio con IVA normal es " + (sinIva * 1.21));
	}
	else if (tipoIva.equals("reducido")) {
		System.out.println("El precio con IVA reducido es " + (sinIva * 1.1));
	}
	else if (tipoIva.equals("superreducido")) {
		System.out.println("El precio superreducido con IVA es " + (sinIva * 1.04));
	}
	else if (tipoIva.equals("exento")) {
		System.out.println("No se le aplica IVA entonces el precio es " + sinIva);
		}	
	else {
		System.out.println("Tipo de IVA no válido");
		sc.close();
	}
	
	} 
}
	



