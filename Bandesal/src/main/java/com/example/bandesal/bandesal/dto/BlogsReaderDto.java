package com.example.bandesal.bandesal.dto;

import com.example.bandesal.bandesal.entity.Blogs;
import com.example.bandesal.bandesal.entity.Readers;
import lombok.*;

/*
    Clase DTO para la entidad blogs_reader
    Author: jmontagut
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogsReaderDto{

    private Integer IdBlogsReader;

    private Readers idReaders;

    private Blogs idBlogs;

    @Override
    public String toString() {
        return "com.dto.BlogsReaderDto[id=" + idBlogs + "]";
    }
}
