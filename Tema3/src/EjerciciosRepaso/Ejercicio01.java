package EjerciciosRepaso;

public class Ejercicio01 {

	public static void main(String[] args) {
	Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
	int suspensos = 0;
	for(int i = 0; i < listaNotas.length; i++) {
		if(listaNotas[i] < 5) {
			suspensos++;
		}
	}
	System.out.println("Total alumnos suspensos: " + suspensos);
	}}
