package com.example.bandesal.bandesal.dto;

import lombok.*;

/*
    Clase DTO para la entidad blogs
    Author: jmontagut
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogsDto{

    private Integer idBlogs;

    private String title;

    private String description;


    @Override
    public String toString() {
        return "com.dto.BlogsDto[id=" + idBlogs + "]";
    }
}
