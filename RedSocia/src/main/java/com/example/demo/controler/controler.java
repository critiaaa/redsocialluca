package com.example.demo.controler;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controler {

	@RequestMapping("/")
	public String inicio (HttpServletRequest request) {
		
		return "index";
		}
	
	@RequestMapping("/registrarusuario")
	public String registrarusuario (HttpServletRequest request) {
		
		return "registrar";
		}
	
}
