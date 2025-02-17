package ejercicio49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio49 {

	public static void main(String[] args) {
	//0
	Scanner sc = new Scanner(System.in);
	Set<String> listaCadenasSet = new HashSet<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe una cadena");
			String cadena = sc.nextLine();
			listaCadenasSet.add(cadena);
		}
	System.out.println(listaCadenasSet);
	//1
	Set<String> listaCadenasSetMayus = new HashSet<>();
	for(String cadena : listaCadenasSet) {
		String cadenaMayus = cadena.toUpperCase();
		listaCadenasSetMayus.add(cadenaMayus);
	}
	listaCadenasSet = listaCadenasSetMayus;
	System.out.println(listaCadenasSet);
	
	System.out.println();
	//2
		if (listaCadenasSet.contains("")) {
			System.err.println("Tiene una cadena vacía");
		}
	//3
	Iterator<String> it = listaCadenasSet.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 6) {
				it.remove();
			}
		}
	System.out.println(listaCadenasSet.toString());
	sc.close();
	}
}
