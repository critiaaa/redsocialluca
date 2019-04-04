package com.example.demo.bean.interfaces;

import java.util.List;

import com.example.demo.beans.Imagen;

public interface IImagenService {
	
	public List<Imagen> listarimagenes();
	public List<Imagen> listarimagenesbyseguidor();

	public void borrarImagen(int idimagen);
	public void addImagen(Imagen imagen);
	public Imagen buscar_id(String idimagen);


}
