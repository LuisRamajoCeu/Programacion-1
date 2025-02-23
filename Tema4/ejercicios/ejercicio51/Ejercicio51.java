package ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
		Boolean mayor = false;
		if(n2B.compareTo(n1B) > 0 && n3B.compareTo(n2B) > 0 && n4B.compareTo(n3B) > 0 && n5B.compareTo(n4B) > 0) {
			mayor = true;
			}
		int i = 0;
		while(!mayor) {
		if(n2B.compareTo(n1B) > 0 && n3B.compareTo(n2B) > 0 && n4B.compareTo(n3B) > 0 && n5B.compareTo(n4B) > 0) {
			mayor = true;
			}
		if(i == 0) {
			System.err.println("Cada numero tiene que ser mayor al anterior");
			}
			i =1;
			System.out.println("Escribe un número");
			n1 = sc.nextDouble();
			n1B = new BigDecimal(n1);
			System.out.println("Escribe otro número");
			n2 = sc.nextDouble();
			n2B = new BigDecimal(n2);
			System.out.println("Escribe otro número");
			n3 = sc.nextDouble();
			n3B = new BigDecimal(n3);
			System.out.println("Escribe otro número");
			n4 = sc.nextDouble();
			n4B = new BigDecimal(n4);
			System.out.println("Escribe otro número");
			n5 = sc.nextDouble();
			n5B = new BigDecimal(n5);
		
		}
		//2
			BigDecimal suma = n1B.add(n2B).add(n3B).add(n4B).add(n5B);
			BigDecimal sumaRedondeada = suma.setScale(1,RoundingMode.HALF_DOWN);
			System.out.println(sumaRedondeada);
		//3
			BigDecimal division = n1B.divide(n2B, 3, RoundingMode.HALF_UP);
			System.out.println(division);
	sc.close();}
}
