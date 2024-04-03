
package com.app.entidades.pessoas;
        

import com.app.entidades.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
class Fisica extends Pessoa {
   
    private String rg;
   
    private String dataNascimento;

   public Fisica( 
        String nome,String cpf, String rg, 
        Genero genero, String dataNasc,
        Endereco endereco, EstadoCivil estadoCivil
   ) {
       super(nome, cpf,endereco,genero,estadoCivil);
       this.rg = rg;
       this.dataNascimento = dataNasc;
   }  
}
