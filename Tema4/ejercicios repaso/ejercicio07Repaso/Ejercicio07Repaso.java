package ejercicio07Repaso;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ejercicio07Repaso {

	public static void main(String[] args) {
		Academia academia = new Academia();
		Curso curso1 = new Curso("primero", new BigDecimal(3221), 123);
		Curso curso2 = new Curso("segundo", new BigDecimal(2131), 61);
		Curso curso3 = new Curso("tercero", new BigDecimal(2456), 82);
		
		academia.meterCurso(curso1);
		academia.meterCurso(curso2);
		academia.meterCurso(curso3);
		
		curso1.setFechaInicio(LocalDate.of(2003, 4, 21));
		curso1.setFechaFin(LocalDate.of(2003, 7, 31));
		curso2.setFechaInicio(LocalDate.of(2004, 3, 10));
		curso2.setFechaFin(LocalDate.of(2006, 5, 25));
		curso3.setFechaInicio(LocalDate.of(2006, 3, 15));
		curso3.setFechaFin(LocalDate.of(2006, 4, 25));
		
		curso1.setNumPlazasOcupadas(73);
		curso2.setNumPlazasOcupadas(51);
		curso3.setNumPlazasOcupadas(42);
		
		System.out.println(curso1.getDuracionCurso()); 
		
		System.out.println(curso1.isPlazasLibres());
		
		System.out.println(curso2.getPrecioMes());
		
		System.out.println(academia.getCursosDisponibles());
		
		System.out.println(academia.getPrecioMedio());
		
		academia.borrarCursosPasados();
		
		System.out.println(academia.getCursoMasBarato());
		
		System.out.println(academia.getTotalPlazasLibres());
	}

}
