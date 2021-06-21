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

import com.cliente.cadastro.model.Email;
import com.cliente.cadastro.service.EmailService;

@RestController
@RequestMapping("/emails")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping
	public List<Email> buscarEmails(){
		return emailService.listaEmails();
	}
	
	@GetMapping("/{id_email}")
	public Email buscarEmailById(@PathVariable int id) {
		return emailService.listaEmailById(id);
	}
	
	@PostMapping("/")
	public Email adicionarEmail(@RequestBody Email email) {
		return emailService.salvarEmail(email);
	}
	
	@PutMapping("/")
	public Email atualizarEmail(@RequestBody Email email) {
		return emailService.updateEmail(email);
	}
	
	@DeleteMapping("/{id_cliente}")
	public String removerEmail(@PathVariable int id) {
		return emailService.deleteEmail(id);
	}
}
