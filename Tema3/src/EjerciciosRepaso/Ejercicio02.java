package EjerciciosRepaso;

public class Ejercicio02 {

	public static void main(String[] args) {
	Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
	Double suma = 0.0;
	int cont = 0;
	for(int i = 0; i < listaNotas.length; i++) {
		if(listaNotas[i] > 4) {
			cont++;
			suma += listaNotas[i];
		}
	}
	Double media = suma/cont;
	System.out.println("Nota media de aprobados: " + media);
	}}
