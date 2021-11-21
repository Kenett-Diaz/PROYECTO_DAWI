package com.electro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.electro.models.Administrador;
import com.electro.models.Producto;
import com.electro.repository.IAdministradorRepository;
import com.electro.repository.ICargoRepository;
import com.electro.repository.ICategoriaRepository;
import com.electro.repository.IDistritoRepository;
import com.electro.repository.IProductoRepository;

@Controller
public class AdministradorController {
	
	
	@Autowired
	private IAdministradorRepository repoadm;
	@Autowired
	private IProductoRepository prod;
	@Autowired
	private ICargoRepository repoc;
	@Autowired
	private IDistritoRepository repodis;
	//LOGIN DE ADMINISTRADORES
	
		@GetMapping("/loginAdministrador")
		public String loginAdministrador(Model model) {
			model.addAttribute("administrador", new Administrador());

			return "loginAdministrador";
		}
	@PostMapping("/validarAdministrador")
	public String grabarPag(@ModelAttribute Administrador administrador, Model model) {
		
		System.out.println(administrador);
		
		Administrador adm = repoadm.findByUsrAdmAndClaveAdm(administrador.getUsrAdm(),administrador.getClaveAdm());
		System.out.println(adm);

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
	
	
	//MANTENIENT
	
	@GetMapping("/cargarAdmi")
	public String cargarAdmi(Model model) {
		model.addAttribute("administrador", new Administrador());
		model.addAttribute("lstAdministrador",repoadm.findAll());
		model.addAttribute("lstCargo", repoc.findAll());
		model.addAttribute("lstDistrito", repodis.findAll());
		
		return "mantenimientoProductos";
	}
	
	@PostMapping("/grabarAdmi")
	public String grabarAdmi(@ModelAttribute Administrador administrador, Model model) {
		
		repoadm.save(administrador);	
		model.addAttribute("lstDistrito", repodis.findAll());
		model.addAttribute("lstCargo", repoc.findAll());
		model.addAttribute("lstAdministrador",repoadm.findAll());
		 model.addAttribute("mensaje","Registro/Actualizacón exitosa!");
		return "listadoAdmi";
	}

	@GetMapping("/listarAdmi")
	public String listaAdministrador(Model model) {
		model.addAttribute("lstAdministrador",repoadm.findAll());
		model.addAttribute("lstCargo", repoc.findAll());
		model.addAttribute("lstDistrito", repodis.findAll());
		return "listadoAdmi";
	}
	
	
	@PostMapping("/editarAdmi")
	public String buscarProd(@ModelAttribute Administrador p, Model model) {
		model.addAttribute("administrador", repoadm.findById(p.getCodigoAdm()));
		model.addAttribute("lstCargo", repoc.findAll());
		model.addAttribute("lstDistrito", repodis.findAll());
		 
		return "editarAdministrador";
	}
	
	@PostMapping("/eliminarAdmi")
	public String eliminarAdmi(@ModelAttribute Administrador p,Model model) {
		
		try {
			 model.addAttribute("administrador", new Administrador());
			   repoadm.deleteById(p.getCodigoAdm());
				model.addAttribute("lstDistrito", repodis.findAll());
			   model.addAttribute("lstCargo", repoc.findAll());
			   model.addAttribute("lstAdministrador",repoadm.findAll()); 
			   model.addAttribute("mensaje","Administrador Eliminado");
			   
				return "listadoAdmi";
		} catch (Exception e) {
			  model.addAttribute("administrador", repoadm.findById(p.getCodigoAdm()));
				model.addAttribute("lstDistrito", repodis.findAll());	  
			   model.addAttribute("lstCargo", repoc.findAll());
			 
			   model.addAttribute("mensaje","Error de la llave foránea");
			   
				return "eliminarAdministrador";
		}
	 
	} 
	
	@PostMapping("/cargarEliminar")
	public String cargarEliminar(@ModelAttribute Administrador p,Model model) {
		model.addAttribute("lstDistrito", repodis.findAll());
		model.addAttribute("administrador", repoadm.findById(p.getCodigoAdm()));
		model.addAttribute("lstCargo", repoc.findAll());
		
		return "eliminarAdministrador";
	}
	
	
	
	
	
}
