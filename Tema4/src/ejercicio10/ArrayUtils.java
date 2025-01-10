package ejercicio10;

public class ArrayUtils {
	public static void imprimirArray(String[] array) {
		for (String cadena : array) {
			System.out.println(cadena);
		}
	}
	public static String obtenerPalabra(String[] array,Integer n ) {
		if(n >= array.length || n < 0) {
			return " ";
		}else {
		return array[n];}
	}
}
