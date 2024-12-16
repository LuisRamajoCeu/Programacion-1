package EjerciciosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
	int aleat = random.nextInt(1,4);
	String maquina = "a";
	if(aleat == 1) {
		maquina = "piedra";
	}else if(aleat == 2) {
		maquina = "papel";
	}else if(aleat == 3) {
		maquina = "tijera";
	}
	String usuario = sc.nextLine().trim().toLowerCase();
	System.out.println(maquina);
	if(maquina.equals(usuario)) {
		System.out.println("Empate");
	}else if((maquina.equals("piedra") && usuario.equals("papel")) || (maquina.equals("papel") && 
			usuario.equals("tijera")) 
			|| (maquina.equals("tijera") && usuario.equals("piedra"))) {
		System.out.println("Ganaste");
	}else if((maquina.equals("papel") && usuario.equals("piedra")) || (maquina.equals("tijera") && 
			usuario.equals("papel")) 
			|| (maquina.equals("piedra") && usuario.equals("tijera"))) {
		System.out.println("Perdiste");
	}
	sc.close();
	}
}
