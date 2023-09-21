package com.example.bandesal.bandesal.repository;

import com.example.bandesal.bandesal.dto.UsuarioDto;
import com.example.bandesal.bandesal.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/*
    Clase tipo repository para usuario
    Author: jmontagut
*/
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT new com.example.bandesal.bandesal.dto.UsuarioDto(usuario.idUsuario, usuario.name, usuario.username, usuario.password,usuario.status) FROM Usuario usuario WHERE usuario.username = :username")
    public List<UsuarioDto> findByUsername(@Param("username") String username);

}