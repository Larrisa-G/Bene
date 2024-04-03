
package com.app.entidades.endereco;

import lombok.Getter;
import lombok.Setter;

@Getter  
@Setter
public class Endereco {
    
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
}
