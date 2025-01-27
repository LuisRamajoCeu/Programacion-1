package ejercicio34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> listaCadenas = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe una cadena");
			String cadena = sc.nextLine();
			listaCadenas.add(cadena);
		}
		System.out.println(listaCadenas.toString());
		for (int i = 0; i < 5; i++) {
			String cadena = listaCadenas.get(i);
			String cadenaMay = cadena.toUpperCase();
			System.out.print(cadenaMay + " ");
		}
		System.out.println();

		if (listaCadenas.contains("")) {
			System.err.println("Tiene una cadena vacía");
		}
		Iterator<String> it = listaCadenas.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 6) {
				it.remove();
			}
		}
		System.out.println(listaCadenas.toString());
		sc.close();
	}

}
