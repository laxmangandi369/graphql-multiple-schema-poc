package com.mb.graphqlschema.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mb.graphqlschema.entity.Theatre;
import com.mb.graphqlschema.service.TheatreService;

import lombok.RequiredArgsConstructor;
@Component
@RequiredArgsConstructor
public class TheatreQuery implements GraphQLQueryResolver{
	
	@Autowired
	private TheatreService theatreService;
	
	public List<Theatre> getTheatres(){
		return theatreService.getTheatres();
	}

}
