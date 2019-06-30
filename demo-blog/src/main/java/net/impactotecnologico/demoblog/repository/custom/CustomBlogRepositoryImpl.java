package net.impactotecnologico.demoblog.repository.custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import net.impactotecnologico.demoblog.model.Blog;

public class CustomBlogRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Blog> getData(HashMap<String, String> hash) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Blog> query = cb.createQuery(Blog.class);
		Root<Blog> root = query.from(Blog.class);

		List<Predicate> predicates = new ArrayList<>();

		hash.forEach((field, value) -> {
			switch (field) {
			case "titulo":
				predicates.add(cb.like(root.get(field), "%" + (String) value + "%"));
				break;
			case "contenido":
				predicates.add(cb.like(root.get(field), "%" + (String) value + "%"));
				break;
			}
		});
		
		
		query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
		return entityManager.createQuery(query).getResultList();
	}
	
	
	public List<Blog> getData(HashMap<String, String> hash, int offset, int limit) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Blog> query = cb.createQuery(Blog.class);
		
		Root<Blog> root = query.from(Blog.class);

		List<Predicate> predicates = new ArrayList<>();

		hash.forEach((field, value) -> {
			switch (field) {
			case "titulo":
				predicates.add(cb.like(root.get(field), "%" + (String) value + "%"));
				break;
			case "contenido":
				predicates.add(cb.like(root.get(field), "%" + (String) value + "%"));
				break;
			}
		});
		
		query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
//		query.orderBy(cb.asc(root.get(Blog_.titulo)));
		TypedQuery<Blog> typedQuery = entityManager.createQuery(query);
		typedQuery.setFirstResult(offset);
		typedQuery.setMaxResults(limit);
		return typedQuery.getResultList();
	}
	
	
	public List<Blog> getData (){
		String jql ="Select b from Blog as b order by b.id";
		return entityManager.createQuery (jql).getResultList();
	}

}
