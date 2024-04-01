
package com.app.entidades;
        
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
class PessoaFisica extends Pessoa {
   
    private String rg;
    private String genero;
    private String dataNascimento;

   public PessoaFisica( 
        String nome, String cpf, String logradouro,
        int numero, String complemento, String bairro,
        String cep, String cidade, String uf,
        String genero, String rg, String dataNascimento) {
       super(nome, cpf, logradouro, numero, complemento, bairro, cep, cidade, uf);
       this.rg = rg;
       this.genero = genero;
       this.dataNascimento = dataNascimento;
   }  
}
