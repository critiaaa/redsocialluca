package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imagen")
public class Imagen {
	
	
	@Id
	@Column(name="idimagen")
	private String idimagen;
	
	@Column(name="ordenfotos")
	private int ordenfotos;
	
	@Column(name="id_usuario")
	private String id_usuario;

	public String getIdimagen() {
		return idimagen;
	}

	public void setIdimagen(String idimagen) {
		this.idimagen = idimagen;
	}

	public int getOrdenfotos() {
		return ordenfotos;
	}

	public void setOrdenfotos(int ordenfotos) {
		this.ordenfotos = ordenfotos;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "imagen [idimagen=" + idimagen + ", ordenfotos=" + ordenfotos + ", id_usuario=" + id_usuario + "]";
	}
	
	
	

	
}
