package ejercicio54;

import java.time.LocalDate;

public class Retiradas extends Movimientos{
	private Double importe;	
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
	
	
	public Retiradas(LocalDate fecha, Double importe) {
		this.fecha = fecha;
		this.importe = importe;
	}
	
	public void Movimiento() {
		System.out.println("R - "+getFecha()+" - "+importe);
	}
}
