package com.example.bandesal.bandesal.controller;

import com.example.bandesal.bandesal.dto.UsuarioDto;
import com.example.bandesal.bandesal.entity.Usuario;
import com.example.bandesal.bandesal.services.Rest.UsuarioServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginController {

    @EJB
    private UsuarioServiceRest usuarioService;
    private Usuario usuario;

    @GetMapping
    public String login() {
        return "views/login";
    }


    @GetMapping
    public void iniciarSesion() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario us = (Usuario) context.getExternalContext().getSessionMap().get("usuario");

            if (us == null) {
                context.getExternalContext().redirect("login.xhtml");
            }else{
               UsuarioDto usuarioDto = usuarioService.getUsuarioByUsername(us.getUsername());
               if(usuarioDto.getPassword().equals(us.getPassword())){
                   context.getExternalContext().redirect("home.xhtml");
               }else{
                   context.getExternalContext().redirect("login.xhtml");
               }
            }
        } catch (Exception e) {

        }
    }
}