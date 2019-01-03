package com.bruno.webspring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.bruno.webspring.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepositoryImplementation<Produto,Integer>{

	
}
