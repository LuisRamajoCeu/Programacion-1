package ejercicio55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Evaluacion {
	private Map<String, BigDecimal> notas;

	public Evaluacion() {
		notas = new HashMap<String, BigDecimal>();
	}
	
	public Boolean addNota(String dni, BigDecimal nota) {
		Boolean seAñade = false;
		if (notas.containsKey(dni)) {
			return seAñade;
		} else {
			notas.put(dni, nota);
			seAñade = true;
		}
		return seAñade;
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		Boolean seCorrige = false;
		if (notas.get(dni) == null || !notas.containsKey(dni)) {

		} else {
			notas.put(dni, nota);
			seCorrige = true;
		}
		return seCorrige;
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		BigDecimal nota = BigDecimal.ZERO;
		if (notas.get(dni) != null) {
			nota = notas.get(dni);
		}
		return nota.setScale(1, RoundingMode.HALF_UP);
	}
	
	public BigDecimal obtenerNotaMedia() {
		Collection<BigDecimal> todasLasNotas = notas.values();
		BigDecimal sumaTotal = BigDecimal.ZERO;
		BigDecimal cantidadAlumnos = new BigDecimal(notas.size());
		for(BigDecimal nota : todasLasNotas) {
			sumaTotal = sumaTotal.add(nota);
		}
		return sumaTotal.divide(cantidadAlumnos, 2, RoundingMode.HALF_UP);
	}
	
	public Integer obtenerCantidadAprobados() {
		Integer aprobados = 0;
		Collection<BigDecimal> notasTodas = notas.values();
		for(BigDecimal nota : notasTodas) {
			if(nota.compareTo(new BigDecimal(5)) >= 0) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	public List<String> obtenerSuspensos() {
		List<String> dniSuspensos = new ArrayList<>();
		Set<Entry<String,BigDecimal>> todasLasNotas = notas.entrySet();
		for(Entry<String,BigDecimal> registro : todasLasNotas) {
			if(registro.getValue().compareTo(new BigDecimal(5)) < 0) {
				dniSuspensos.add(registro.getKey());
			}
		}
		return dniSuspensos;
	}
	
	public void borrarAprobados() {
		Set<String> dnis = notas.keySet();
		Iterator<String> it = dnis.iterator();
		while(it.hasNext()) {
			String dni = (String) it.next();
			if(notas.get(dni).compareTo(new BigDecimal(5)) >= 0){
				it.remove();
			}
		}
	}

	@Override
	public String toString() {
		List<String> dniAprobados = new ArrayList<>();
		List<String> dniSuspensos = new ArrayList<>();
		List<BigDecimal> notaAprobados = new ArrayList<>();
		List<BigDecimal> notaSuspensos = new ArrayList<>();
		Set<Entry<String,BigDecimal>> todasLasNotas = notas.entrySet();
		for(Entry<String,BigDecimal> registro : todasLasNotas) {
			if(registro.getValue().compareTo(new BigDecimal(5)) >= 0) {
				dniAprobados.add(registro.getKey());
				notaAprobados.add(registro.getValue().setScale(1, RoundingMode.HALF_UP));
			}else {
				dniSuspensos.add(registro.getKey());
				notaSuspensos.add(registro.getValue().setScale(1, RoundingMode.HALF_UP));
			}
		}
		String aprobados = "";
		int j = 0;
		if(!dniAprobados.isEmpty()) {
		for(int i = 0; i < dniAprobados.size(); i++) {
			if(j == 0) {
				aprobados = dniAprobados.get(i) + " ("+notaAprobados.get(i)+")\n";
				j++;
			}else {
			aprobados = aprobados + dniAprobados.get(i) + " ("+notaAprobados.get(i)+")\n";
		}}
		}
		String suspensos = "";
		int k = 0;
		for(int i = 0; i < dniSuspensos.size(); i++) {
			if(k == 0) {
				suspensos = dniSuspensos.get(i) + " ("+notaSuspensos.get(i)+")\n";
				k++;
			}else {
			suspensos = suspensos + dniSuspensos.get(i) + " ("+notaSuspensos.get(i)+")\n";
		}}
			
		return "Aprobados:\n" + aprobados + "Suspensos:\n" + suspensos;
	}
	
	
	
}
