package Ejercicios;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuánto mides?");
	float altura = sc.nextFloat();
	System.out.println("¿Cuánto pesas?");
	float peso = sc.nextFloat();
	float IMC = peso / (altura*altura);
	System.out.println("Al ser tu altura " + altura + " metros y tu peso " + peso + " kilogramos  Tu IMC es: " + IMC);
	sc.close();
	}

}
