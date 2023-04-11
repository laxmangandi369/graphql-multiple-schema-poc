package com.mb.graphqlschema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.mb.graphqlschema.entity.Theatre;
import com.mb.graphqlschema.query.TheatreQuery;

@Controller
public class TheatreController {

	@Autowired
	private TheatreQuery theatreQuery;
	
	@QueryMapping("getTheaters")
	public List<Theatre> getTheatres() {
		return theatreQuery.getTheatres();
	}
}
