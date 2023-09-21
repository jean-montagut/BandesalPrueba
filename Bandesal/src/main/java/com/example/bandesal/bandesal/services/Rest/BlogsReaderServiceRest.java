package com.example.bandesal.bandesal.services.Rest;

import com.example.bandesal.bandesal.dto.BlogsReaderDto;
import com.example.bandesal.bandesal.entity.BlogsReader;

import java.util.List;

public interface BlogsReaderServiceRest {

    public List<BlogsReaderDto> getAllBlogReaders();
    public BlogsReader getBlogReader(Long id);
    public BlogsReader saveBlogReader(BlogsReader blogreader);
    public void removeBlogReader(BlogsReader blogreader);

}
