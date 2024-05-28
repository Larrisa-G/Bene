
package com.app.entidades.pessoas;
        
import com.app.entidades.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Fisica extends Pessoa {
    
    
    private String nome;
    private String cpf;
    private Genero genero;
    private EstadoCivil estadoCivil;
    private String rg; 
    private String dataNascimento;
    private String nacionalidade;
    private String profissao;
    
    public Fisica(){
        super(null);
    }
    
    public Fisica(
        String nome,
        String cpf,
        Genero genero,
        EstadoCivil estadoCivil,
        String rg,
        String dataNascimento,
        String nacionalidade,
        String profissao,
        Endereco endereco
    ) {
        super(endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.profissao = profissao;
       
    }
   
}
