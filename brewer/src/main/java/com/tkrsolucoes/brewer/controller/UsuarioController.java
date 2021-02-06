package com.tkrsolucoes.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.tkrsolucoes.brewer.model.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping("/usuarios/novo")
	public String novo(Model model) {
		model.addAttribute(new Usuario());
		return "usuario/CadastroUsuario";
	}
	

}
