package ejercicio03Repaso;


public class Movil extends Telefono{
	private LocalizacionGPS gps;
	public Movil(Integer numero,LocalizacionGPS gps) {
		super(numero);
		this.gps = gps;
	}
}
