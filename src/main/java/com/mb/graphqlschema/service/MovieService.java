package com.mb.graphqlschema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.graphqlschema.entity.Movie;
import com.mb.graphqlschema.repository.MoviesRepo;

@Service
public class MovieService {

		@Autowired
		private MoviesRepo moviesRepo;
		
		public List<Movie> getMovies(){
			return moviesRepo.findAll();
		}
		
		public Movie createMovie(String title, int lenth) {
			Movie movie = moviesRepo.findByTitle(title);
			if(movie == null) {
				Movie newMovie = new Movie();
				newMovie.setLength(lenth);
				newMovie.setTitle(title);
				return moviesRepo.save(newMovie);
			}
			return null;	
		}
		
		public Movie updateMovie(Long id, String title, int length) {
			Movie movie = moviesRepo.findById(id).get();
			
			if(movie == null) {
				return null;
			}else {
				if(title!=null)
					movie.setTitle(title);
				if(length>0)
					movie.setLength(length);
				return movie;
			}
		}
		
		public Boolean deleteMovie(Long id) {
			Movie movie = moviesRepo.findById(id).get();
			if(movie == null)
				return null;
			else {
				moviesRepo.delete(movie);
				return true;
			}
		}
}
