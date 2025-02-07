package ejercicio32;

import java.util.Objects;

public class Reloj {
	// 1
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24horas;
	// 2
	public Reloj() {
		horas = 0;
		minutos = 0;
		segundos = 0;
		formato24horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		formato24horas = true;
	}

	// 3
	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24horas() {
		return formato24horas;
	}

	// 4
	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	// 5
	public void setFormato24horas(Boolean formato24horas) {
		this.formato24horas = formato24horas;
	}

	// 6
	public Boolean check() {
		Boolean correcto = true;
		if (!(horas >= 0 && horas <= 23)) {
			correcto = false;
		}
		if (!(minutos >= 0 && minutos <= 59)) {
			correcto = false;
		}
		if (!(segundos >= 0 && segundos <= 59) || segundos == null) {
			correcto = false;
		}			
		return correcto;	
	}

	// 7
	@Override
	public String toString() {
		Integer horas12 = horas;
		String pmAm = "am";
		if(horas >= 13 && horas <= 24) {
			pmAm = "pm";
			horas12 = horas - 12;
		}
		
		if(check()) {
		if (formato24horas) {
			return "Reloj: " + horas + ":" + minutos + ":" + segundos;
		}else {
			return "Reloj: " + horas12 + ":" + minutos + ":" + segundos + " " + pmAm;
		}
	}else{
		return "HORA INCORRECTA";}
	}
	// 8
	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}
	
	

	
	
	
}
