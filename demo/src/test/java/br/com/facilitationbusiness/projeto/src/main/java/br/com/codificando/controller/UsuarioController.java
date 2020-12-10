package br.com.codificando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.codificando.model.Usuario;

@Controller
public class UsuarioController {
	
	
	@GetMapping("/")
	public ModelAndView login() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login/login");
		return mv;
		
	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastrar() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("Usuario", new Usuario());
		mv.setViewName("Login/cadastro");
		return mv;
		
	}
	
	@PostMapping("salvarUsuario")
	public ModelAndView cadastrar(Usuario usuario) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("redirect/index");
	return mv;
}
}
