package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		String todo = " ";
		do {System.out.println("Escribe frases, introduce fin para terminar.");
			frase = sc.nextLine().trim();
			if (!frase.toLowerCase().equals("fin")) {
				todo = todo + frase + " ";}
		} while (!frase.toLowerCase().equals("fin"));
		{System.out.println("Esto es lo que has escrito:" + todo);}
		sc.close();
	}

}
