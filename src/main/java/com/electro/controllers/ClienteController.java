package com.electro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.electro.models.Administrador;
import com.electro.models.Cliente;
import com.electro.models.Producto;
import com.electro.repository.IClienteRepository;
import com.electro.repository.IDistritoRepository;
import com.electro.repository.IProductoRepository;

@Controller
public class ClienteController {
	
	
	@Autowired
	private IClienteRepository repocli;
	@Autowired
	private IProductoRepository prod;
	@Autowired
	private IDistritoRepository repodis;
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

	
		@GetMapping("/cargarCli")
		public String cargarCli(Model model) {
			model.addAttribute("cliente", new Cliente());
			model.addAttribute("lstCliente",repocli.findAll());
			model.addAttribute("lstDistrito", repodis.findAll());
			
			return "mantenimientoCliente";
		}
		
		@PostMapping("/grabarCli")
		public String grabarCli(@ModelAttribute Cliente cliente, Model model) {
			
			repocli.save(cliente);	
			model.addAttribute("lstDistrito", repodis.findAll());
			model.addAttribute("lstCliente",repocli.findAll());
			 model.addAttribute("mensaje","Registro/Actualizacón exitosa!");
			return "listadoCliente";
		}

		@GetMapping("/listarCli")
		public String listarCliente(Model model) {
			model.addAttribute("lstCliente",repocli.findAll());
			model.addAttribute("lstDistrito", repodis.findAll());
			return "listadoCliente";
		}
		
		
		@PostMapping("/editarCli")
		public String buscarCli(@ModelAttribute Cliente c, Model model) {

		model.addAttribute("cliente", repocli.findById(c.getCodigoCliente()));
		  model.addAttribute("lstCliente",repocli.findAll()); 
			model.addAttribute("lstDistrito", repodis.findAll());
			 
			return "editarCliente";
		}
		
		
		
		@PostMapping("/eliminarCli")
		public String eliminarCli(@ModelAttribute Cliente c,Model model) {
			
			try {
				   model.addAttribute("cliente", new Cliente());
				   repocli.deleteById(c.getCodigoCliente());
				   model.addAttribute("lstCliente",repocli.findAll()); 
					model.addAttribute("lstDistrito", repodis.findAll());
					
				   model.addAttribute("mensaje","Cliente Eliminado");
				   
					return "listadoCliente";
			} catch (Exception e) {
				 model.addAttribute("cliente", repocli.findById(c.getCodigoCliente()));
					model.addAttribute("lstDistrito", repodis.findAll());	  
		
				 
				   model.addAttribute("mensaje","Error de la llave foránea");
				   
					return "eliminarCli";
			}
		 
		} 
		
			
		@PostMapping("/cargarEliminarCliente")
		public String cargarEliminarCliente(@ModelAttribute Cliente c,Model model) {
			model.addAttribute("cliente", repocli.findById(c.getCodigoCliente()));
			model.addAttribute("lstDistrito", repodis.findAll());
		
			
			return "eliminarCli";
		}

	
		
		
		
	}

