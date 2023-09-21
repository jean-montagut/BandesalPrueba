package com.example.bandesal.bandesal.services.Rest;


import com.example.bandesal.bandesal.dto.BlogsReaderDto;
import com.example.bandesal.bandesal.entity.Blogs;

import java.util.List;

/*
    Clase tipo repository para usuario
    Author: jmontagut
*/
public interface BlogsServiceRest {

    public List<Blogs> getAllBlogs();
    public Blogs getBlog(Long id);
    public Blogs saveBlog(Blogs blog);
    public void removeBlog(Blogs blog);

}
