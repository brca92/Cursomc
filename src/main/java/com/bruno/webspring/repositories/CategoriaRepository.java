package com.bruno.webspring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.bruno.webspring.domain.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepositoryImplementation<Categoria,Integer>{

	
}
