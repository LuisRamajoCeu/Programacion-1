package ejercicio44;

public class Jugador {
	private String nombre;
	private EquipoCombate equipoCombate;
	public Jugador() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EquipoCombate getEquipoCombate() {
		return equipoCombate;
	}
	public void setEquipoCombate(EquipoCombate equipoCombate) {
		this.equipoCombate = equipoCombate;
	}
	
	
	

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipoCombate=" + equipoCombate + "]";
	}
	
	
}
