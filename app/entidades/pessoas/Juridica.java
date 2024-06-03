package com.app.entidades.pessoas;


import com.app.entidades.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Juridica extends Pessoa{
    
    private String nomeFantasia;
    private String cpfDiretor;
    private String cnpj;
    private String cadastroEstadual;
    
    public Juridica(){
        super(null);
    }
    public Juridica(String nomeFantasia,String cpfDiretor,String cnpj,String cadastroEstadual,Endereco endereco) {
        super(endereco);
        this.nomeFantasia = nomeFantasia;
        this.cpfDiretor=cpfDiretor;
        this.cnpj=cnpj;
        this.cadastroEstadual=cadastroEstadual;
    }
    

    
}
