package com.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
	
	@GetMapping
	public String habilidades() {
		return"A habilidade utilizada nessa aula foi: atenção aos detalhes e a mentalidade: persistência";
		
	}
	

}
