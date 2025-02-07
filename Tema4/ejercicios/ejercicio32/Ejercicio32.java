package ejercicio32;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
	//1
	Reloj reloj1 = new Reloj();
	System.out.println(reloj1);
	
	//2
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce la horas:");
	Integer horasReloj1 = sc.nextInt();
	System.out.println("Introduce los minutos:");
	Integer minutosReloj1 = sc.nextInt();
	System.out.println("Introduce los segundos:");
	Integer segundosReloj1 = sc.nextInt();
	reloj1.ponerEnHora(horasReloj1, minutosReloj1, segundosReloj1);
	System.out.println(reloj1);
	
	//3
	reloj1.setFormato24horas(false);
	System.out.println(reloj1);
	
	//4
	reloj1.ponerEnHora(24,17);	
	System.out.println(reloj1);
	
	//5
	reloj1.ponerEnHora(21,82);	
	System.out.println(reloj1);
	
	//6
	reloj1.ponerEnHora(17,16,15);	
	System.out.println(reloj1);
	
	//7
	Reloj reloj2 = new Reloj(17,16,15);
	System.out.println(reloj2);
		
	//8
	if(reloj1.equals(reloj2)) {
		System.out.println("Son iguales");
	}else {
		System.out.println("Son diferentes");
	}
	
	
	sc.close();}
}
