package com.example.demo.bean.interfaces;

import java.util.List;

import com.example.demo.beans.Seguidores;

public interface ISeguidoresService {

	public List<Seguidores> listarseguidores();
	public void borrarSeguidor(String id_usuario);
	public void addSeguidor(Seguidores seguidor);
	public Seguidores buscar_id(String id_usuario);
	public Seguidores buscar_seguidor(String id_usuario);

	
}
