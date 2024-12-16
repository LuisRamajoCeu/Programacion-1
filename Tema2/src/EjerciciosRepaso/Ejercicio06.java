package EjerciciosRepaso;

public class Ejercicio06 {

	public static void main(String[] args) {
		int suma = 0;
		for (int num = 3; num <= 30; num += 3) {
			System.out.print(num);
			if (num < 30) {
				System.out.print(" + ");
			}
			suma += num;
		}
		System.out.print(" = " + suma);
	}
}
