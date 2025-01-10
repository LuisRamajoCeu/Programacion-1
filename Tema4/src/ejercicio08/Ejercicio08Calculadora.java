package ejercicio08;

public class Ejercicio08Calculadora {
	
	/**
	 * Devuelve la suma de a y b
	 * @param a primer entero a sumar
	 * @param b segundo entero a sumar
	 * @return la suma de a y b 
	 */	
	public static Integer sumar(Integer a, Integer b) {
		return a+b;
	}
	
	/**
	 * Realiza  la resta de a y b
	 * @param a es el minuendo
	 * @param b es el sustraendo
	 * @return el resultado de la operación de restar a y b
	 */
	public static Integer restar(Integer a, Integer b) {
		return a-b;
	}
	
	/**
	 * Realiza la multiplicación de dos números a y b
	 * @param a es el primer número a multiplicar
	 * @param b es el segundo número a multiplicar
	 * @return el resultado de multiplicar a y b
	 */
	public static Integer multiplicar(Integer a, Integer b) {
		return a*b;
	}
	
	/**
	 * Realiza la división de a y b
	 * @param a Es el dividendo de la operación
	 * @param b Es el divisor de la operación
	 * @return el cociente de la operación. El resultado de dividir a entre b. 
	 */
	public static Integer dividir(Integer a, Integer b) {
		
		if(b==0)
			return 0;
		else
			return a/b;
			
		/* otra forma:
		 
		if(b==0)
			return 0;
		return a /b;
		*/
	
	}
	
	public static final String SUMAR ="ADD";
	public static final String RESTAR ="SUB";
	public static final String MULTIPLICAR ="MUL";
	public static final String DIVIDIR ="DIV";

	
	public static Integer calcular(String operacion, Integer a, Integer b) {
		if(operacion.equals(SUMAR)) {
			return sumar(a,b);
	}else if(operacion.equals(RESTAR)) {
			return restar(a,b);
	}else if(operacion.equals(MULTIPLICAR)) {
			return multiplicar(a,b);
	}else{
			return dividir(a,b);
	}
		
	
}
}