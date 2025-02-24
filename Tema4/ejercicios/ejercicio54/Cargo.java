package ejercicio54;

import java.time.LocalDate;

public class Cargo extends Movimientos{
	private Double importe;
	private String cif;
	private LocalDate fecha;

	
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Cargo(LocalDate fecha, Double importe, String cif) {
		this.fecha = fecha;
		this.importe = importe;
		this.cif = cif;
	}
	
	public void Movimiento() {
		System.out.println("C - "+getFecha()+" - "+importe+" - "+cif);
	}
	
}
