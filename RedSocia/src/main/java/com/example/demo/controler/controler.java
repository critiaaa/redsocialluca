package com.example.demo.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.interfaces.IUsuarioService;
import com.example.demo.beans.Usuario;

@Controller
public class controler {

	
	@Autowired
	IUsuarioService  usuarioService;
	
	
	@RequestMapping("/")
	public String inicio (HttpServletRequest request) {
		
		return "registrar";
		}
	
	@RequestMapping("/registrarusuario")
	public String registrarusuario (HttpServletRequest request) {
		
			 String id_usuario=request.getParameter("nombre");
			 String contraseña=request.getParameter("contraseña");
			 String correo=request.getParameter("correo");

			 System.out.println("entramos en registrar user");
		
			 System.out.println(id_usuario);
			 System.out.println(contraseña);
			 System.out.println(correo);
			 
			 Usuario usuario= new Usuario();
			 
			 usuario.setId_usuario(id_usuario);
			 usuario.setId_usuario(contraseña);
			 usuario.setId_usuario(correo);
			 
			 usuarioService.addUsuario(usuario);
			 

		/*
		 * String pass=request.getParameter("password"); String
		 * email=request.getParameter("email"); int telefono=
		 * Integer.parseInt(request.getParameter("telefono"));
		 * 
		 * Usuarios usuario=new Usuarios(); usuario.setId_usuario(nombre);
		 * usuario.setPass(pass); usuario.setEmail(email);
		 * usuario.setTelefono(telefono);
		 * 
		 * System.out.println(usuario);
		 * 
		 * 
		 * usuarioservice.addUsuario(usuario);
		 */
			 
			return "registrar"; //señala a los jsp
						
		}
	
	
}
