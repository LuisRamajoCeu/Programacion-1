package EjerciciosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuántas veces quieres lanzar el dado?");
	Integer veces = sc.nextInt();
	Integer tirado = 0;
	while(tirado < veces) {
		tirado++;
		Integer tiradas = random.nextInt(1,7);
		System.out.println(tiradas);
	}
	sc.close();
	}

}
