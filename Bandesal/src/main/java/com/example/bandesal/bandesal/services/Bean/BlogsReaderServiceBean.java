package com.example.bandesal.bandesal.services.Bean;

import com.example.bandesal.bandesal.dto.BlogsReaderDto;
import com.example.bandesal.bandesal.entity.BlogsReader;
import com.example.bandesal.bandesal.repository.BlogsReaderRepository;
import com.example.bandesal.bandesal.services.Rest.BlogsReaderServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogsReaderServiceBean implements BlogsReaderServiceRest {

    @Autowired
    BlogsReaderRepository blogsReaderRepository;

    @Override
    public List<BlogsReaderDto> getAllBlogReaders() {
        return blogsReaderRepository.getAllGroupByBlogId();
    }

    @Override
    public BlogsReader getBlogReader(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BlogsReader saveBlogReader(BlogsReader blogreader) {
        blogsReaderRepository.save(blogreader);
        return blogreader;
    }

    @Override
    public void removeBlogReader(BlogsReader blogreader) {
        blogsReaderRepository.delete(blogreader);
    }

}
