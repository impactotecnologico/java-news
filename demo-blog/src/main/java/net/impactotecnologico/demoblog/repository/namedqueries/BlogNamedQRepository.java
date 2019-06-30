package net.impactotecnologico.demoblog.repository.namedqueries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import net.impactotecnologico.demoblog.model.Blog;

@Repository
public class BlogNamedQRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Blog> getByNQ1(String titulo){
		
		Query query = entityManager.createNamedQuery( "get_blog_by_titulo" );
		query.setParameter("titulo", titulo);
		return query.getResultList();
	}
	
	public List<Blog> getByNQ2(String titulo){
		TypedQuery<Blog> typedQuery = entityManager.createNamedQuery(
		    "get_blog_by_titulo", Blog.class
		);
		typedQuery.setParameter("titulo", titulo);
		return typedQuery.getResultList();
	}
}
