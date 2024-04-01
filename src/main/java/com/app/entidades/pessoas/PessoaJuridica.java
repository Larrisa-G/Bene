package com.app.entidades.pessoas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;
    private String fundacao;
    
    public PessoaJuridica(
            String nome, String cpf, String logradouro, int numero, 
            String complemento, String bairro, String cep, String cidade,
            String uf,String cnpj,String inscricaoEstadual,String fundacao) {
        super(nome, cpf, logradouro, numero, complemento, bairro, cep, cidade, uf);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.fundacao = fundacao;
    }
    


}
