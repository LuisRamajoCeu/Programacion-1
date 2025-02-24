package ejercicio47;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
	public BigDecimal getTotal(List<Articulo> listaArticulos) {
		BigDecimal total = new BigDecimal(0);
		for(Articulo articulo : listaArticulos) {
			total = total.add(articulo.getPrecio());
		}
		return total;
	} 
	public BigDecimal getPrecioMedio() {
		BigDecimal total = new BigDecimal(0);
		for(int i = 0; i < listaArticulos.size(); i++) {
			total = total.add(listaArticulos.get(i).getPrecio());
		}if(listaArticulos.size() == 0) {
			return total;
		}else {
		return total.divide(new BigDecimal(listaArticulos.size()),2,RoundingMode.HALF_UP);
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
		fechaActualizacion = LocalDate.now();
	}
	public void vaciarCesta() {
		listaArticulos.clear();
		fechaActualizacion =LocalDate.now();
	}
	
	

}
