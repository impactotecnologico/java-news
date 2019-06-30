package net.impactotecnologico.demoblog.repository.namedqueries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import net.impactotecnologico.demoblog.model.Ficha;

@Repository
public class FichaHibernateNamedQRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Ficha> getByHNQ(String titulo){
		
		Query query = entityManager.createNamedQuery( "get_ficha_by_titulo" );
		query.setParameter("titulo", titulo);
		return query.getResultList();
	}
	
}
