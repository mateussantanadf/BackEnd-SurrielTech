package com.cliente.cadastro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	@NotEmpty
	@Size(min = 3, max = 100)
	private String nome;
	@NotNull
	private Long cpf;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id_cliente")
	private List<Endereco> enderecos;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id_cliente")
	private List<Telefone> telefones;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id_cliente")
	private List<Email> emails;
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	
	
	
	
}
