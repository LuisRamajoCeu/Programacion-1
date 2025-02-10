package ejercicio44;

public class Asesino extends Personaje{
	private static final Integer VIDA = 100;
	private static final Integer RESTA = 10;
	private static final Integer TIEMPO = 5;

	
	public Asesino(String nombre, String codigo) {
		super(nombre, codigo);
	}

	public Integer getVida() {
		return VIDA;
	}
	public Integer getResta() {
		return RESTA;
	}public Integer getTiempo() {
		return TIEMPO;
	}
	
	
}
