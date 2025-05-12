package ejercicioRepaso01.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProductoGourmet {
	private Integer id;
	private String nombre;
	private String tipo;
	private BigDecimal precio;
	private Boolean disponible;
	
	public ProductoGourmet(Integer id,String nombre, String tipo,BigDecimal precio,Boolean disponible) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio.setScale(2, RoundingMode.FLOOR);
		this.disponible = disponible;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precioD) {
		this.precio = precioD.setScale(2, RoundingMode.FLOOR);
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "ProductoGourmet [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", disponible=" + disponible + "]";
	}
	
	
	
}
