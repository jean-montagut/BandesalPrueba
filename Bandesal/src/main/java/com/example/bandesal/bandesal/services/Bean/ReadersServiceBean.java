package com.example.bandesal.bandesal.services.Bean;

import com.example.bandesal.bandesal.entity.Readers;
import com.example.bandesal.bandesal.repository.ReadersRepository;
import com.example.bandesal.bandesal.services.Rest.ReadersServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReadersServiceBean implements ReadersServiceRest {

    @Autowired
    ReadersRepository readersRepository;

    @Override
    public List<Readers> getAllReaders() {
        return readersRepository.findAll();
    }

    @Override
    public Readers saveReader(Readers reader) {
        readersRepository.save(reader);
        return reader;
    }

    @Override
    public Readers getReader(Long id) {
        Optional<Readers> reader = readersRepository.findById(id);
        return reader.orElse(null);
    }

    @Override
    public void removeReader(Readers reader) {
        readersRepository.delete(reader);
    }


}
