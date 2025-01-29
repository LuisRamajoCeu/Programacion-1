package ejercicio37;

public class Ejercicio37 {

	public static void main(String[] args) {
	ColaCadenas colaCadenas = new ColaCadenas();
	
	colaCadenas.añadirCadena("primero");
	colaCadenas.añadirCadena("segundo");
	System.out.println(colaCadenas.sacarCadena());
	colaCadenas.añadirCadena("tercero");
	System.out.println(colaCadenas.toString());
	colaCadenas.añadirCadena("cuarto");
	System.out.println(colaCadenas.sacarCadena());
	}
}
