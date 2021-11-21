package com.electro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.models.Cargo;
import com.electro.models.Categoria;

public interface ICargoRepository extends JpaRepository<Cargo, String> {

}
