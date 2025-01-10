package ejercicio07;

public class Ejercicio07 {

	public static void main(String[] args) {

		Integer resultado = Ejercicio07Calculadora.sumar(4, 2);
		System.out.println(resultado);

		resultado = Ejercicio07Calculadora.restar(4, 2);
		System.out.println(resultado);

		resultado = Ejercicio07Calculadora.multiplicar(4, 2);
		System.out.println(resultado);

		resultado = Ejercicio07Calculadora.dividir(4, 2);
		System.out.println(resultado);

		resultado = Ejercicio07Calculadora.dividir(4, 0);
		System.out.println(resultado);
	}
}
