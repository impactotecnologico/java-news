package net.impactotecnologico.demoblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.impactotecnologico.demoblog.model.Blog;
import net.impactotecnologico.demoblog.service.BlogService;

@RestController
@Api(value = "Blog Controller")
public class BlogController {

	@Autowired
	BlogService blogService;

	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	public ResponseEntity<List<Blog>> getAllBlogs() {
		List<Blog> todosLosBlogs = this.blogService.getAllBlog();

		ResponseEntity<List<Blog>> response = new ResponseEntity<List<Blog>>(todosLosBlogs, HttpStatus.OK);

		return response;
	}

	@RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
	
	public ResponseEntity<Blog> getById(@ApiParam(value = "Consulta por ID", required = true) @PathVariable("id") int id) {
		Blog b = this.blogService.getBlogById(id);
		if (b == null) {
			return new ResponseEntity<Blog>(b, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Blog>(b, HttpStatus.OK);
		}

	}

	@RequestMapping(value = "/blog", method = RequestMethod.POST)
	public ResponseEntity<Void> crearBlog(@RequestBody Blog b) {
		this.blogService.saveBlog(b);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/blog", method = RequestMethod.PUT)
	public ResponseEntity<Blog> actualizarBlog(@RequestBody Blog b) {
		Blog blog = this.blogService.updateBlog(b);
		if (blog == null) {
			return new ResponseEntity<Blog>(blog, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<Blog>(blog, HttpStatus.OK);
		}

	}

	@RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@PathVariable("id") int id) {
		if (!this.blogService.deleteById(id)) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}

}
