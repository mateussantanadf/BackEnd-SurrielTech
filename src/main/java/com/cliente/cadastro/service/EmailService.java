package com.cliente.cadastro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cliente.cadastro.model.Email;
import com.cliente.cadastro.repository.EmailRepository;

@Service
public class EmailService {
	
	private EmailRepository emailRepository;
	
	public Email salvarEmail(Email email) {
		return emailRepository.save(email);
	}
	
	public List<Email> salvarEmails(List<Email> emails) {
		return emailRepository.saveAll(emails);
	}
	
	public List<Email> listaEmails(){
		return emailRepository.findAll();
	}
	
	public Email listaEmailById(int id){
		return emailRepository.findById(id).orElse(null);
	}
	
	public String deleteEmail(int id) {
		emailRepository.deleteById(id);
		return "Email removido !! "+id;
	}
	
	public Email updateEmail(Email email) {
		Email existingEmail=emailRepository.findById(email.getId()).orElse(null);
		existingEmail.setEmail(email.getEmail());
		return emailRepository.save(existingEmail);
	}
}
