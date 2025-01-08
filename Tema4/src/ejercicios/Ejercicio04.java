package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Boolean repetir = true;
	System.out.println("Introduce una cadena: ");
	String cadena = sc.nextLine();
		while (repetir) {
			System.out.println("Introduce 1 o 2: ");
			Integer numero = sc.nextInt();
		sc.close();
			if (numero == 1) {
				String cadenaMayus = Ejercicio03.uno(cadena);
				System.out.println(cadenaMayus);
				repetir = false;
			} else if (numero == 2) {
				String cadenaMinus = Ejercicio03.dos(cadena);
				System.out.println(cadenaMinus);
				repetir = false;
			} else {
				System.out.println("Introduce 1 o 2");
				repetir = true;
				}
			}
		}
	}
