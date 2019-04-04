package com.example.demo.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="seguidores")
public class Seguidores {
	
	@Id
	@Column(name="id_usuario")
	private String id_usuario;
	
	@Column(name="id_seguido")
	private String id_seguido;
	
	@OneToMany(cascade=CascadeType.ALL)  //Con este relacionamos la tabla categoria con la tabla productos
	@JoinColumn(name="id_categoria")   //Seleccionamos el PK/dato que relaciona las tablas
	private List<Imagen> imagenes;
	
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getId_seguido() {
		return id_seguido;
	}
	public void setId_seguido(String id_seguido) {
		this.id_seguido = id_seguido;
	}
	public List<Imagen> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}
	
	

	
}
