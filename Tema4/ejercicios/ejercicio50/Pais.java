package ejercicio50;

import java.util.Objects;

public class Pais {
	private String codigo; 
	private String descripcion;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Pais [codigo= "+codigo+" descripcion=" + descripcion + "]";
	}
	public Pais(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo.toUpperCase());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj; //Si cambia equals, tmb hash
		return Objects.equals(codigo.toUpperCase(), other.codigo.toUpperCase());
	}
}
