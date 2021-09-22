package com.mikarfarma.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mikarfarma.springboot.app.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
	public List<Cliente> findByEmail(String email);
	
}
