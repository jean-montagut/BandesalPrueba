package com.example.bandesal.bandesal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/*
    Clase que representa la entidad blogs_reader
    Author: jmontagut
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blogs_reader")
public class BlogsReader implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBlogsReader", nullable = false)
    private Integer IdBlogsReader;

    @JoinColumn(name = "idReaders", referencedColumnName = "idReaders", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Readers idReaders;

    @JoinColumn(name = "idBlogs", referencedColumnName = "idBlogs", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Blogs idBlogs;


    @Override
    public String toString() {
        return "com.entity.BlogsReader[id=" + IdBlogsReader + "]";
    }
}
