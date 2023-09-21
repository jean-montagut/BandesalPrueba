package com.example.bandesal.bandesal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/*
    Clase que representa la entidad usuario
    Author: jmontagut
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "name", nullable = false)
    @NotNull(message = "El campo name no puede ser null")
    @NotBlank(message = "El campo name es requerido")
    @Size(min = 1, max = 40, message = "El campo name tiene como máximo 40 caracteres")
    private String name;

    @Column(name = "username", nullable = false)
    @NotNull(message = "El campo username no puede ser null")
    @NotBlank(message = "El campo username es requerido")
    @Size(min = 1, max = 12, message = "El campo username tiene como máximo 12 caracteres")
    private String username;

    @Column(name = "password", nullable = false)
    @NotNull(message = "El campo password no puede ser null")
    @NotBlank(message = "El campo password es requerido")
    @Size(min = 1, max = 8, message = "El campo password tiene como máximo 8 caracteres")
    private String password;

    @Column(name = "status", nullable = false)
    @NotNull(message = "El campo status no puede ser null")
    @NotBlank(message = "El campo status es requerido")
    @Size(min = 1, max = 8, message = "El campo status tiene como máximo 8 caracteres")
    private String status;


    @Override
    public String toString() {
        return "com.entity.Usuario[id=" + idUsuario + "]";
    }
}
