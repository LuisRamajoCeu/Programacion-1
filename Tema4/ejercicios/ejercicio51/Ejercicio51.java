package ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
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
	List<BigDecimal> numeros = new ArrayList<>();
	//1
		while(numeros.size() < 5) {
			System.out.println("Dame un numero: ");
			BigDecimal num = sc.nextBigDecimal();
				if(!numeros.isEmpty()) {
					BigDecimal ultimo = numeros.get(numeros.size() -1);
				if(num.compareTo(ultimo) > 0) {
					numeros.add(num);
				}else {
					System.err.println("No es mayor que el anterior");
				}
	
				}else {
					numeros.add(num);
				}
		}
		System.out.print("Lista de numeros: ");
		System.out.println(numeros);
		
	//2
		BigDecimal suma = BigDecimal.ZERO;
		for(BigDecimal numero : numeros) {
			suma = suma.add(numero);
		}
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println("Suma redondeada: "+suma);
		
	//3
		BigDecimal division = numeros.get(0).divide(numeros.get(1),3,RoundingMode.HALF_UP);
		System.out.println("Division: "+division);
		
	sc.close();}
}
