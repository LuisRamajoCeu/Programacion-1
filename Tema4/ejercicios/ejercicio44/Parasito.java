package ejercicio44;

public class Parasito extends Personaje{
	private static final Integer VIDA = 200;
	private static final Integer RESTA = 10;
	private static final Integer TIEMPO = 5;
	
	public Parasito(String nombre, Integer codigo) {
		super(nombre, codigo);
	}

	public static Integer getVida() {
		return VIDA;
	}
	
	
}
