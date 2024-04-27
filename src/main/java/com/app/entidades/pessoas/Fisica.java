
package com.app.entidades.pessoas;
        
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
class Fisica extends Pessoa {
    private String nome;
    private String cpf;
    private Genero genero;
    private EstadoCivil estadoCivil;
    private String rg; 
    private String dataNascimento;
    private String nacionalidade;
    private String profissao;
}
