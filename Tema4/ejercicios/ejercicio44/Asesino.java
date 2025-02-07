package ejercicio44;

public class Asesino extends Personaje{
	private static final Integer VIDA = 100;
	private static final Integer RESTA = 10;
	private static final Integer TIEMPO = 5;

	
	public Asesino(String nombre, Integer codigo) {
		super(nombre, codigo);
	}

	public static Integer getVida() {
		return VIDA;
	}
	
	
}
