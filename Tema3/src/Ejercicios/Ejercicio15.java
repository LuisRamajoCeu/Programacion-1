package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Pedimos nombre completo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame el n�mero");
		String numero = scanner.nextLine();
		//vamos a comprobar si es capicua
		String[] digitos = numero.split("");
		Boolean capicua = true;
		for(int ini=0, fin=digitos.length-1;ini<fin; ini++,fin-- )
		{ String digito1 = digitos[ini];
		String digitoUlt = digitos[fin];
		System.out.println("ini: " + digito1);
		System.out.println("fin: " + digitoUlt);
		if (!digito1.equals(digitoUlt)) {
		capicua = false;
		break;	}	}
			System.out.println();
			System.out.println();
			//otra forma
			int fin = digitos.length-1;
			for(int ini=0 ;ini<fin; ini++ )
			{				
			String digito1 = digitos[ini];
			String digitoUlt = digitos[fin];
			System.out.println("ini: " + digito1);
			System.out.println("fin: " + digitoUlt);
			if (!digito1.equals(digitoUlt)) {
				capicua = false;
				break;	}
				fin--;	}
			if (capicua) {
				System.out.println("Es capic�a!!");	}
				else {
					System.out.println("No es capic�a...");	}
				scanner.close();
	}
}
