package Ejercicios;

public class Ejercicio17 {

	public static void main(String[] args) {
	Double[] arrayDecimales = new Double[] {5.4,3.1,9.0,4.7};
	Double suma = 0.0;
	for(Double decimales : arrayDecimales) {
		System.out.print(decimales + "\t");
		suma += decimales;	}
	System.out.println("\n" + "La suma es: " + suma);	}
}
