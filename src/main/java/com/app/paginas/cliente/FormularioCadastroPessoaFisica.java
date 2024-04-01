package com.app.paginas.cliente;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FormularioCadastroPessoaFisica extends FormularioPadraoCadastro {
    
    public FormularioCadastroPessoaFisica() {
        setTitle("Cadastrar Pessoa Física");
        initOtherComponents();
    }

    @Override
    public void initOtherComponents() {
        //
    }
    
    @Override
    public void salvarPessoa() {
        JOptionPane.showMessageDialog(null, "Pessoa Salva");
    }
    
}
