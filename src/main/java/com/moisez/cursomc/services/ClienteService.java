package com.moisez.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moisez.cursomc.domain.Cliente;
import com.moisez.cursomc.repository.ClienteRepository;
import com.moisez.cursomc.services.exepetions.ObjectNotFoundException;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id){
		Cliente cliente = clienteRepository.findOne(id);
		if(cliente == null){
			throw new ObjectNotFoundException("Objeto não encontrado id: " + id + ", Tipo " + Cliente.class.getName());
		}
		return cliente;
	}
	
}
