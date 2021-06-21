package com.cliente.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.cadastro.model.Endereco;
import com.cliente.cadastro.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco salvarEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> listaEnderecos(){
		return enderecoRepository.findAll();
	}
	
	public Endereco listaEnderecoById(int id){
		return enderecoRepository.findById(id).orElse(null);
	}
	
	public String deleteEndereco(int id) {
		enderecoRepository.deleteById(id);
		return "Endereço removido !! "+id;
	}
	
	public Endereco updateEndereco(Endereco endereco) {
		Endereco existingEndereco=enderecoRepository.findById(endereco.getId()).orElse(null);
		existingEndereco.setCep(endereco.getCep());
		existingEndereco.setLogradouro(endereco.getLogradouro());
		existingEndereco.setBairro(endereco.getBairro());
		existingEndereco.setCidade(endereco.getCidade());
		existingEndereco.setUf(endereco.getUf());
		existingEndereco.setComplemento(endereco.getComplemento());
		return enderecoRepository.save(existingEndereco);
	}
}
