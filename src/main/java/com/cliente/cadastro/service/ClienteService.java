package com.cliente.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.cadastro.model.Cliente;
import com.cliente.cadastro.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	
	public Cliente listaClienteById(int id){
		return clienteRepository.findById(id).orElse(null);
	}
	
	public Cliente listaClienteByName(String nome){
		return clienteRepository.findByNome(nome);
	}
	
	public String deleteCliente(int id) {
		clienteRepository.deleteById(id);
		return "Cliente removido !! "+id;
	}
	
	public Cliente updateCliente(Cliente cliente) {
		Cliente existingCliente=clienteRepository.findById(cliente.getId_cliente()).orElse(null);
		existingCliente.setNome(cliente.getNome());
		existingCliente.setCpf(cliente.getCpf());
		existingCliente.setEnderecos(cliente.getEnderecos());
		existingCliente.setTelefones(cliente.getTelefones());
		existingCliente.setEmails(cliente.getEmails());
		return clienteRepository.save(existingCliente);
	}
}
