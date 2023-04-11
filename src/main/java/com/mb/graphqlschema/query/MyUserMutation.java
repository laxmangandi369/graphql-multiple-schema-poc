package com.mb.graphqlschema.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mb.graphqlschema.entity.MyUser;
import com.mb.graphqlschema.service.MyUserService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MyUserMutation implements GraphQLMutationResolver{

	@Autowired
	private MyUserService userService;
	
	public MyUser createMyUser(String name, String userName, String password) {
		return userService.createMyUser(name, userName, password);
	}
	
	public MyUser updateUsers(Long id, String name, String userName, String password) {
		return userService.updateUsers(id, name, userName, password);
	}
	
	public Boolean deleteUser(Long id) {
		return userService.deleteUser(id);
	}
}
