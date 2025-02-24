package ejercicio43;

import java.util.List;

public class Pelicula {
	private Integer fechaEstreno;
	private String titulo;
	private List<Actor> actores;
	private Guionista guionista;
	private Director director;
	
	public Integer getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Integer fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Pelicula() {
	}

	@Override
	public String toString() {
		return "Pelicula [fechaEstreno=" + fechaEstreno + ", titulo=" + titulo + ", actores=" + actores + ", guionista="
				+ guionista.getNombre() + ", director=" + director.getNombre() + "]";
	}
	
}
