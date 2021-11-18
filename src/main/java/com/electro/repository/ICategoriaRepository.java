package com.electro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electro.models.Categoria;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {

	//
}
