
package com.app.entidades.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private String nome;
    private String senha;
    private String email;
    
    public Usuario(String nome,String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
}
