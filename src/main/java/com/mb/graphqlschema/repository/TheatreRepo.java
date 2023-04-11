package com.mb.graphqlschema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.graphqlschema.entity.Theatre;
@Repository
public interface TheatreRepo extends JpaRepository<Theatre, Long>{

}
