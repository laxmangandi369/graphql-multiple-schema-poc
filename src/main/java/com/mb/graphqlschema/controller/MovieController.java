package com.mb.graphqlschema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.mb.graphqlschema.entity.Movie;
import com.mb.graphqlschema.query.MovieMutation;
import com.mb.graphqlschema.query.MovieQuery;

@Controller
public class MovieController {

	
	@Autowired
	private MovieQuery movieQuery;
	
	@Autowired
	private MovieMutation movieMutation;
	
	@QueryMapping("getMovies")
	public List<Movie> getMovies(){
		return movieQuery.getMovies();
	}
	
	@MutationMapping("createMovie")
	public Movie createMovie(@Argument String title,@Argument int length) {
		return movieMutation.createMovie(title, length);
	}
	
	@MutationMapping("updateMovie")
	public Movie updateMovie(@Argument Long id,@Argument String title,@Argument int length) {
		return movieMutation.updateMovie(id, title, length);
	}
	
	@MutationMapping("deleteMovie")
	public Boolean deleteMovie(@Argument Long id) {
		return movieMutation.deleteMovie(id);
	}
}
