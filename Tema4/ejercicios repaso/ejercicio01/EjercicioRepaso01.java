package ejercicio01;

public class EjercicioRepaso01 {

	public static void main(String[] args) {
	Caballo caballo1 = new Caballo();
	/*System.out.println(caballo1.nombre);
	System.out.println(caballo1.carrerasGanadas);
	System.out.println(caballo1.color);
	caballo1.color = "marron";
	System.out.println(caballo1.color);
	Al ser publicos se puede poner sin get, si son privado
	necesitan un método público
	*/
	System.out.println(caballo1.getColor());
	caballo1.setCarrerasGanadas(5);
	caballo1.imprimeCarrerasGanadas();
	caballo1.setEdad(20);
	caballo1.añoDeNacimiento();
	caballo1.incrementarCarrerasGanadas();
	caballo1.relincha();
	caballo1.setNombre("Bolita");
	System.out.println(caballo1.getNombre());
	caballo1.setCarrerasGanadas(10);
	caballo1.setEdad(2);
	Caballo caballo2 = new Caballo("Fideo",3,"Blanco",15);
	System.out.println(caballo2.getNombre() + caballo2.getCarrerasGanadas() + caballo2.getColor() + caballo2.getEdad());
	}

}
