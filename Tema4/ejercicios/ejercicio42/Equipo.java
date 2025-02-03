package ejercicio42;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
	private String nombreEquipo;
	private Jugador capitan;
	private List<Jugador> jugadores;

	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.jugadores = new ArrayList<>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitan, jugadores, nombreEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombreEquipo, other.nombreEquipo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nombreEquipo).append(" - Capitán: ").append(capitan.getNombre()).append(" - Jugadores: [");
		for (int i = 0; i < jugadores.size(); i++) {
			sb.append(jugadores.get(i));
			if (i < jugadores.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	// Ej 42
	private static String competición;

	public String getCompetición() {
		return competición;
	}

	public void setCompetición(String competición) {
		Equipo.competición = competición;
	}

}