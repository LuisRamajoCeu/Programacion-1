package ejercicio54;

import java.time.LocalDate;

public class Ingresos extends Movimientos{
	private Double importe;
	private String descripcion;
	private LocalDate fecha;

	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Ingresos(LocalDate fecha, Double importe, String descripcion) {
		this.fecha = fecha;
		this.importe = importe;
		this.descripcion = descripcion;
	}
	
	public void Movimiento() {
		System.out.println("I - "+getFecha()+" - "+importe+" - "+descripcion);
	}
}
