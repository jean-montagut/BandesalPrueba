package com.example.bandesal.bandesal.services.Rest;

import com.example.bandesal.bandesal.entity.Readers;

import java.util.List;

public interface ReadersServiceRest {

    public List<Readers> getAllReaders();
    public Readers getReader(Long id);
    public Readers saveReader(Readers reader);
    public void removeReader(Readers reader);

}
