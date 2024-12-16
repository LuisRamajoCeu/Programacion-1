package Ejercicios;

public class Ejercicio16 {

	public static void main(String[] args) {
		Integer suma = 0;
		for (int contador = 1; contador <= 10000; 
				contador++)
			suma += contador;
		System.out.println("La suma de los números"
				+ " del 1 al 10000 es: " + suma);
	}
}
