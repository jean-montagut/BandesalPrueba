package com.example.bandesal.bandesal.repository;

import com.example.bandesal.bandesal.dto.BlogsReaderDto;
import com.example.bandesal.bandesal.entity.Blogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
    Clase tipo repository para blogs
    Author: jmontagut
*/
public interface BlogsRepository extends JpaRepository<Blogs, Long> {


}