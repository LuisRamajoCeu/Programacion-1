package EjerciciosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	Integer aleat;
	Integer num;
	Integer cont = -1;
	do{
	aleat = random.nextInt(0,10);
	System.out.println("He pensado un número del 0 al 9, intenta averiguarlo");
	num = sc.nextInt();
	cont++;
	if(num>9 || num<0) {
		System.out.println("El número está entre el 0 y el 9");
	}
	}while(aleat != num); {
	System.out.println("¡Lo has acertado!");
	System.out.println("Has obtenido: " + (10-cont) + " puntos");
	}
	sc.close();}
}
