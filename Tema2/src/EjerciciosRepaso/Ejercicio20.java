package EjerciciosRepaso;

public class Ejercicio20 {

	public static void main(String[] args) {
	for(int columna = 0; columna <5;columna ++) {
		for(int linea = 0; linea < 5; linea++) {
			if(linea == columna) {
				System.out.print("* ");
			}else {
				System.out.print("- ");
			}
		}System.out.println();
	}
		
		
	}

}
