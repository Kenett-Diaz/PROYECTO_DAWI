package com.electro.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electro.models.Administrador;

@Qualifier("admins")
@Repository
public interface IAdministradorRepository extends JpaRepository<Administrador, String> {
	
	//CRUD
		 Administrador findByUsrAdmAndClaveAdm(String usrAdm, String claveAdm);
}
