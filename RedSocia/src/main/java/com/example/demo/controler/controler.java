package com.example.demo.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
			 String pass=request.getParameter("pass");
			 String correo=request.getParameter("correo");

			 System.out.println("entramos en registrar user");
		
			 System.out.println(id_usuario);
			 System.out.println(pass);
			 System.out.println(correo);
			 
			 Usuario usuario= new Usuario();
			 
			 usuario.setId_usuario(id_usuario);
			 usuario.setContraseña(pass);
			 usuario.setCorreo(correo);
			 
			 usuarioService.addUsuario(usuario);
			 
		return "login"; //señala a los jsp
						
		}
	
	@RequestMapping("/logear") //listamos las categorias, serie una especie de Servlet...
	public String inicio4(HttpServletRequest request) {
		 
		 
		return "login"; //señala a los jsp
					
	}
	

	@RequestMapping("/logearuser") //listamos las categorias, serie una especie de Servlet...
	public String inicio5(HttpServletRequest request) {
		HttpSession sesion=request.getSession(true); //NUBE - ABRO SESION

		
		String id_usuario=request.getParameter("nombre");
		String pass=request.getParameter("pass");

		Usuario usuario = usuarioService.buscarByIdUsuario(id_usuario); 
		
		if(usuario!=null)
		{
			if(usuario.getId_usuario().equalsIgnoreCase(id_usuario)&& usuario.getContraseña().equals(pass))
			{
				System.out.println("rr");
				return "index"; 
			}else {
				return "login"; 
			}
		}
		
		
		
		
		/*
		 * usuario = usuarioService.buscar_id(nombre);
		 * 
		 * 
		 * request.setAttribute("listado", usuario.getAnuncios());
		 * 
		 * request.setAttribute("usuarioid", usuario); sesion.setAttribute("usuarioids",
		 * usuario);
		 * 
		 * request.setAttribute("anuncios",
		 * anuncioservice.listaranunciosbyuser(nombre));
		 */
	

		return "login"; //señala a los jsp
					
	}
	
	
	
}
