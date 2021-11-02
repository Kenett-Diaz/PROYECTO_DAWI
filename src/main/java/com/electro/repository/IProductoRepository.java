package com.electro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.models.Producto;

public interface IProductoRepository  extends JpaRepository<Producto, String>{
	
	
}
