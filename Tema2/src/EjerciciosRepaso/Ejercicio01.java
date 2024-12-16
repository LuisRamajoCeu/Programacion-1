package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Dime tu año de nacimiento");
		Integer año = sc.nextInt();
		Integer suma = (2030 - año);
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + suma + " años.");
		sc.close();
	}

}
