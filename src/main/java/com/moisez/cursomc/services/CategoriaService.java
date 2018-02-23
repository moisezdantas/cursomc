package com.moisez.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moisez.cursomc.domain.Categoria;
import com.moisez.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id){
		Categoria categoria = categoriaRepository.findOne(id);
		return categoria;
	}
	
}
