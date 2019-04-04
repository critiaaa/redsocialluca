package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
