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

import com.cliente.cadastro.model.Endereco;
import com.cliente.cadastro.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping
	public List<Endereco> buscarEnderecos(){
		return enderecoService.listaEnderecos();
	}
	
	@GetMapping("/{id_endereco}")
	public Endereco buscarEnderecoById(@PathVariable int id) {
		return enderecoService.listaEnderecoById(id);
	}
	
	@PostMapping("/")
	public Endereco adicionarEndereco(@RequestBody Endereco endereco) {
		return enderecoService.salvarEndereco(endereco);
	}
	
	@PutMapping("/")
	public Endereco atualizarEndereco(@RequestBody Endereco endereco) {
		return enderecoService.updateEndereco(endereco);
	}
	
	@DeleteMapping("/{id_endereco}")
	public String removerEndereco(@PathVariable int id) {
		return enderecoService.deleteEndereco(id);
	}
}
