package Repaso;
import java.util.Scanner;
public class Ejerciciorepaso3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime un número");
	String num1 = sc.nextLine();
	System.out.println("Dime otro número");
	String num2 = sc.nextLine();
	Integer num1a = Integer.parseInt(num1);
	Integer num2a = Integer.parseInt(num2);
	Integer resultado = (num1a * num2a);
	System.out.print("El resultado es " + resultado);
	sc.close();
	}

}
