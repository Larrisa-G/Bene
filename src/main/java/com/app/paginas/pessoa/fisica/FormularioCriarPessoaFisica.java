
package com.app.paginas.pessoa.fisica;

import com.app.api.BuscaCep;
import com.app.entidades.endereco.Endereco;
import javax.swing.JOptionPane;
import com.app.entidades.pessoas.EstadoCivil;
import com.app.entidades.pessoas.Genero;
import com.app.util.ValoresEnum;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;


public class FormularioCriarPessoaFisica extends javax.swing.JInternalFrame {

    
    public FormularioCriarPessoaFisica() {
        initComponents();
        setTitle("Criar Pessoa Física");
        habilitarBotoes(false);
        habilitarInputs(false);
    }
    
    private void habilitarBotoes(boolean value) {
        jbNovo.setEnabled(!value);
        
        jbSalvar.setEnabled(value);
        jbCancelar.setEnabled(value);
        jbBuscarCep.setEnabled(value);
        jbBuscarPessoa.setEnabled(value);
    }
    
    private void habilitarInputs(boolean value) {
        jtNome.setEnabled(value);
        jtCPF.setEnabled(value);
        jtRG.setEnabled(value);
        
        jcbGenero.setEnabled(value);
        jcbEstadoCivil.setEnabled(value);
        jtNacionalidade.setEnabled(value);
        
        jtDataNascimento.setEnabled(value);
        jtProfissao.setEnabled(value);
        jtCEP.setEnabled(value);
        
        jtLogradouro.setEnabled(value);
        jtNumero.setEnabled(value);
        jtComplemento.setEnabled(value);
        
        jtBairro.setEnabled(value);
        jtCidade.setEnabled(value);
        jtUF.setEnabled(value);
        
        jtEstado.setEnabled(value);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jpButoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jbBuscarCep = new javax.swing.JButton();
        jbBuscarPessoa = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jpEndereco = new javax.swing.JPanel();
        jlCEP = new javax.swing.JLabel();
        jlLogradouro = new javax.swing.JLabel();
        jtLogradouro = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jlComplemento = new javax.swing.JLabel();
        jtComplemento = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        jtBairro = new javax.swing.JTextField();
        jlCidade = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jlUF = new javax.swing.JLabel();
        jtUF = new javax.swing.JTextField();
        jlEstado = new javax.swing.JLabel();
        jtEstado = new javax.swing.JTextField();
        jtCEP = new javax.swing.JFormattedTextField();
        jpDadosPessoais = new javax.swing.JPanel();
        jtNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlRG = new javax.swing.JLabel();
        jcbGenero = new javax.swing.JComboBox<>();
        jlGenero = new javax.swing.JLabel();
        jlEstadoCivil = new javax.swing.JLabel();
        jcbEstadoCivil = new javax.swing.JComboBox<>();
        jtNacionalidade = new javax.swing.JTextField();
        jlNacionalidade = new javax.swing.JLabel();
        jlDataNascimento = new javax.swing.JLabel();
        jlProfissao = new javax.swing.JLabel();
        jtProfissao = new javax.swing.JTextField();
        jtCPF = new javax.swing.JFormattedTextField();
        jtDataNascimento = new javax.swing.JFormattedTextField();
        jtRG = new javax.swing.JFormattedTextField();

        jTextField4.setText("jTextField4");

        jpButoes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbBuscarCep.setText("Buscar Cep");
        jbBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCepActionPerformed(evt);
            }
        });

        jbBuscarPessoa.setText("Buscar Pessoa");
        jbBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPessoaActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpButoesLayout = new javax.swing.GroupLayout(jpButoes);
        jpButoes.setLayout(jpButoesLayout);
        jpButoesLayout.setHorizontalGroup(
            jpButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButoesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jbNovo)
                .addGap(43, 43, 43)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addGap(18, 18, 18)
                .addComponent(jbBuscarPessoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscarCep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbFechar)
                .addGap(22, 22, 22))
        );
        jpButoesLayout.setVerticalGroup(
            jpButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbFechar)
                    .addComponent(jbBuscarCep)
                    .addComponent(jbBuscarPessoa)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 14))); // NOI18N

        jlCEP.setText("CEP");

        jlLogradouro.setText("Logradouro");

        jlNumero.setText("Número");

        jlComplemento.setText("Complemento");

        jlBairro.setText("Bairro");

        jlCidade.setText("Cidade");

        jlUF.setText("UF");

        jlEstado.setText("Estado");

        try {
            jtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpEnderecoLayout = new javax.swing.GroupLayout(jpEndereco);
        jpEndereco.setLayout(jpEnderecoLayout);
        jpEnderecoLayout.setHorizontalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(jlCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(jtCEP)
                                .addGap(117, 117, 117)))
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlLogradouro)
                            .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNumero)
                            .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCidade))
                        .addGap(43, 43, 43)
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlComplemento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBairro))
                                .addContainerGap())
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlUF))
                                .addGap(51, 51, 51)
                                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEstado)
                                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jpEnderecoLayout.setVerticalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCEP)
                    .addComponent(jlLogradouro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumero)
                    .addComponent(jlComplemento)
                    .addComponent(jlBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jlUF)
                    .addComponent(jlEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null), "Dados Pessois", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 14))); // NOI18N

        jlNome.setText("Nome");

        jlCPF.setText("CPF");

        jlRG.setText("RG");

        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(ValoresEnum.obterValoresEnum(Genero.class)));
        jcbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGeneroActionPerformed(evt);
            }
        });

        jlGenero.setText("Gênero");

        jlEstadoCivil.setText("Estado Civil");

        jcbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Selecione--"}));

        jlNacionalidade.setText("Nacionalidade");

        jlDataNascimento.setText("Data de Nascimento");

        jlProfissao.setText("Profissão");

        try {
            jtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpDadosPessoaisLayout = new javax.swing.GroupLayout(jpDadosPessoais);
        jpDadosPessoais.setLayout(jpDadosPessoaisLayout);
        jpDadosPessoaisLayout.setHorizontalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGenero)
                    .addComponent(jlDataNascimento)
                    .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCPF)
                            .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlRG)
                            .addComponent(jtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEstadoCivil))
                        .addGap(39, 39, 39)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jlNacionalidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jtNacionalidade)
                                .addGap(28, 28, 28))))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlProfissao)
                            .addComponent(jtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpDadosPessoaisLayout.setVerticalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlCPF)
                    .addComponent(jlRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGenero)
                    .addComponent(jlEstadoCivil)
                    .addComponent(jlNacionalidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlProfissao))
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpButoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpButoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitarBotoes(true);
        habilitarInputs(true);
        jtNome.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        habilitarBotoes(false);
        habilitarInputs(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitarBotoes(false);
        habilitarInputs(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPessoaActionPerformed
        JOptionPane.showMessageDialog(null, "Buscando Pessoa");
    }//GEN-LAST:event_jbBuscarPessoaActionPerformed

    private void jbBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepActionPerformed
        try {
            Endereco endereco = BuscaCep.buscar(jtCEP.getText().trim());
            jtCEP.setText(endereco.getCep());
        
            jtLogradouro.setText(endereco.getLogradouro());
            jtNumero.setText(String.valueOf(endereco.getNumero()));
            jtComplemento.setText(endereco.getComplemento());

            jtBairro.setText(endereco.getBairro());
            jtCidade.setText(endereco.getCidade());
            jtUF.setText(endereco.getUf());

            jtEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
        
         
         
    }//GEN-LAST:event_jbBuscarCepActionPerformed

    private void jcbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGeneroActionPerformed
        String selectedValue = (String) jcbGenero.getSelectedItem();
        
        switch(selectedValue) {
            case "--Selecione--":
                jcbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"--Selecione--"}));
                break;
            case "FEMININO":
                 jcbEstadoCivil.setModel(new DefaultComboBoxModel(ValoresEnum.separarGenero(EstadoCivil.class,"a")));
                break;
            default:
                 jcbEstadoCivil.setModel(new DefaultComboBoxModel(ValoresEnum.separarGenero(EstadoCivil.class,"o")));
                break;
        }
    }//GEN-LAST:event_jcbGeneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbBuscarCep;
    private javax.swing.JButton jbBuscarPessoa;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbEstadoCivil;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlEstadoCivil;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlLogradouro;
    private javax.swing.JLabel jlNacionalidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlProfissao;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlUF;
    private javax.swing.JPanel jpButoes;
    private javax.swing.JPanel jpDadosPessoais;
    private javax.swing.JPanel jpEndereco;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JFormattedTextField jtCEP;
    private javax.swing.JFormattedTextField jtCPF;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JFormattedTextField jtDataNascimento;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtLogradouro;
    private javax.swing.JTextField jtNacionalidade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtProfissao;
    private javax.swing.JFormattedTextField jtRG;
    private javax.swing.JTextField jtUF;
    // End of variables declaration//GEN-END:variables
}
