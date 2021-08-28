package com.mikarfarma.springboot.app.models.services;

import com.mikarfarma.springboot.app.models.entities.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
