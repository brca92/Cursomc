package com.bruno.webspring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.bruno.webspring.domain.Endereco;

@Repository
public interface EnderecoRepository  extends JpaRepositoryImplementation<Endereco,Integer>{

	
}
