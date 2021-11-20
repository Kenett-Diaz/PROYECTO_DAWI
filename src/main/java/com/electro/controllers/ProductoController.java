package com.electro.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.electro.models.Producto;

import com.electro.repository.ICategoriaRepository;
import com.electro.repository.IProductoRepository;

@Controller
public class ProductoController {
	@Autowired
	private IProductoRepository repo;
	@Autowired
	private ICategoriaRepository repoc;
	
	@GetMapping("/cargarProd")
	public String cargarProd(Model model) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("lstProductos",repo.findAll());
		model.addAttribute("lstCategorias", repoc.findAll());
		
		return "mantenimientoProductos";
	}
	
	@PostMapping("/grabarProd")
	public String grabarProd(@ModelAttribute Producto producto, Model model) {
		
		repo.save(producto);	//funciona como el merge, o sea que no solo graba tambien actualiza
		model.addAttribute("lstCategorias", repoc.findAll());
		model.addAttribute("lstProductos",repo.findAll());
		 model.addAttribute("mensaje","Registro/Actualizacón exitosa!");
		return "listadoProd";
	}

	@GetMapping("/listarProd")
	public String listaProductos(Model model) {
		model.addAttribute("lstProductos",repo.findAll());
		model.addAttribute("lstCategorias", repoc.findAll());
		return "listadoProd";
	}
	
	
	@PostMapping("/editarProd")
	public String buscarProd(@ModelAttribute Producto p, Model model) {
		model.addAttribute("producto", repo.findById(p.getCodigoProducto()));
		model.addAttribute("lstCategorias", repoc.findAll());
		 
		return "editarProductos";
	}
	
	@PostMapping("/eliminarProd")
	public String eliminarProd(@ModelAttribute Producto p,Model model) {
		
		try {
			 model.addAttribute("producto", new Producto());
			   repo.deleteById(p.getCodigoProducto());
			   model.addAttribute("lstCategorias", repoc.findAll());
			   model.addAttribute("lstProductos",repo.findAll()); 
			   model.addAttribute("mensaje","Producto Eliminado");
			   
				return "listadoProd";
		} catch (Exception e) {
			  model.addAttribute("producto", repo.findById(p.getCodigoProducto()));
			  
			   model.addAttribute("lstCategorias", repoc.findAll());
			 
			   model.addAttribute("mensaje","Error de la llave foránea");
			   
				return "eliminarProductos";
		}
	 
	} 
	
	@PostMapping("/cargarEliminar")
	public String cargarEliminar(@ModelAttribute Producto p,Model model) {
		
		model.addAttribute("producto", repo.findById(p.getCodigoProducto()));
		model.addAttribute("lstCategorias", repoc.findAll());
		
		return "eliminarProductos";
	}
}

