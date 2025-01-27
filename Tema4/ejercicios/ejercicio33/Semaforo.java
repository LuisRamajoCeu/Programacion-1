package ejercicio33;

public class Semaforo {
	public static final String ROJO = "ROJO";
	public static final String VERDE = "VERDE";
	public static final String AMBAR = "AMBAR";
	private Boolean parpadeando;
	private String color;
	public Semaforo(){
		this.color = ROJO;
		this.parpadeando = false;
	}
	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if(parpadeando && !color.equals(AMBAR)) {
			return;
		}this.parpadeando = parpadeando;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.equals(ROJO) || color.equals(VERDE) || color.equals(AMBAR)) {
			this.color = color;
		}	
	}
	
	@Override
	public String toString() {
		if(parpadeando) {
			return "Semaforo en color " + color + " parpadeando" ;
		}
		return "Semaforo en color " + color;
	}

	
<<<<<<< Updated upstream
	public void cambiarEstado() {
		if(color.equals(VERDE)) {
			color = AMBAR;
			parpadeando = true;
		}else if(color.equals(AMBAR) && parpadeando) {
			parpadeando = false;
		}else if(color.equals(AMBAR)) {
			color = ROJO;
		}else {
			color = VERDE;
		}
		
	}
=======
>>>>>>> Stashed changes
}
