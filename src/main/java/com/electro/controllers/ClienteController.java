package com.electro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.electro.models.Cliente;
import com.electro.repository.IClienteRepository;
import com.electro.repository.IProductoRepository;

@Controller
public class ClienteController {
	
	
	@Autowired
	private IClienteRepository repocli;
	@Autowired
	private IProductoRepository prod;
	
	//LOGIN DE ADMINISTRADORES
	
		@GetMapping("/login")
		public String login(Model model) {
			model.addAttribute("cliente", new Cliente());
			return "login";
		}
		
		
	@PostMapping("/validarCliente")
	public String grabarPag(@ModelAttribute Cliente cliente, Model model) {
		
		System.out.println(cliente);
		
		Cliente clie=repocli.findByMailClienteAndClaveCliente(cliente.getMailCliente(), cliente.getClaveCliente());
		System.out.println(clie);
		
		//validacion
		if(clie==null) {
			model.addAttribute("Usuario",new Cliente());
			model.addAttribute("mensaje","Usuario/Clave incorrecto");
			
			return "login";
		}else {
			model.addAttribute("Usuario", clie);
			model.addAttribute("productos", prod.findAll());
			return "index";
		}
		
		
	}
}
	
 	
