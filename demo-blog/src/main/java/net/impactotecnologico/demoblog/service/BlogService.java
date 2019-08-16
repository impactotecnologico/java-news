package net.impactotecnologico.demoblog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.impactotecnologico.demoblog.model.Blog;

@Service
public interface BlogService {

	public List<Blog> getAllBlog();

	public Blog getBlogById(int id);

	public Blog saveBlog(Blog blog);

	public Blog updateBlog(Blog blog);

	public void removeBlog(Blog blog);

	public boolean deleteById(int id);

}