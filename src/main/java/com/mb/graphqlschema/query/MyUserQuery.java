package com.mb.graphqlschema.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mb.graphqlschema.entity.MyUser;
import com.mb.graphqlschema.service.MyUserService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MyUserQuery implements GraphQLQueryResolver{
	
	@Autowired
	private MyUserService myUserService;
	
	public List<MyUser> getUsers(){
		return myUserService.getUsers();
	}

}
