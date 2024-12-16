package Ejercicios;
import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿En qué año naciste?");
	int año = sc.nextInt();
	if (año >= 1883 && año <= 1900) {
		System.out.println("Perteneces a la Generación perdida");
	}
	else if (año >= 1901 && año <= 1927) {
		System.out.println("Perteneces a la Generación grandiosa");
	}
	else if (año >= 1928 && año <= 1945) {
		System.out.println("Perteneces a la Generación silenciosa");
	}
	else if (año >= 1946&& año <= 1964) {
		System.out.println("Perteneces a la Generación de Baby Boomers");
	}
	else if (año >= 1965 && año <= 1980) {
			System.out.println("Perteneces a la Generación X");
	}
	else if (año >= 1981 && año <= 1996) {
			System.out.println("Perteneces a la Generación Y");
	}
	else if (año >= 1997 && año <= 2012) {
			System.out.println("Perteneces a la Generación Z");
	}
	else if (año >= 2013 && año <= 2020) {
			System.out.println("Perteneces a la Generación Alfa");
	}
	sc.close();
		

	}

}
