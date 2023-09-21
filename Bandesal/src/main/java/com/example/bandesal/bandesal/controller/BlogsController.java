package com.example.bandesal.bandesal.controller;

import com.example.bandesal.bandesal.services.Rest.BlogsServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class BlogsController {

    @Autowired
    BlogsServiceRest blogsSrvice;
}
