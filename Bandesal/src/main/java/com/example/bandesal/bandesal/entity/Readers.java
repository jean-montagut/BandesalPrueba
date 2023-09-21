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
    Clase que representa la entidad readers
    Author: jmontagut
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "readers")
public class Readers implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReaders", nullable = false)
    private Integer idReaders;

    @Column(name = "name", nullable = false)
    @NotNull(message = "El campo name no puede ser null")
    @NotBlank(message = "El campo name es requerido")
    @Size(min = 1, max = 8, message = "El campo name tiene como máximo 8 caracteres")
    private String name;


    @Override
    public String toString() {
        return "com.entity.Readers[id=" + idReaders + "]";
    }
}
