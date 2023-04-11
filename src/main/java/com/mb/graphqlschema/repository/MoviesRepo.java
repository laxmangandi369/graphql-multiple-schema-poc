package com.mb.graphqlschema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.graphqlschema.entity.Movie;

@Repository
public interface MoviesRepo extends JpaRepository<Movie, Long>{

	
	Movie findByTitle(String title);
}
