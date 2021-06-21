package com.cliente.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.cadastro.model.Telefone;
import com.cliente.cadastro.service.TelefoneService;

@RestController
@RequestMapping("/telefones")
public class TelefoneController {
	
	@Autowired
	private TelefoneService telefoneService;
	
	@GetMapping
	/*public List<Cliente> buscarClientes(){
		return clienteService.listaClientes();
	}
	
	@GetMapping("/{id_cliente}")
	public Cliente buscarClienteById(@PathVariable int id) {
		return clienteService.listaClienteById(id);
	}
	
	@GetMapping("/{nome}")
	public Cliente buscarClienteByNome(@PathVariable String nome) {
		return clienteService.listaClienteByName(nome);
	}*/
	
	@PostMapping("/")
	public Telefone adicionarTelefone(@RequestBody Telefone telefone) {
		return telefoneService.salvarTelefone(telefone);
	}
	
	/*@PutMapping("/")
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return clienteService.updateCliente(cliente);
	}
	
	@DeleteMapping("/{id_cliente}")
	public String removerCliente(@PathVariable int id) {
		return clienteService.deleteCliente(id);
	}*/
}
