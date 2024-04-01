package com.app.paginas.cliente;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FormularioCadastroPessoaFisica extends FormularioPadraoCadastro {
    
    private JLabel jlRg;
    private JTextField jtRg;
    
    private JLabel jlData;
    private JTextField jtData;
    
    public FormularioCadastroPessoaFisica() {
        setTitle("Cadastrar Pessoa Física");
        initOtherComponents();
    }

    @Override
    public void initOtherComponents() {
        jlRg = new JLabel("RG");
        jlRg.setBounds(25,5,55,25);
        jlRg.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jpOtherInfo.add(jlRg);
        
        jtRg = new JTextField();
        jtRg.setBounds(25,25,200,25);
        jpOtherInfo.add(jtRg);
        
        //Criar campos -> data e rg
    }
    
    @Override
    public void salvarPessoa() {
        JOptionPane.showMessageDialog(null, "Pessoa Salva");
    }
    
}
