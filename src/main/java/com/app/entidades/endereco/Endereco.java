
package com.app.entidades.endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter  
@Setter
public class Endereco {
    
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    
    public Endereco(){};
    
}
