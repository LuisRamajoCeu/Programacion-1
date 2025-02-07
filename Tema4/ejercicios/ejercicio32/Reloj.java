package ejercicio32;

public class Reloj {
	//1
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24horas;
	
	//2
	public Reloj() {
		horas = 00;
		minutos = 00;
		segundos = 00;
		formato24horas = true;
	}
	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		formato24horas = true;
	}
	//3
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
	//4
	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}
	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	//5
	public void setFormato24horas(Boolean formato24horas) {
		this.formato24horas = formato24horas;
	}
	//6
	public Boolean check() {
		Boolean correcto = false;
		if(horas >= 0 && horas <= 23) {
			if() {
				correcto = true;
			}
		}return correcto;
	}
	
	
	
	
}
