package com.app.paginas.cliente;

import com.app.entidades.pessoas.Genero;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FormularioCadastroPessoaFisica extends FormularioPadraoCadastro {
    
    private JLabel jlRg;
    private JTextField jtRg;
    
    private JLabel jlData;
    private JTextField jtData;
    
    private JLabel jlGenero;
    private JComboBox<Genero> jcbGenero;
    
    public FormularioCadastroPessoaFisica() {
        setTitle("Cadastrar Pessoa Física");
    }

    @Override
    public void initOtherComponents() {
        jlRg = new JLabel("RG");
        jlRg.setBounds(25,5,55,25);
        jlRg.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jpOtherInfo.add(jlRg);
        
        jtRg = new JTextField();
        jtRg.setBounds(25,25,150,25);
        jpOtherInfo.add(jtRg);
        
        //Criar campos -> data e genero
        jlData = new JLabel("Data de Nascimento");
        jlData.setBounds(200,5,250,25);
        jlData.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jpOtherInfo.add(jlData);
        
        jtData = new JTextField();
        jtData.setBounds(200,25,250,25);
        jpOtherInfo.add(jtData);
    }
    
    @Override
    public void salvarPessoa() {
        JOptionPane.showMessageDialog(null, "Pessoa Salva");
    }
    
    
    private static String capitalizeString(String str) {
        // Verifica se a string não está vazia
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Converte o primeiro caractere em maiúscula e os demais em minúsculas
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    
}
