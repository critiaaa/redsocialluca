package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
		return null;
	}
	
	@Override
	public Usuario buscarByIdUsuario(String id_usuario) {
		System.out.println("enter user");

		Optional<Usuario> usuarios = usuariorepository.findById(id_usuario);
		if(usuarios.isPresent()) {
			Usuario usuario = usuarios.get();
			System.out.println(usuario);
			return usuario;
		}
		return null;
	}}
