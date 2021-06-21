package com.cliente.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cliente.cadastro.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer>{

}
