package com.electro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.models.Cargo;

public interface ICargoRepository extends JpaRepository<Cargo, String> {

}
