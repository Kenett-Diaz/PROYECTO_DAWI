package com.electro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.electro.repository.IProductoRepository;

import org.springframework.ui.Model;

@Controller
public class IndexController {
	
	
	@Autowired
	private IProductoRepository prod;
	
	/*
	 
	 
	 @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	 
	 
	 */
	

	
	/*para el index y su listado */
	@GetMapping("/index")
	public String index(Model model) {
		//logica 
		
		model.addAttribute("productos", prod.findAll());
		System.out.println(prod);
		return "index";
	}
	
	//CONOCENOS
	@GetMapping("/conocenos")
	public String conocenos() {
		//logica 
		
		
		return "conocenos";
	}
	
	//LOGIN DE USUARIOS
	@GetMapping("/loginUsuarios")
	public String login() {
		//logica 
		
		
		return "login";
	}
	
	
	//REGISTRO DE USUARIOS
	@GetMapping("/registroCliente")
	public String registroCliente() {
		//logica 
		
		
		return "registroCliente";
	}
	//LOGIN DE ADMINISTRADORES
	
	@GetMapping("/loginAdministrador")
	public String loginAdministrador() {
		//logica 
		
		
		return "loginAdministrador";
	}
	
}
