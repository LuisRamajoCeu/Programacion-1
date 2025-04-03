package ejercicio07;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;
	
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) throws ParametroIncorrectoException {
		
			if(genero.equals("H") || genero.equals("M")) {
				this.genero = genero;
			}else {
				throw new ParametroIncorrectoException("El genero debe ser M o H");
			}
		
	}
	public BigDecimal getAltura() {
		return altura;
	}
	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		
			if(altura.compareTo(new BigDecimal(0)) > 0 && altura.compareTo(new BigDecimal(3)) < 0) {
				this.altura = altura;
			}else {
				throw new ParametroIncorrectoException("La altura debe de estar entre 0 y 3");
			}
		
	}
	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}
	
	
	
	
	
}
