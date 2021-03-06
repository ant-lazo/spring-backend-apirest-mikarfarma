package com.mikarfarma.springboot.app.models.services;

import java.util.List;

import com.mikarfarma.springboot.app.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Cliente> findByEmail(String email);

}
