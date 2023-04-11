package com.mb.graphqlschema.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mb.graphqlschema.entity.Movie;
import com.mb.graphqlschema.service.MovieService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MovieQuery implements GraphQLQueryResolver{

	@Autowired
	private MovieService movieService;
	
	public List<Movie> getMovies(){
		return movieService.getMovies();
	}
}
