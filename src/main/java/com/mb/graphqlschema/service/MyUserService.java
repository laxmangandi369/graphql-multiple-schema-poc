package com.mb.graphqlschema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.graphqlschema.entity.MyUser;
import com.mb.graphqlschema.repository.MyUserRepo;

@Service
public class MyUserService {

	@Autowired
	private MyUserRepo userRepo;
	
	public List<MyUser> getUsers(){
		return userRepo.findAll();
	}
	
	public MyUser createMyUser(String name, String userName, String password) {
		MyUser myUser = userRepo.findByUserName(userName);
		if(myUser == null) {
			MyUser user = new MyUser(name,userName,password);
			
			return userRepo.save(user);	
		}
		return null;
	}
	
	public MyUser updateUsers(Long id, String name, String userName, String password) {
		MyUser users = userRepo.findById(id).get();
		if(users !=null) {
			if(name != null)
				users.setName(name);
			if(userName != null)
				users.setUserName(userName);
			if(password !=null)
				users.setPassword(password);
			return userRepo.save(users);
			
		}
		return null;
	}
	
	public Boolean deleteUser(Long id) {
		MyUser users = userRepo.findById(id).get();
		
		if(users != null) {
			userRepo.delete(users);
			return true;
		}
		else
			return false;
	}
}
