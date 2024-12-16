package Repaso;

import java.util.Scanner;

public class Ejerciciorepaso2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime un número");
	int num1 = sc.nextInt();
	System.out.println("Dime otro número");
	int num2 = sc.nextInt();
	int resultado = (num1 * num2);
	System.out.println("El resultado es " + resultado);
	sc.close();
	}

}
//Al poner numeros muy grandes da error//