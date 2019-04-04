package com.example.demo.bean.interfaces;

import java.util.List;

import com.example.demo.beans.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listarusuarios();
	public void borrarusuario(String id_usuario);
	public void addUsuario(Usuario usuario);
	public Usuario buscar_id(String id_usuario);
	public Usuario buscarByIdUsuario(String id_usuario);

}
