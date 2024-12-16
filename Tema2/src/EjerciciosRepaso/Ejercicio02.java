package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una ciudad");
		String ciudad1 = sc.nextLine().trim();
		System.out.println("Dime otra ciudad");
		String ciudad2 = sc.nextLine().trim();
		System.out.println("Dime otra ciudad");
		String ciudad3 = sc.nextLine().trim();
		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();
		if((longitud1 < longitud2) && (longitud2 < longitud3)) {
			System.out.println(ciudad1);
			System.out.println(ciudad2);
			System.out.println(ciudad3);
		}
		if((longitud1 < longitud3) && (longitud3 < longitud2)) {
			System.out.println(ciudad1);
			System.out.println(ciudad3);
			System.out.println(ciudad2);
		}
		if((longitud2 < longitud1) && (longitud1 < longitud3)) {
			System.out.println(ciudad2);
			System.out.println(ciudad1);
			System.out.println(ciudad3);
		}
		if((longitud2 < longitud3) && (longitud3 < longitud1)) {
			System.out.println(ciudad2);
			System.out.println(ciudad3);
			System.out.println(ciudad1);
		}
		if((longitud3 < longitud1) && (longitud1 < longitud2)) {
			System.out.println(ciudad3);
			System.out.println(ciudad1);
			System.out.println(ciudad2);
		}
		if((longitud3 < longitud2) && (longitud2 < longitud1)) {
			System.out.println(ciudad3);
			System.out.println(ciudad2);
			System.out.println(ciudad1);
		}
		
		sc.close();
	}
}

