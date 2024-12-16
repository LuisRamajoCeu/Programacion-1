package Repaso;
import java.util.Scanner;
public class Ejerciciorepaso1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuál es el radio del círculo?");
	float radio = sc.nextFloat();
	double circunferencia = ((2*3.14) * radio);
	System.out.println("La circunferencia mide " + circunferencia + " metros.");
	double area = ((radio * radio) * 3.14);
	System.out.println("El area dada ese radio es de " + area + " metros cuadrados.");
	sc.close();
	}

}
