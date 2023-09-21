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
    Clase que representa la entidad blogs
    Author: jmontagut
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blogs")
public class Blogs implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBlogs", nullable = false)
    private Integer idBlogs;

    @Column(name = "title", nullable = false)
    @NotNull(message = "El campo title no puede ser null")
    @NotBlank(message = "El campo title es requerido")
    @Size(min = 1, max = 50, message = "El campo title tiene como máximo 50 caracteres")
    private String title;

    @Column(name = "description", nullable = false)
    @NotNull(message = "El campo description no puede ser null")
    @NotBlank(message = "El campo description es requerido")
    @Size(min = 1, max = 4000, message = "El campo description tiene como máximo 4000 caracteres")
    private String description;


    @Override
    public String toString() {
        return "com.entity.Blogs[id=" + idBlogs + "]";
    }
}
