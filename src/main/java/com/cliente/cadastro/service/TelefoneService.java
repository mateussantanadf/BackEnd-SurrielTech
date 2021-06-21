package com.cliente.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.cadastro.model.Telefone;
import com.cliente.cadastro.repository.TelefoneRepository;

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public Telefone salvarTelefone(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}
	
	public List<Telefone> listaTelefones(){
		return telefoneRepository.findAll();
	}
	
	public Telefone listaTelefoneById(int id){
		return telefoneRepository.findById(id).orElse(null);
	}

	public String deleteTelefone(int id) {
		telefoneRepository.deleteById(id);
		return "Telefone removido !! "+id;
	}
	
	public Telefone updateCliente(Telefone telefone) {
		Telefone existingTelefone=telefoneRepository.findById(telefone.getId()).orElse(null);
		existingTelefone.setTelefone(telefone.getTelefone());
		return telefoneRepository.save(existingTelefone);
	}
}
