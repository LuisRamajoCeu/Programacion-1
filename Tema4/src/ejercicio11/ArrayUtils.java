package ejercicio11;

public class ArrayUtils {
	/*public static void imprimirArray(String[] array) {
		for (String cadena : array) {
			System.out.println(cadena);
		}
	}
	public static String obtenerPalabra(String[] array,Integer n ) {
		if(n >= array.length) {
			return " ";
		}else {
		return array[n];}
	}
	*/
	public static Integer buscarPalabra(String[] array,String palabra) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].equalsIgnoreCase(palabra)) {
				return i;}
		}
	return -1;
	}
}