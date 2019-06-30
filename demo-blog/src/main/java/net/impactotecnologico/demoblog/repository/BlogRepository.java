package net.impactotecnologico.demoblog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.impactotecnologico.demoblog.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

	public Page<Blog> findAll(Pageable pageable);
}
