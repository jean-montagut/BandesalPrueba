package com.example.bandesal.bandesal.repository;

import com.example.bandesal.bandesal.dto.BlogsReaderDto;
import com.example.bandesal.bandesal.entity.BlogsReader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
    Clase tipo repository para blogsReader
    Author: jmontagut
*/
public interface BlogsReaderRepository extends JpaRepository<BlogsReader, Long> {

    @Query("SELECT new com.example.bandesal.bandesal.dto.BlogsReaderDto(blogRead.IdBlogsReader, blogRead.blogRead, blogRead.idBlogs) FROM Blogs blogRead GROUP BY blogRead.IdBlogsReader")
    public List<BlogsReaderDto> getAllGroupByBlogId();

}