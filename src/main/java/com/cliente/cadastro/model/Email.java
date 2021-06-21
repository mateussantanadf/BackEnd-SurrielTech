package com.cliente.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Email")
public class Email {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_email;
	@NotBlank
	private String email;
	
	public int getId() {
		return id_email;
	}
	public void setId(int id) {
		this.id_email = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getId_email() {
		return id_email;
	}

	public void setId_email(int id_email) {
		this.id_email = id_email;
	}
	
		
}
