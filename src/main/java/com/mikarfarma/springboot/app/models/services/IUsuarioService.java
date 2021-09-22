package com.mikarfarma.springboot.app.models.services;

import java.util.List;

import com.mikarfarma.springboot.app.models.entities.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public void delete(Long id);
	
	public Usuario save (Usuario usuario);
}
