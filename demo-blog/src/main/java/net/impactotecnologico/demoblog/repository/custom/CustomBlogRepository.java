package net.impactotecnologico.demoblog.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.impactotecnologico.demoblog.model.Blog;

public interface CustomBlogRepository extends JpaRepository<Blog, Integer> {

	public List<Blog> getData(HashMap<String, String> hash);
	
	public List<Blog> getData(HashMap<String, String> hash, int offset, int limit);
	
	public List<Blog> getData();
	
}
