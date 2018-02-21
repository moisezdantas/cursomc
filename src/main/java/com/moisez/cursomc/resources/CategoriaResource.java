/**
 * 
 */
package com.moisez.cursomc.resources;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moisez.cursomc.domain.Categoria;

/**
 * @author moisez_dantas
 *
 */
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Categoria> listar(){
		
		Categoria cat1 = new Categoria(1, "Informáttica");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		Collection<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
		
	}
}
