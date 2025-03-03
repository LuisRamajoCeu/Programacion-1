package ejercicio01Repaso;

import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private Double precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;
	
	public Smartphone() {
		
	}
	public Smartphone(String imei) {
		this.imei = imei; 
		this.activo = true;
		this.precio = 0.0;
	}
	public Smartphone(String imei, String marca, String modelo) {
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.activo = true;
		this.precio = 0.0;
	}
	
	public void setPrecio(Double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
	public void activar() {
		this.activo = true;
	}
	public void desactivar() {
		this.activo = false;
	}
	public Integer getEdad() {
		LocalDate fechaCalcular = LocalDate.of(2000, 4, 1);
		Period edad = fechaCalcular.until(fechaFabricacion);
		Integer añosDiferencia = edad.getYears();
		return añosDiferencia;
	}
	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	public void establecerFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	public Double getPrecioMasIva() {
		Double iva = 1.21;
		Double precioConIva = precio*iva;
		return precioConIva;
	}
	public Boolean isAltaGama(Double precio) {
		Boolean isAltaGama = false;
		if(this.precio > precio) {
			isAltaGama = true;
		}
		return isAltaGama;
	}
	public Boolean isDatosCompletos() {
		Boolean isDatosCompletos = false;
		if(this.imei != null || !this.imei.isBlank() || this.precio != null) {
			isDatosCompletos = true;
		}
		return isDatosCompletos;
	}
	public Boolean isGratis() {
		Boolean isGratis = false;
		if(this.precio == 0) {
			isGratis = true;
		}
		return isGratis;
	}
	public void rebajar() {
		this.precio = precio -10;
	}
	@Override
	public String toString() {
		if(activo) {
			return marca + " (" + modelo + ")";
		}else {
			return marca + " (" + modelo + ") - INACTIVO";
		}
	}
	
	
	
}
