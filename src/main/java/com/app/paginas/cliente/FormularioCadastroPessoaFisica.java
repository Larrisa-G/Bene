package com.app.paginas.cliente;

import com.app.entidades.pessoas.GenerosPessoas;
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
    private JComboBox<GenerosPessoas> jcbGenero;
    
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
        
        jlGenero = new JLabel("Gênero");
        jlGenero.setBounds(25,65,55,25);
        jlGenero.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jpOtherInfo.add(jlGenero);
        
        String[] genders = pegarGeneros();
        jcbGenero = new JComboBox(genders);
        jcbGenero.setBounds(75,65,105,25);
        jpOtherInfo.add(jcbGenero);
    }
    
    @Override
    public void salvarPessoa() {
        JOptionPane.showMessageDialog(null, "Pessoa Salva");
    }
    
    private String[] pegarGeneros() {
        GenerosPessoas[]  generos = GenerosPessoas.values();
        String[] genderNames = new String[generos.length];
        for (int i = 0; i < generos.length; i++) {
            genderNames[i] = capitalizeString(generos[i].toString());
        }
        
        return genderNames;
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
