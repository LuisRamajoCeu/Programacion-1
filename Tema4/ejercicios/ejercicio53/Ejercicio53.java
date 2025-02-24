package ejercicio53;

import java.math.BigDecimal;

public class Ejercicio53 {

	public static void main(String[] args) {
	//1
		System.out.println("------Apartado 1----");
		Hucha hucha = new Hucha();
		System.out.println(hucha);
	
	//2
		System.out.println("------Apartado 2----");
		hucha.meterDinero(new BigDecimal(100));
		System.out.println(hucha);
	
	//3
		System.out.println("------Apartado 3----");
		hucha.meterDinero(new BigDecimal(50.501));
		System.out.println(hucha);
	
	//4
		System.out.println("------Apartado 4----");
		hucha.sacarDinero(new BigDecimal(20.5));
		System.out.println(hucha);
		
	//5
		System.out.println("------Apartado 5----");
		hucha.sacarDinero(new BigDecimal(200));
		System.out.println(hucha);
		
	//6
		System.out.println("------Apartado 6----");
		hucha.meterDinero(new BigDecimal(200));
		System.out.println(hucha);
		
	//7
		System.out.println("------Apartado 7----");
		BigDecimal contado = hucha.contarDinero();
		hucha.meterDinero(contado);
		System.out.println(hucha);
	//8
		System.out.println("------Apartado 8----");
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
	
	}

}
