package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.interfaces.IUsuarioService;
import com.example.demo.beans.Usuario;
import com.example.demo.dao.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

	
	@Autowired

	UsuarioRepository usuariorepository;
	
	
	
	@Override
	public List<Usuario> listarusuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarusuario(String id_usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUsuario(Usuario usuario) {
		
		usuariorepository.save(usuario);

	}

	@Override
	public Usuario buscar_id(String id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
