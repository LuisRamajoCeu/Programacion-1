package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SacoNumeros5 list = new SacoNumeros5();
		try {
			Integer n = 0;
			Integer p = 0;
			do {
				try {
					System.out.println("Escribe numeros enteros: ");
					n = sc.nextInt();
					list.addNumeros(n);
				} catch (InputMismatchException a) {
					System.out.println("No se puede meter letras");
					sc.nextLine();
				}
			} while (n != -1);
			do {
				try {
					System.out.println("Escribe una posicion de la lista: ");
					p = sc.nextInt();
					if (p >= 0) {
						System.out.println(list.getNumero(p));
					}
				} catch (InputMismatchException a) {
					System.out.println("No se puede meter letras");
					sc.nextLine();
				} catch (IndexOutOfBoundsException e) {
					sc.nextLine();
					String u = null;
					System.out.println(u);
				}
			} while (p != -1);
		} finally {
			System.out.println(list);
			System.out.println("Que división quieres: ");
			Integer div = sc.nextInt();
			System.out.println(list.division()); 
			sc.close();
		}
	}

}
