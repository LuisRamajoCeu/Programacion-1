package ejercicio51;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
	/*BigDecimal x = new BigDecimal("220");
	System.out.println(x);
	DecimalFormat f = new DecimalFormat("-#,###.00 €");
	System.out.println(f.format(x));
	System.out.println(f.format(x.negate()));
	*/
	Scanner sc = new Scanner(System.in);
	//1
		System.out.println("Escribe un número");
		Double n1 = sc.nextDouble();
		BigDecimal n1B = new BigDecimal(n1);
		System.out.println("Escribe otro número");
		Double n2 = sc.nextDouble();
		BigDecimal n2B = new BigDecimal(n2);
		System.out.println("Escribe otro número");
		Double n3 = sc.nextDouble();
		BigDecimal n3B = new BigDecimal(n3);
		System.out.println("Escribe otro número");
		Double n4 = sc.nextDouble();
		BigDecimal n4B = new BigDecimal(n4);
		System.out.println("Escribe otro número");
		Double n5 = sc.nextDouble();
		BigDecimal n5B = new BigDecimal(n5);
		/////////
			for(int i = 0; i < 5; i++) {
			
		}
			
		
	sc.close();}
}
