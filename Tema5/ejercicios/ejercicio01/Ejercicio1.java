package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		try {
			Integer n;
			do {
				System.out.println("Escribe numeros enteros: ");
				n = sc.nextInt();
				list.add(n);
			} while (n != -1);
			System.out.println("No se puede meter el numero -1");
		} finally {
			Iterator<Integer> it = list.iterator();
			while (it.hasNext()) {
				if (it.next() == -1) {
					it.remove();
				}
			}
			System.out.println(list);
			sc.close();
		}
	}

}
