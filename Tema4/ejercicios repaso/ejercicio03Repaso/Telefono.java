package ejercicio03Repaso;

public class Telefono {
	private Integer numero;
	private Boolean enLlamada;
	
	public Telefono(Integer numero) {
		this.numero = numero;
		this.enLlamada = false;
	}
	public Integer consultarNumero() {
		return numero;
	}
	public void marcar(Integer numeroLlamar){
		System.out.println("LLAMANDO A " + numeroLlamar);
		if(this.numero.equals(numeroLlamar)) {
			System.out.println("COMUNICANDO");
		}else {
			System.out.println("EN COMUNICACIÓN");
			enLlamada = true;
		}
	}
	public void colgar() {
		if(enLlamada) {
			System.out.println("COMUNICACIÓN TERMINADA");
			enLlamada = false;
		}
	}
	
}
