package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // Criando uma porta para o endpoint...
public class HelloWorldController {
	
	
	
	@GetMapping("") // Rota raíz == não recebe nada na rota
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("bsm")
	public String bsm() {
		return "Atenção ao detalhe, Orientação ao futuro, "
				+ "Persisteência, Trabalho em equipe, Proatividade,"
				+ "Comunicação, mentalidade de crescimento,"
				+ "Responsabilidade Pessoal";
	}
	
	@GetMapping("aprendizado")
	public String aprendizado() {
		return "Aprimorar os BSMS";
	}
	

	@GetMapping("teste")
	public String teste() {
		return "testando";
		
	}
	
	
	// Localhost:8080/view/"bsm" == end point
	
	
}
