
package com.app.paginas.cliente;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FormularioCadastroPessoaJuridica extends FormularioPadraoCadastro{
    private JLabel jlCNPJ;
    private JTextField jtCNPJ;
    
    private JLabel jlInscricaoEstadual;
    private JTextField jtInscricaoEstadual;
    
    private JLabel jlFundacao;
    private JTextField jtFundacao;
    
    public FormularioCadastroPessoaJuridica() {
        setTitle("Cadastro Pessoa Jurídica");
    }

    @Override
    public void initOtherComponents() {
        jlCNPJ = new JLabel("CNPJ");
        jlCNPJ.setBounds(25,5,55,25);
        jlCNPJ.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jpOtherInfo.add(jlCNPJ);
        
        jtCNPJ = new JTextField();
        jtCNPJ.setBounds(25,25,150,25);
        jpOtherInfo.add(jtCNPJ);   
        
        jlInscricaoEstadual = new JLabel("Inscrição Estadual");
        jlInscricaoEstadual.setBounds(200,5,250,25);
        jlInscricaoEstadual.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jpOtherInfo.add(jlInscricaoEstadual);
        
        jtInscricaoEstadual = new JTextField();
        jtInscricaoEstadual.setBounds(200,25,250,25);
        jpOtherInfo.add(jtInscricaoEstadual);
        
        
        jlFundacao= new JLabel("Fundação");
        jlFundacao.setBounds(25,65,55,25);
        jlFundacao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jpOtherInfo.add(jlFundacao);
        
        jtFundacao = new JTextField();
        //jtFundacao.setBounds(75,65,105,25);
        jtFundacao.setBounds(25,85,150,25);
        jpOtherInfo.add(jtFundacao);
    }

    @Override
    public void salvarPessoa() {
        //
    }
    
}
