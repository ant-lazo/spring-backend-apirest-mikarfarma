package com.mikarfarma.springboot.app.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 45)
	private String username;
	
	@Column(length = 60)
	private String password;
	private Boolean enabled;
	
	private String nombre;
	private String apellido;
	
	@Column(unique = true, length = 65)
	private String email;
	
	@Column(unique = true, length = 9)
	private Long telefono;

	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="usuarios_roles", joinColumns = @JoinColumn(name="usuario_id")
	, inverseJoinColumns = @JoinColumn(name="role_id")
	, uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id","role_id"})})
	private List<Role> roles;
	
	private static final long serialVersionUID = 1L;

}
