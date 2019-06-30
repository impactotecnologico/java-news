package net.impactotecnologico.demoblog;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import net.impactotecnologico.demoblog.model.Blog;
import net.impactotecnologico.demoblog.model.Ficha;
import net.impactotecnologico.demoblog.repository.BlogRepository;
import net.impactotecnologico.demoblog.repository.FichaRepository;
import net.impactotecnologico.demoblog.repository.custom.CustomBlogRepository;
import net.impactotecnologico.demoblog.repository.jpql.BlogAnnotatedRepository;
import net.impactotecnologico.demoblog.repository.namedqueries.BlogNamedQRepository;
import net.impactotecnologico.demoblog.repository.namedqueries.FichaHibernateNamedQRepository;

@SpringBootApplication
public class DemoBlogApplication2 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(DemoBlogApplication2.class);
		BlogRepository br = contexto.getBean(BlogRepository.class);
		
		
		
		Blog b = new Blog(0,"Titulo","Aprendiendo Spring Data");
		
		Blog saved = br.save(b);
		
		System.out.println(saved);
		
		CustomBlogRepository cbr = contexto.getBean(CustomBlogRepository.class);
		
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("contenido", "Spring");
		
		List<Blog> blogs = cbr.getData(hash);
		
		System.out.println(blogs.size());
		
		
		System.out.println("****************************");
		
		for (int i = 0; i < 10; i++) {
			Blog b1 = br.save(new Blog(0,"Titulo " + i,"Aprendiendo Spring Data v"+i));
			System.out.println("Guardado " + b1);
		}
		
		blogs = cbr.getData(hash, 5, 2);
		
		System.out.println(blogs);
		
		System.out.println("************PAGEABLE****************");
		
		Page<Blog> page = br.findAll(PageRequest.of(2, 2));
		
		System.out.println(page.getSize());
		System.out.println(page.getTotalElements());
		System.out.println(page.getTotalPages());
		System.out.println(page.getContent());
		
		
		System.out.println("************PAGEABLE + SORT****************");
		
		page = br.findAll(PageRequest.of(0, 2));
		
		System.out.println(page.getContent());
		
		page = br.findAll(PageRequest.of(0, 2, Sort.by("Titulo").descending()));
		
		System.out.println(page.getContent());
		
		
		System.out.println("************JPQL 1****************");
		
		BlogAnnotatedRepository bar = contexto.getBean(BlogAnnotatedRepository.class);
		
		List<Blog> blogs2 = bar.findByTitulo("Titulo", PageRequest.of(0, 2));
		
		System.out.println(blogs2);
		
		
		System.out.println("************JPQL 2****************");
		
		List<Blog> blogs3 = cbr.getData();
		
		System.out.println(blogs3);
		
		
		
		
		System.out.println("************NAMED QUERIES****************");

		
		BlogNamedQRepository bnqr = contexto.getBean(BlogNamedQRepository.class);
		
		List<Blog> blogs4 = bnqr.getByNQ1("Titulo 1");
		
		System.out.println(blogs4);
		
		blogs4 = bnqr.getByNQ2("Titulo 2");
		
		System.out.println(blogs4);
		
		
		System.out.println("************NAMED QUERIES HIBERNATE****************");

		FichaRepository fr = contexto.getBean(FichaRepository.class);
		
		for (int i = 0; i < 10; i++) {
			Ficha f1 = fr.save(new Ficha(0,"Ficha","Aprendiendo Spring Data v"+i));
			System.out.println("Guardado " + f1);
		}
		
		FichaHibernateNamedQRepository fhnqr = contexto.getBean(FichaHibernateNamedQRepository.class);
		
		List<Ficha> fichas = fhnqr.getByHNQ("Ficha");
		
		System.out.println(fichas);
		
		
		
		
		
		contexto.close();
	}
}
