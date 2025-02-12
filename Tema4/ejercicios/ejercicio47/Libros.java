package ejercicio47;

public class Libros extends Articulo{
	private String autor;
	
	
	public Libros(String descripcion, Double precio) {
		super(descripcion, precio);
	}


	public String getAutor() {
		return autor;
	}
	
	
	
}
