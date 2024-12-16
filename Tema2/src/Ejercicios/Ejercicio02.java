package Ejercicios;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuánto mides?");
	float altura = sc.nextFloat();
	System.out.println("¿Cuánto pesas?");
	float peso = sc.nextFloat();
	float imc = peso / (altura*altura);
	System.out.println("Al ser tu altura " + altura + " metros y tu peso " + peso + " kilogramos  Tu IMC es: " + imc);
	if (imc < 18.5) {
		System.out.println("Tienes un peso inferior al normal");
	}
	else if (imc >= 18.5 && imc <= 24.9) {
		System.out.println("Tienes un peso normal");
	}
	else if (imc >= 25.0 && imc <= 29.9) {
		System.out.println("Tienes un peso superior al normal");
	}
	else if (imc > 30.0) {
		System.out.println("Tienes obesidad");
	}
	sc.close();
	} 
}
