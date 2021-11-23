package com.electro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.electro.models.Cliente;
import com.electro.repository.IClienteRepository;
import com.electro.repository.IDistritoRepository;
import com.electro.repository.IProductoRepository;

import org.springframework.ui.Model;

@Controller
public class IndexController {
	
	
	@Autowired
	private IProductoRepository prod;
	@Autowired
	private IClienteRepository repocli;
 	@Autowired
	private IDistritoRepository repodis;

	
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
	public String registroCliente(Model model) {
		//logica 
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("lstCliente",repocli.findAll());
		model.addAttribute("lstDistrito", repodis.findAll());
		
		return "registroCliente";
	}
	
	@PostMapping("/grabarCliente")
	public String grabarCliente(@ModelAttribute Cliente cliente, Model model) {
		
		repocli.save(cliente);	
		model.addAttribute("lstDistrito", repodis.findAll());
		model.addAttribute("lstCliente",repocli.findAll());
		 model.addAttribute("mensaje","Registro del cliente exitoso!");
		return "login";
	}
	
	
}
