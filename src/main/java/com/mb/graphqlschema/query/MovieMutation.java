package com.mb.graphqlschema.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mb.graphqlschema.entity.Movie;
import com.mb.graphqlschema.service.MovieService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MovieMutation implements GraphQLMutationResolver {

	@Autowired
	private MovieService movieService;
	
	public Movie createMovie(String title, int length) {
		return movieService.createMovie(title, length);
	}
	
	public Movie updateMovie(Long id, String title, int length) {
		return movieService.updateMovie(id, title, length);
	}
	
	public Boolean deleteMovie(Long id) {
		return movieService.deleteMovie(id);
	}
}
