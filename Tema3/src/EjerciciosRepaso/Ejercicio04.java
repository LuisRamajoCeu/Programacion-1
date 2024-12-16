package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
	Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
	int cont = 0;
	int a = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Qué nota buscas?");
	Integer nota = sc.nextInt();
	
	for (int i = 0; i < listaNotas.length; i++) {
		if (listaNotas[i] > nota) {
			cont++;
			a = 0;
		}
	}
	if(a == 1) {
		System.out.println("No hay notas mayores");
	}else {
	System.out.println("Hay " + cont + " notas mayores a la indicada");
	sc.close();
	}}
}
