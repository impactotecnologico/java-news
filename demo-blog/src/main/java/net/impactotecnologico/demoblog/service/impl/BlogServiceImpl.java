package net.impactotecnologico.demoblog.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.impactotecnologico.demoblog.aspects.annotations.MedidorDeTiempo;
import net.impactotecnologico.demoblog.model.Blog;
import net.impactotecnologico.demoblog.repository.BlogRepository;
import net.impactotecnologico.demoblog.service.BlogService;

@Component
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogRepository;

//	@MedidorDeTiempo
	@Override
	public List<Blog> getAllBlog() {
		return this.blogRepository.findAll();
	}

	@Override
	public Blog getBlogById(int id) {

		Optional<Blog> blogO = this.blogRepository.findById(id);
		if (blogO.isPresent()) {
			return blogO.get();
		} else {
			return null;
		}

	}

	@Override
	public Blog saveBlog(Blog blog) {

		return this.blogRepository.save(blog);
	}

	@Override
	public void removeBlog(Blog blog) {
		this.blogRepository.delete(blog);
	}

	@Override
	public Blog updateBlog(Blog blog) {
		if (this.getBlogById(blog.getId()) != null) {
			return this.blogRepository.save(blog);
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		Optional<Blog> op = this.blogRepository.findById(id);
		if (op.isPresent()) {
			Blog blog = op.get();
			this.blogRepository.delete(blog);
			return true;

		} else {
			return false;
		}

	}

}
