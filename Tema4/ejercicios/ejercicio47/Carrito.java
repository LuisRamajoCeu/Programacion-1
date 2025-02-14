package ejercicio47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private List<Articulo> listaArticulos;
	private Cliente cliente;
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}
	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}
	
	
	
	public Carrito(Cliente cliente) {
		this.fechaCreacion = LocalDate.now();
		this.fechaActualizacion = LocalDate.now();
		this.listaArticulos = new ArrayList<>();
		this.cliente = cliente;
	}
	
	public Integer getCantidad() {
		return listaArticulos.size();
	}
	public Double getTotal(List<Articulo> listaArticulos) {
		Double total = 0.0;
		for(Articulo articulo : listaArticulos) {
			total += articulo.getPrecio();
		}
		return total;
	} 
	public Double getPrecioMedio() {
		Double total = 0.0;
		for(int i = 0; i < listaArticulos.size(); i++) {
			total =+ listaArticulos.get(i).getPrecio();
		}if(listaArticulos.size() == 0) {
			return 0.0;
		}else {
		return total/listaArticulos.size();
	}}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		if(listaArticulos.isEmpty()) {
			return "Nombre cliente: "+cliente.getNombre()+" Dni: "+cliente.getDni()+" Cantidad de artículos: 0 "	
		+"Total: 0 "+" Fecha de actualizacion: "+fechaActualizacion.format(formato);
		}else {
		return "Nombre cliente: "+cliente.getNombre()+" Dni: "+cliente.getDni()+" Cantidad de artículos: "+getCantidad()
		+" Total: "+getTotal(listaArticulos)+" Fecha de actualizacion: "+fechaActualizacion.format(formato);
	}}
	public void addArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
		fechaActualizacion = LocalDate.now();
	}
	public void borrarArticulo(int numero) {
		listaArticulos.remove(numero);
	}
	public void vaciarCesta() {
		listaArticulos.clear();
	}
	
	

}
