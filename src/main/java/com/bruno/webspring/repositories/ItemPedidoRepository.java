package com.bruno.webspring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.bruno.webspring.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository  extends JpaRepositoryImplementation<ItemPedido,Integer>{

	
}
