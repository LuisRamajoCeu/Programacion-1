package ejercicio42;

//import java.util.List;
import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el nombre del primer equipo");
		String nombreEquipo = sc.nextLine();
		Equipo equipo1 = new Equipo(nombreEquipo);
		/*
		 * cargarJugadores(sc, equipo1); System.out.println(equipo1);
		 */
		System.out.println("Dime el nombre del segundo equipo");
		nombreEquipo = sc.nextLine();
		Equipo equipo2 = new Equipo(nombreEquipo);
		/*
		 * cargarJugadores(sc, equipo2); System.out.println(equipo2);
		 * 
		 * Partido partido = new Partido(); partido.setEquipoLocal(equipo1);
		 * partido.setEquipoVisitante(equipo2); Resultado resultado = new Resultado();
		 * partido.setResultado(resultado); System.out.println(partido);
		 * 
		 * // apartado 3 System.out.println("Dime los goles del equipo " +
		 * equipo1.getNombreEquipo()); resultado.setGolesLocales(sc.nextInt());
		 * System.out.println("Dime los goles del equipo " + equipo2.getNombreEquipo());
		 * resultado.setGolesVisitante(sc.nextInt()); System.out.println(partido);
		 * 
		 * // apartado 4 System.out.println("Equipo ganador: ");
		 * System.out.println(partido.getEquipoGanador());
		 * 
		 * // apartado 5 Jugador infiltrado = new Jugador("Blas Infiltrado", 99);
		 * equipo2.getJugadores().add(infiltrado); System.out.println(equipo2);
		 * 
		 * // apartado 6 List<Jugador> jugadoresEquipoLocal = equipo1.getJugadores();
		 * Integer tamaoLista = jugadoresEquipoLocal.size(); Jugador ultimoJugador =
		 * jugadoresEquipoLocal.get(tamaoLista-1); equipo1.setCapitan(ultimoJugador);
		 * System.out.println(equipo1);
		 */
		// Ej 42
		// apartado 7
		String nacional = "Liga Nacional";
		equipo1.setCompetición(nacional);

		// apartado 8
		System.out.println(equipo2.getNombreEquipo() + " está en " + equipo2.getCompetición());

		// apartado 9
		String inter = "Liga Internacional";
		equipo2.setCompetición(inter);

		// apartado 10
		System.out.println(equipo1.getNombreEquipo() + " está en " + equipo1.getCompetición());

		sc.close();
	}
	//////////////////////////////////
	/*
	 * private static void cargarJugadores(Scanner scanner, Equipo equipo) { for
	 * (int i = 0; i < 3; i++) { System.out.println("Dime el dorsal del jugador");
	 * Integer dorsalJugador = scanner.nextInt(); scanner.nextLine();
	 * System.out.println("Dime el nombre del jugador"); String nombreJugador =
	 * scanner.nextLine();
	 * 
	 * Jugador jugador = new Jugador(nombreJugador, dorsalJugador);
	 * equipo.getJugadores().add(jugador); }
	 * equipo.setCapitan(equipo.getJugadores().get(0)); }
	 */

}
