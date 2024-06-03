
package com.app.entidades.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private String nome;
    private String senha;
    
    public Usuario(String nome,String senha){
        this.nome = nome;
        this.senha = senha;
    }
}
