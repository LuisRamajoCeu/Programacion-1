package ejercicio07;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {
	private Set<Persona> setPersonas;

	public Sociedad() {
		this.setPersonas = new HashSet<Persona>();
	}

	public void addPersona(String genero, BigDecimal altura) throws ParametroIncorrectoException {
		Persona p = new Persona();
		try {
			p.setAltura(altura);
			p.setGenero(genero);
			setPersonas.add(p);
			System.out.println("Persona añadida correctamente");
		} catch (ParametroIncorrectoException e) {
			System.out.println(e.getMessage());
			throw new ParametroIncorrectoException();
		}
	}

	public BigDecimal calcularAlturaMedia(String quien) throws ListaVaciaException {
		int contador = 0;
		BigDecimal media = BigDecimal.ZERO;
		if (setPersonas == null || setPersonas.size() == 0) {
			throw new ListaVaciaException("La lista está vacía");
		}
		for (Persona persona : setPersonas) {
			if (quien.equalsIgnoreCase("hombres") && persona.getGenero().equals("H")) {
				contador++;
				media = media.add(persona.getAltura());
			} else if (quien.equalsIgnoreCase("mujeres") && persona.getGenero().equals("M")) {
				contador++;
				media = media.add(persona.getAltura());
			} else if (quien.equalsIgnoreCase("total")) {
				contador++;
				media = media.add(persona.getAltura());
			}

		}
		if (contador == 0) {
			throw new ListaVaciaException("no hay personas");
		}
		return media.divide(new BigDecimal(contador), 2, RoundingMode.HALF_UP);
	}

}
