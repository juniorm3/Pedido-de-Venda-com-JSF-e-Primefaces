package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.algaworks.pedidovenda.model.Grupo;
import com.algaworks.pedidovenda.model.Usuario;

@ManagedBean
@RequestScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Usuario> usuariosCadastrados;
	private List<Grupo> grupos;
	
	public CadastroUsuarioBean() {
		usuariosCadastrados = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		//usuario.setGrupo(Grupo.AUXILIARES);
		
		usuariosCadastrados.add(usuario);
		
		usuario = new Usuario();
		//usuario.setGrupo(Grupo.VENDEDORES);
		
		usuariosCadastrados.add(usuario);
		
		
		//grupos = Arrays.asList(Grupo.values());
	}
	
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public List<Usuario> getUsuariosCadastrados() {
		return usuariosCadastrados;
	}
}
