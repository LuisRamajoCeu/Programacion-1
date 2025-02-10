package ejercicio44;

import java.util.Objects;

public abstract class Personaje {
	private String nombre;
	private String codigo;
	
	public Personaje(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public abstract Integer getVida();
	public abstract Integer getResta();
	public abstract Integer getTiempo();
	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
}
