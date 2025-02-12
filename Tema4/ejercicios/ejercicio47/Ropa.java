package ejercicio47;

public class Ropa extends Articulo{
	private Integer talla;
	private String color;
	
	public String getColor() {
		return color;
	}
	public Integer getTalla() {
		return talla;
	}
	
	public Ropa(String descripcion, Double precio) {
		super(descripcion, precio);
	}


	

	
	
}
