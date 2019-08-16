package net.impactotecnologico.demoblog.repository.jpql;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.impactotecnologico.demoblog.model.Blog;

public interface BlogAnnotatedRepository2 extends JpaRepository<Blog, Integer> {

    //@Query("SELECT b FROM Blog b WHERE b.titulo LIKE :titulo% ORDER BY b.id")
    public List<Blog> buscandoPorTitulo(@Param("titulo") String titulo, Pageable pageable);
}