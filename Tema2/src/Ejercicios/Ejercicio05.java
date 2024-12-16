package Ejercicios;

public class Ejercicio05 {

	public static void main(String[] args) {
		Integer contador = 1;
		Integer suma = 0;
		while (contador <= 10000) {
			suma = suma + contador;
			contador = contador + 1;
		}
		System.out.println("El resultado es: " + suma);
	}
}
