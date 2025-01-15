package ejercicio01;

public class Caballo {
	public Caballo() {
		
	}
	public Caballo(String nombre, Integer carrerasGanadas, String color, Integer edad) {
		this.nombre = nombre;
		this.carrerasGanadas = carrerasGanadas;
		this.color = color;
		this.edad = edad;
	}
	private String nombre;
	private Integer carrerasGanadas;
	private String color;
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCarrerasGanadas() {
		return carrerasGanadas;
	}
	public void setCarrerasGanadas(Integer carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public void imprimeCarrerasGanadas() {
		System.out.println("El n1 de carreras ganadas es: " + carrerasGanadas);
	}
	public Integer añoDeNacimiento() {
		System.out.println("El año de nacimiento del caballo "
				+ "es: " + (2025-this.edad));
		return 2025-this.edad;
	}
	public void incrementarCarrerasGanadas() {
		System.out.println("Ahora las carreras ganadas son: " + (this.carrerasGanadas + 1));
	}
	public void relincha(){
		System.out.println("Hiiiiiiiieeeee");
	}
}
