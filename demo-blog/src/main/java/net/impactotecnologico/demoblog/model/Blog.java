package net.impactotecnologico.demoblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;

@NamedQueries({
    @NamedQuery(
        name = "get_blog_by_titulo",
        query = "select p from Blog p where titulo = :titulo"
    )
    ,
    @NamedQuery(
        name = "get_read_only_blog_by_titulo",
        query = "select p from Blog p where titulo = :titulo",
        hints = {
            @QueryHint(
                name = "org.hibernate.readOnly",
                value = "true"
            )
        }
    )
})
@Entity
public class Blog {

	@Id
	@GeneratedValue
	int id;

	String titulo;

	String contenido;

	public Blog(int id) {
		this.id = id;
	}

	public Blog() {
	}

	public Blog(int id, String titulo, String contenido) {
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
		return "Blog [id=" + id + ", titulo=" + titulo + ", contenido=" + contenido + "]";
	}
	
	

}
