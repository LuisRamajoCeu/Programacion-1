package ejercicio41;

import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	Jugador jugador1 = new Jugador("Marcelo", 12);
    Jugador jugador2 = new Jugador("Courtois", 1);
    Jugador jugador3 = new Jugador("Carvajal", 2);
    Equipo equipo = new Equipo("Real Madrid C.F.");
    equipo.setCapitan(jugador1);
    equipo.getJugadores().add(jugador2);
    equipo.getJugadores().add(jugador3);

    System.out.println(equipo);
    sc.close();}
}
