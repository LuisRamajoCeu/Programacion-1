package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer numeroSerie = 0;
	Integer anterior = 0;
	Integer ultimo = 1;
	Integer nuevoValor;
	do {
		System.out.println("Dame un numero mayor a 2");
		numeroSerie = sc.nextInt();
	}while(numeroSerie <= 2); {
		System.out.println("La serie de fibonacci del número " + numeroSerie);
	}
	System.out.print(anterior + ", " + ultimo);
	for(int serie = 2; serie < numeroSerie; serie++) {
	nuevoValor = anterior + ultimo;
	anterior = ultimo;
	ultimo = nuevoValor;
	System.out.print(", " + nuevoValor);
	}
	sc.close();
	}

}
