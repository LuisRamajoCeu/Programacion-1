package ejercicio57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra = "";
		String letra = "";
		Integer contador = 0;
		List<String> palabras = new ArrayList<>();
		do {
			System.out.println("Escribe una palabra, usa FIN para terminar:");
			palabra = sc.nextLine();
			if (!palabra.equals("FIN")) {
				palabras.add(palabra);
			}
		} while (!palabra.equals("FIN"));
		
		
		do {
			contador = 0;
			Map<String, List<String>> mapa = new HashMap<>();
			System.out.print("Dime una letra: ");
			letra = sc.nextLine();
			List<String> palabrasConLetra = new ArrayList<>();
			for (String p : palabras) {
				if (p.substring(0, 1).equalsIgnoreCase(letra)) {
					palabrasConLetra.add(p);
					mapa.put(letra, palabrasConLetra);
					contador++;
				}
			}
			Set<Entry<String, List<String>>> pares = mapa.entrySet();
			for (Entry<String, List<String>> par : pares) {
				System.out.println("Hay " + contador + " palabras que empiezan por: " + par.getKey());
				for (int i = 0; i < par.getValue().size(); i++) {
					System.out.println("\t> " + par.getValue().get(i));
				}
			}
			
		} while (!letra.equals("FIN"));
		System.out.println("¡Gracias por jugar con nosotros! Bye");

		sc.close();
	}

}
