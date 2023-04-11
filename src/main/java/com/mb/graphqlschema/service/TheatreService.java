package com.mb.graphqlschema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.graphqlschema.entity.Theatre;
import com.mb.graphqlschema.repository.TheatreRepo;

@Service
public class TheatreService {

	@Autowired
	private TheatreRepo theatreRepo;
	
	public List<Theatre> getTheatres(){
		return theatreRepo.findAll();
	}
}
