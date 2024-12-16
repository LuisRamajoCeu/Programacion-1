package Ejercicios;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int suma = 0;
    int numero;
    System.out.println("Introduce números para sumar. Introduce 0 para terminar.");
    do {
        System.out.print("Número: ");
        numero = sc.nextInt();
        suma = numero + suma;
    } while (numero != 0);
    System.out.println("La suma total es: " + suma);
    sc.close();
}
}
	
	


