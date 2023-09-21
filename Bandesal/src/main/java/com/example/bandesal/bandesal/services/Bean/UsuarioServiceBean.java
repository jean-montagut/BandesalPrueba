package com.example.bandesal.bandesal.services.Bean;

import com.example.bandesal.bandesal.dto.UsuarioDto;
import com.example.bandesal.bandesal.entity.Usuario;
import com.example.bandesal.bandesal.repository.UsuarioRepository;
import com.example.bandesal.bandesal.services.Rest.UsuarioServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceBean implements UsuarioServiceRest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Integer guardarUsuario(Usuario usuario) {
        //String password = usuario.getPassword();
        //String encodedPasswod = bCryptPasswordEncoder.encode(password);
        //usuario.setPassword(encodedPasswod);
        usuario = usuarioRepository.save(usuario);
        return usuario.getIdUsuario();
    }

    public UsuarioDto getUsuarioByUsername(String username) {
        return (UsuarioDto) usuarioRepository.findByUsername(username);
    }

}
