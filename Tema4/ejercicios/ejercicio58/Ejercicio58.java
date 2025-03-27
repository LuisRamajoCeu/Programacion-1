package ejercicio58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio58 {
//es el 57
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean salir = true;
		Map<String,List<String>> mapa = new HashMap<>();
		do {
			System.out.println("Escribe una palabra");
			String palabra = sc.nextLine();
			if(palabra.equalsIgnoreCase("FIN")) {
				salir = false;
			}else if(!mapa.containsKey(palabra.substring(0, 1).toUpperCase())) {
				List<String> lista = new ArrayList<String>();
				lista.add(palabra);
				mapa.put(palabra.substring(0,1).toUpperCase(), lista);
			}
		}while(salir);
		
		
		
		
		sc.close();
	}

}
