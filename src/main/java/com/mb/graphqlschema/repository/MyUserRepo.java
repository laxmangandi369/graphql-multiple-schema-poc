package com.mb.graphqlschema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.graphqlschema.entity.MyUser;

@Repository
public interface MyUserRepo extends JpaRepository<MyUser, Long>{

	MyUser findByUserName(String userName);
}
