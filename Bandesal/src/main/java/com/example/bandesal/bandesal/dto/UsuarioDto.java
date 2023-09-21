package com.example.bandesal.bandesal.dto;

import lombok.*;

/*
    Clase DTO para la entidad usuario
    Author: jmontagut
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto{

    private Integer idUsuario;

    private String name;

    private String username;

    private String password;

    private String status;


    @Override
    public String toString() {
        return "com.dto.UsuarioDto[id=" + idUsuario + "]";
    }
}
