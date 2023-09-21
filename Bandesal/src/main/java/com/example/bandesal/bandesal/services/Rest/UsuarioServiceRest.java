package com.example.bandesal.bandesal.services.Rest;

import com.example.bandesal.bandesal.dto.UsuarioDto;
import com.example.bandesal.bandesal.entity.Blogs;
import com.example.bandesal.bandesal.entity.Usuario;

public interface UsuarioServiceRest {

    public Integer guardarUsuario(Usuario user);
    public UsuarioDto getUsuarioByUsername(String username);

}
