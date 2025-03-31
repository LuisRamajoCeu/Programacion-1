package ejercicio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			List<Integer> list = new ArrayList<>();
			Integer n = 0;
			do {
				try {
					System.out.println("Escribe numeros enteros: ");
					n = sc.nextInt();
					if (!n.equals(-1)) {
						list.add(n);
					}
				} catch (InputMismatchException a) {
					System.out.println("No se puede meter letras");
					sc.nextLine();
				}
			} while (n != -1);
			System.out.println(list);
		} finally {
			sc.close();
		}
	}
}
