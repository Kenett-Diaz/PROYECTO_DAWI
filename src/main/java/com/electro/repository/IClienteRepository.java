package com.electro.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electro.models.Cliente;

@Qualifier("cliente")
@Repository
public interface IClienteRepository extends JpaRepository<Cliente, String> {

	//CRUD
	Cliente findByUsrClieAndClaveClie(String mailCliente,String claveCliente);
}
