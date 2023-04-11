package com.mb.graphqlschema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.mb.graphqlschema.entity.MyUser;
import com.mb.graphqlschema.query.MyUserMutation;
import com.mb.graphqlschema.query.MyUserQuery;

@Controller
public class MyUserController {

	@Autowired
	private MyUserMutation userMutation;
	
	@Autowired
	private MyUserQuery myUserQuery;
	
	@QueryMapping("users")
	public List<MyUser> getUsers(){
		return myUserQuery.getUsers();
	}
	
	@MutationMapping("createMyUser")
	public MyUser createMyUser(@Argument String name,@Argument String userName,@Argument String password) {
		return userMutation.createMyUser(name, userName, password);
	}
	
	@MutationMapping("updateUser")
	public MyUser updateUser(@Argument Long id, @Argument String name, @Argument String userName, @Argument String password) {
		return userMutation.updateUsers(id, name, userName, password);
	}
	
	@MutationMapping("deleteUser")
	public Boolean deleteUser(@Argument Long id) {
		return userMutation.deleteUser(id);
	}
}
