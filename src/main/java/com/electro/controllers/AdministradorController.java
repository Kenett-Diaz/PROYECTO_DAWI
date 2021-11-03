package com.electro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.electro.models.Administrador;
import com.electro.repository.IAdministradorRepository;
import com.electro.repository.IProductoRepository;

@Controller
public class AdministradorController {
	
	
	@Autowired
	private IAdministradorRepository repoadm;
	@Autowired
	private IProductoRepository prod;
	
	//LOGIN DE ADMINISTRADORES
	
		@GetMapping("/loginAdministrador")
		public String loginAdministrador(Model model) {
			model.addAttribute("administrador", new Administrador());
			//logica 

			return "loginAdministrador";
		}
	@PostMapping("/validarAdministrador")
	public String grabarPag(@ModelAttribute Administrador administrador, Model model) {
		
		System.out.println(administrador);
		
		Administrador adm = repoadm.findByUsrAdmAndClaveAdm(administrador.getUsrAdm(),administrador.getClaveAdm());
		System.out.println(adm);
		//validacion
		if(adm==null) {
			model.addAttribute("Usuario",new Administrador());
			model.addAttribute("mensaje","Usuario/Clave incorrecto");
			
			return "loginAdministrador";
		}else {
			model.addAttribute("Usuario", adm);
			model.addAttribute("productos", prod.findAll());
			return "index";
		}
		
		
	}
	
	
}
