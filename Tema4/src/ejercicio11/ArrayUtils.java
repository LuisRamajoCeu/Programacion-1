package ejercicio11;

public class ArrayUtils {
	final static Integer MENOSUNO = -1;
	public static void imprimirArray(String[] array) {
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
	public static Integer buscarPalabra(String[] array,String palabra) {
		Integer posicion = 5;
		Boolean existe = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equalsIgnoreCase(palabra)) {
				existe = true;
			}else if(i > 3) {
				existe = false;
			}
		}
			for(int j = 0; j < array.length; j++) {
			if(!existe) {
				return MENOSUNO;
			}else if(array[j].equalsIgnoreCase(palabra)){
				posicion = j;
			}
		}
	return posicion;
	}
}