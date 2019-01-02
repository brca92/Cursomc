package com.bruno.webspring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.webspring.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cati1=new Categoria(1,"InformÃ¡tica");
		Categoria cati2=new Categoria(2,"EscritÃ³rio");
		
		List<Categoria> lista=new ArrayList<>();
		lista.add(cati1);
		lista.add(cati2);
		
		return lista;
	}
	
}