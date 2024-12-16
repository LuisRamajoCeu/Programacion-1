package EjerciciosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	Integer empates = 0;
	Integer ganadas = 0;
	Integer perdidas = 0;
	String quererJugar;
	do{
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
		empates++;
	}else if((maquina.equals("piedra") && usuario.equals("papel")) || (maquina.equals("papel") 
			&& usuario.equals("tijera")) 
			|| (maquina.equals("tijera") && usuario.equals("piedra"))) {
		System.out.println("Ganaste");
		ganadas++;
	}else if((maquina.equals("papel") && usuario.equals("piedra")) || (maquina.equals("tijera") 
			&& usuario.equals("papel")) 
			|| (maquina.equals("piedra") && usuario.equals("tijera"))) {
		System.out.println("Perdiste");
		perdidas++;
	}System.out.println("¿Quieres jugar otra?");
	quererJugar = sc.nextLine().trim().toLowerCase();
	}while(quererJugar.equals("si")); {
		System.out.println("Programa terminado.");
		System.out.println("Partidas ganadas: " + ganadas);
		System.out.println("Partidas perdidas: " + perdidas);
		System.out.println("Partidas empates: " + empates);
	}
	
	sc.close();}
}
