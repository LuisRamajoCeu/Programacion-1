package Ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
	int[]pares = new int[15];
	Integer i;
	Integer p = 0;
	for(i = 0; i < 15; i++) {
		p = p + 2;
		pares[i] = p;
	}for(int s = 0; s < pares.length; s++) {
		System.out.println(pares[s]);
	}
	}
}