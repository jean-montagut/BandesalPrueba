package com.example.bandesal.bandesal.services.Bean;

import com.example.bandesal.bandesal.entity.Blogs;
import com.example.bandesal.bandesal.repository.BlogsRepository;
import com.example.bandesal.bandesal.services.Rest.BlogsServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BloogsServiceBean implements BlogsServiceRest {

    @Autowired
    BlogsRepository blogsRepository;

    @Override
    public List<Blogs> getAllBlogs() {
        return blogsRepository.findAll();
    }


    @Override
    public Blogs getBlog(Long id) {
        Optional<Blogs> Blog = blogsRepository.findById(id);
        return Blog.orElse(null);
    }

    @Override
    public Blogs saveBlog(Blogs blog) {
        blogsRepository.save(blog);
        return blog;
    }

    @Override
    public void removeBlog(Blogs blog) {
        blogsRepository.delete(blog);
    }

}
