package app;

import servicio.PersonasServicio;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonasServicio p = new PersonasServicio();
		System.out.print("Escribe el dni: ");
		String dniPedido = sc.nextLine();
		p.consultarPersona(dniPedido);
		
	}

}
