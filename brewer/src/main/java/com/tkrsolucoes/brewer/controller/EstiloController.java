package com.tkrsolucoes.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.tkrsolucoes.brewer.model.Estilo;

@Controller
public class EstiloController {
	
	
	@RequestMapping("/estilos/novo")
	public String novo(Model model) {
		model.addAttribute(new Estilo());
		return "estilo/CadastroEstilo";
	}
	

}
