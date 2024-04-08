package com.app.entidades.pessoas;

import com.app.entidades.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Juridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;
    private String fundacao;
    
    public Juridica(
            String nome, String cpf, Endereco endereco,
            Genero genero, EstadoCivil estadoCivil, String cnpj,
            String inscricaoEstadual, String fundacao
    ) {
        super(nome, cpf, endereco, genero,estadoCivil);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.fundacao = fundacao;
    }
    


}
