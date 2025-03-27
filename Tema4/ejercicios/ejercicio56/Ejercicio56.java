package ejercicio56;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num;
		Integer cantidadNumeros = 0;
		Map<Integer, Integer> numeros = new HashMap<>();
		do {
			System.out.println("Escribe un  numero");
			num = sc.nextInt();
			if (numeros.get(num) == null) {
				numeros.put(num, 1);
			} else {
				numeros.put(num, numeros.get(num) + 1);
			}
			if (num != 0) {
				cantidadNumeros++;
			}
		} while (num != 0);
		System.out.println("Total números indicados: " + cantidadNumeros);
		System.out.println("Distribución:");
		Set<Entry<Integer, Integer>> distribucion = numeros.entrySet();
		for (Entry<Integer, Integer> n : distribucion) {
			if (n.getKey() != 0) {
				System.out.print("\t> Número: " + n.getKey());
				if (n.getValue() > 1) {
					System.out.println(": " + n.getValue() + " veces");
				} else {
					System.out.println(": " + n.getValue() + " vez");
				}
			}
		}

		sc.close();
	}
}
