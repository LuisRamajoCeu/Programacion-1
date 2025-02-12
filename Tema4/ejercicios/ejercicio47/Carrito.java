package ejercicio47;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDateTime fechaActualizacion;
	private List<Articulo> listaArticulos;
	private Cliente cliente;
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}
	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}
	
	public Carrito() {
		this.fechaCreacion = LocalDate.now();
		this.fechaActualizacion = LocalDateTime.now();
	}
	
	public Integer getCantidad() {
		return listaArticulos.size();
	}
	public Double getTotal() {
		Double total = 0.0;
		for(int i = 0; i < listaArticulos.size(); i++) {
			total =+ listaArticulos.get(i).getPrecio();
		}
		return total;
	}
	public Double getPrecioMedio() {
		Double total = 0.0;
		for(int i = 0; i < listaArticulos.size(); i++) {
			total =+ listaArticulos.get(i).getPrecio();
		}
		return total/listaArticulos.size();
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaFormateada = fechaActualizacion.format(formato);
		return "Nombre cliente: "+cliente.getNombre()+" Dni: "+cliente.getDni()+" Cantidad de artículos: "+listaArticulos.size()
		+"Total: "+getTotal()+" Fecha de actualizacion: "+fechaFormateada;
	}
	public void addArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
	}
	public void borrarArticulo(int numero) {
		listaArticulos.remove(numero);
	}
	public void vaciarCesta() {
		listaArticulos.clear();
	}
	
	

}
