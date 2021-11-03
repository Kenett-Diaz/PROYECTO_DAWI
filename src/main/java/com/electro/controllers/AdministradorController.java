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

@Controller
@RequestMapping(path="/logadm")
public class AdministradorController {
	
	
	@Autowired
	private IAdministradorRepository repoadm;
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("cliente", new Administrador());
		return "login";
	}
	
	@PostMapping("/validar")
	public String grabarPag(@ModelAttribute Administrador administrador, Model model) {
		
		System.out.println(administrador);
		
		Administrador adm = repoadm.findByUsrAdmAndClaveAdm(administrador.getUsrAdm(),administrador.getClaveAdm());
		System.out.println(adm);
		//validacion
		if(adm==null) {
			model.addAttribute("Usuario",new Administrador());
			model.addAttribute("mensaje","Usuario/Clave incorrecto");
			
			return "login";
		}else {
			model.addAttribute("Usuario", adm);
			
			return "/index";
		}
		
		
	}
	
	
}
