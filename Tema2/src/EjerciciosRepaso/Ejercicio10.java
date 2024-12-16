package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una dirección web en este formato (PROTOCOLO://PARTE1.PARTE2.PARTE3):");
		String direccion = sc.nextLine().trim();
		String http = direccion.substring(0, direccion.lastIndexOf("/") + 1);
		System.out.println(http);
		String www = direccion.substring((direccion.lastIndexOf("/") + 1), direccion.indexOf("."));
		System.out.println(www);
		String google = direccion.substring((direccion.indexOf(".") + 1), direccion.lastIndexOf("."));
		System.out.println(google);
		String com = direccion.substring(direccion.lastIndexOf(".") + 1);
		System.out.println(com);
		sc.close();
	}

}
