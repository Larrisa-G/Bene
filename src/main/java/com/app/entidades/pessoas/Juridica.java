package com.app.entidades.pessoas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Juridica extends Pessoa{
    
    private String nomeFantasia;
    private String cnpj;
    private int cadastroEstadual;
    private int numero;
   
    


}
