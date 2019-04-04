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
@Table(name="usuarios")
public class Usuario {
	
	
	@Id //para decir cual es el PK
	@Column(name="id_usuario")
	private String id_usuario;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="contraseña")
	private String contraseña;

	@OneToMany(cascade=CascadeType.ALL)  //Con este relacionamos la tabla categoria con la tabla productos
	@JoinColumn(name="id_usuario")   //Seleccionamos el PK/dato que relaciona las tablas
	private List<Imagen> imagenes;
	
	
	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", correo=" + correo + ", contraseña=" + contraseña + "]";
	}
	
	

	 

	

	

}
