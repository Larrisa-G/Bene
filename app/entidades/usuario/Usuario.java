package com.app.entidades.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private String userName;
    private String senha;

    public Usuario (String userName, String senha){
        this.userName = userName;
        this.senha = senha;
    }
}
