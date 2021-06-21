package com.cliente.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.cadastro.model.Cliente;
import com.cliente.cadastro.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> buscarClientes(){
		return clienteService.listaClientes();
	}
	
	@GetMapping("/{id_cliente}")
	public Cliente buscarClienteById(@PathVariable int id) {
		return clienteService.listaClienteById(id);
	}
	
	@GetMapping("/{nome}")
	public Cliente buscarClienteByNome(@PathVariable String nome) {
		return clienteService.listaClienteByName(nome);
	}
	
	@PostMapping
	public Cliente adicionarCliente(@RequestBody Cliente cliente) {
		return clienteService.salvarCliente(cliente);
	}
	
	@PutMapping("/")
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return clienteService.updateCliente(cliente);
	}
	
	@DeleteMapping("/{id_cliente}")
	public String removerCliente(@PathVariable int id) {
		return clienteService.deleteCliente(id);
	}
	
	
}
