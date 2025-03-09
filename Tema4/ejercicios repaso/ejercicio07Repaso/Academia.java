package ejercicio07Repaso;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Academia {
	private String ciudad;
	private Integer telefono;
	private List<Curso> listaCursos;
	
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public List<Curso> getListaCursos() {
		return listaCursos;
	}
	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}


	public Academia() {
		this.listaCursos = new ArrayList<>();
	}
	
	public void meterCurso(Curso curso) {
		listaCursos.add(curso);
	}
	
	public List<Curso> getCursosDisponibles(){
		List<Curso> cursosDisponibles = new ArrayList<Curso>();
		if(listaCursos!=null &&  !this.listaCursos.isEmpty()) {
		for(Curso curso : listaCursos) {
			if(curso.isPlazasLibres() && curso.getFechaFin().isAfter(LocalDate.now())) {
				cursosDisponibles.add(curso);
			}
		}}
		return cursosDisponibles;
	}
	
	public BigDecimal getPrecioMedio() {
		BigDecimal precioMedio = BigDecimal.ZERO;
		int i = 0;
		if(listaCursos!=null &&  !this.listaCursos.isEmpty()) {
		for(Curso curso : listaCursos) {
			precioMedio = precioMedio.add(curso.getPrecio());
			i++;
		}
		}
		return precioMedio.divide(new BigDecimal(i),2,RoundingMode.HALF_UP);
	}
	
	public void borrarCursosPasados() {
		if(listaCursos!=null &&  !this.listaCursos.isEmpty()) {
		for(int i = 0; i < listaCursos.size(); i++) {
			if(!listaCursos.get(i).getFechaFin().isAfter(LocalDate.now())) {
				listaCursos.remove(i);
			}
		}
	}}
	
	public Curso getCursoMasBarato() {
		Curso aux = this.listaCursos.get(0);
		for(Curso curso : listaCursos) {
			if(curso.getFechaInicio().isAfter(LocalDate.now()) && 
			(aux.getPrecioMes().compareTo(curso.getPrecioMes()) < 0)) {
				aux = curso;
			}
		}
		return aux;
	}
	
	public int getTotalPlazasLibres() {
		int plazasLibres = 0;
		if(listaCursos!=null &&  !this.listaCursos.isEmpty()) {
		for(Curso curso : listaCursos) {
			plazasLibres = plazasLibres + curso.getNumPlazasTotales()-curso.getNumPlazasOcupadas();
		}}
		return plazasLibres;
	}
	
	
	
}
