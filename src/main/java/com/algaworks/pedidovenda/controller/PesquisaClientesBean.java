package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.Endereco;

@ManagedBean
@ViewScoped
public class PesquisaClientesBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Cliente> clientesFiltrados;
	
	
	/*private Cliente cliente;
	
	@Inject
	private Endereco endereco;*/
	
	public PesquisaClientesBean() {
		clientesFiltrados = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		
		cliente = new Cliente();
		cliente.setNome("Supermercado João das Couves Ltda");
		//cliente.setTipo("Jurídica");
		//cliente.setCpfCnpj("02.493.738/0001-83");
		
		clientesFiltrados.add(cliente);
		
		cliente = new Cliente();
		cliente.setNome("Maria Conceição da Abadia");
		//cliente.setTipo("Física");
		//cliente.setCpfCnpj("045.938.553-99");
		
		clientesFiltrados.add(cliente);
		
		cliente = new Cliente();
		cliente.setNome("Supermercado Preço Bom Ltda");
		//cliente.setTipo("Jurídica");
		//cliente.setCpfCnpj("08.111.344/0001-12");
		
		clientesFiltrados.add(cliente);
	}
	
	public List<Endereco> getEnderecos(){
		List<Endereco> enderecosCliente = new ArrayList<Endereco>();
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua das Pedras Grandes Azuis");
		endereco.setNumero("1234");
		endereco.setComplemento("Ap 1022");
		endereco.setCep("38499-533");
		//endereco.setCidadeEstado("Uberlândia/MG");
		
		enderecosCliente.add(endereco);
		
		endereco = new Endereco();
		endereco.setLogradouro("Av. Rondon Pacheco");
		endereco.setNumero("455");
		endereco.setComplemento("Sala 923");
		endereco.setCep("38408-111");
		endereco.setCidade("Uberlândia");
		endereco.setUf("MG");
		
		enderecosCliente.add(endereco);

		
		return enderecosCliente;
	}
	
	public List<Cliente> getClientesFiltrados() {
		return clientesFiltrados;
	}
	

}
