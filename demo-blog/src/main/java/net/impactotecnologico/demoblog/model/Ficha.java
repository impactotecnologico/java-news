package net.impactotecnologico.demoblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


@NamedQueries({
    @NamedQuery(
        name = "get_ficha_by_titulo",
        query = "select p from Ficha p where titulo = :titulo",
        readOnly = true,
        fetchSize = 2,
        timeout = 1
    )
})
@Entity
public class Ficha {

	@Id
	@GeneratedValue
	int id;

	String titulo;

	String contenido;

	public Ficha(int id) {
		this.id = id;
	}

	public Ficha() {
	}

	public Ficha(int id, String titulo, String contenido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Ficha [id=" + id + ", titulo=" + titulo + ", contenido=" + contenido + "]";
	}
	
	

}
