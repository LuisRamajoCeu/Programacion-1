package ejercicio47;

public class Ejercicio47 {

	public static void main(String[] args) {
	//1
		Cliente blas = new Cliente();
		blas.setDni("12345678X");
		blas.setNombre("Blas de los Montes");
	//2
		Carrito carritoBlas = new Carrito(blas);
		System.out.println(carritoBlas);
	//3
		Ropa poncho = new Ropa();
		poncho.setDescripcion("Poncho");
		poncho.setPrecio(20.0);
		poncho.setTalla("XL");
		poncho.setColor("Azul");
	//4
		carritoBlas.addArticulo(poncho);
		carritoBlas.addArticulo(poncho);
		System.out.println(carritoBlas);
	//5
		Libros niet = new Libros();
		niet.setAutor("Nietzsche");
		niet.setDescripcion("Así habló Zaratustra");
		niet.setPrecio(15.0);
	//6
		carritoBlas.addArticulo(niet);
		System.out.println(carritoBlas);
	//7
		carritoBlas.borrarArticulo(1);
		System.out.println(carritoBlas);
	//8
		System.out.println(carritoBlas.getPrecioMedio());
	//9
		carritoBlas.vaciarCesta();
		System.out.println(carritoBlas);
	//10
		System.out.println(carritoBlas.getPrecioMedio());
	
	}

}
