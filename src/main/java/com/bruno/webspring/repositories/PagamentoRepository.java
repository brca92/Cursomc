package com.bruno.webspring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.bruno.webspring.domain.Pagamento;

@Repository
public interface PagamentoRepository  extends JpaRepositoryImplementation<Pagamento,Integer>{

	
}
