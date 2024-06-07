
package com.app.paginas.pessoa.fisica;


import com.app.api.BuscaCep;
import com.app.controller.entidades.FisicaController;
import com.app.entidades.endereco.Endereco;
import javax.swing.JOptionPane;
import com.app.entidades.pessoas.EstadoCivil;
import com.app.entidades.pessoas.Fisica;
import com.app.entidades.pessoas.Genero;
import com.app.exceptions.ServiceException;
import com.app.util.ValoresEnum;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;


public class FormularioAlterarPessoaFisica extends javax.swing.JInternalFrame {

    
    
    public FormularioAlterarPessoaFisica() {
        initComponents();
        setTitle("Alterar Pessoa Física");
        habilitarBotoes(false);
        habilitarInputs(false);
    }
    
    private void habilitarBotoes(boolean value) {
        jbAlterar.setEnabled(!value);
        
        jbSalvar.setEnabled(value);
        jbCancelar.setEnabled(value);
        jbBuscarCep.setEnabled(value);
        jbBuscarPessoa.setEnabled(value);
    }
    
    private void habilitarInputs(boolean value) {
        jtNome.setEnabled(value);
        jtCPF.setEnabled(value);
        
        
        jcbGenero.setEnabled(value);
        jcbEstadoCivil.setEnabled(value);
        
        jtProfissao.setEnabled(value);
        jtCEP.setEnabled(value);
        
        jtLogradouro.setEnabled(value);
        jtNumero.setEnabled(value);
        jtComplemento.setEnabled(value);
        
        jtBairro.setEnabled(value);
        jtCidade.setEnabled(value);
        
        jtEstado.setEnabled(value);
    }
    
    private void limparInpunts() {
        jtNome.setText("");
        jtCPF.setText("");
        
        
        jcbGenero.setSelectedIndex(0);
        jcbEstadoCivil.setSelectedIndex(0);
        
        jtProfissao.setText("");
        jtCEP.setText("");
        
        jtLogradouro.setText("");
        jtNumero.setText("");
        jtComplemento.setText("");
        
        jtBairro.setText("");
        jtCidade.setText("");
        
        jtEstado.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jpButoes = new javax.swing.JPanel();
        jbAlterar = new javax.swing.JButton();
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
        jlEstado = new javax.swing.JLabel();
        jtEstado = new javax.swing.JTextField();
        jtCEP = new javax.swing.JFormattedTextField();
        jpDadosPessoais = new javax.swing.JPanel();
        jtNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jcbGenero = new javax.swing.JComboBox<>();
        jlGenero = new javax.swing.JLabel();
        jlEstadoCivil = new javax.swing.JLabel();
        jcbEstadoCivil = new javax.swing.JComboBox<>();
        jlProfissao = new javax.swing.JLabel();
        jtProfissao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jlCPF = new javax.swing.JLabel();
        jtCPF = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        jpButoes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAlterar)
                .addGap(74, 74, 74)
                .addComponent(jbSalvar)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addGap(160, 160, 160)
                .addComponent(jbBuscarPessoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscarCep)
                .addGap(55, 55, 55)
                .addComponent(jbFechar)
                .addGap(49, 49, 49))
        );
        jpButoesLayout.setVerticalGroup(
            jpButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbFechar)
                    .addComponent(jbBuscarCep)
                    .addComponent(jbBuscarPessoa)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpEndereco.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jlCEP.setText("CEP");

        jlLogradouro.setText("Logradouro");

        jlNumero.setText("Número");

        jlComplemento.setText("Complemento");

        jlBairro.setText("Bairro");

        jlCidade.setText("Cidade");

        jlEstado.setText("Estado");

        try {
            jtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
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
                                .addGap(151, 151, 151)
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
                    .addComponent(jlEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpDadosPessoais.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jlNome.setText("Nome");

        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(ValoresEnum.obterValoresEnum(Genero.class)));
        jcbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGeneroActionPerformed(evt);
            }
        });

        jlGenero.setText("Gênero");

        jlEstadoCivil.setText("Estado Civil");

        jcbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Selecione--"}));

        jlProfissao.setText("Profissão");

        javax.swing.GroupLayout jpDadosPessoaisLayout = new javax.swing.GroupLayout(jpDadosPessoais);
        jpDadosPessoais.setLayout(jpDadosPessoaisLayout);
        jpDadosPessoaisLayout.setHorizontalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGenero))
                .addGap(44, 44, 44)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlProfissao)
                    .addComponent(jtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEstadoCivil))
                .addGap(0, 180, Short.MAX_VALUE))
        );
        jpDadosPessoaisLayout.setVerticalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlEstadoCivil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGenero)
                    .addComponent(jlProfissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jlCPF.setText("CPF");

        try {
            jtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCPF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Dados Pessoais");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Endereço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpButoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpButoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitarBotoes(false);
        habilitarInputs(false);
       
        jbAlterar.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbBuscarPessoa.setEnabled(true);
        jtCPF.setEnabled(true);
        jtCPF.requestFocus();
        
        
        //Só alguns campos que poderam mudar
        
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        
        try {
            Fisica fisica = new FisicaController().buscarUm(jtCPF.getText());
            
            fisica.setNome(jtNome.getText());
            fisica.setProfissao(jtProfissao.getText());
            if (!"--Selecione--".equals((String)jcbEstadoCivil.getSelectedItem())) {
                fisica.setEstadoCivil(EstadoCivil.valueOf((String)jcbEstadoCivil.getSelectedItem()));
            }
            

            if(!"--Selecione--".equals((String)jcbGenero.getSelectedItem())) {
                fisica.setGenero(Genero.valueOf(jcbGenero.getSelectedItem().toString().replace(" ", "_")));
            } 
            
            
            Endereco endereco = new Endereco(
                jtLogradouro.getText(),

                Integer.parseInt(jtNumero.getText()),
                jtComplemento.getText(),      
                jtBairro.getText(),
                jtCEP.getText(),
                jtCidade.getText(),
                jtEstado.getText()
            );
            fisica.setEndereco(endereco);
            FisicaController controller = new FisicaController();
            controller.alterar(fisica);
            limparInpunts();
            habilitarBotoes(false);
            habilitarInputs(false);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Gênro ou Estado civil incorretos");
        }  catch (ServiceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitarBotoes(false);
        habilitarInputs(false);
        limparInpunts();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPessoaActionPerformed
        try {
            FisicaController controller = new FisicaController();
            Fisica fisica = controller.buscarUm(jtCPF.getText());
            if (fisica == null) {
                throw new ServiceException("Cliente não encontrado");
            }
            jtCPF.setEnabled(false);
            jtNome.setText(fisica.getNome());
            jtProfissao.setText(fisica.getProfissao());
            jtCEP.setText(fisica.getEndereco().getCep());

            jtLogradouro.setText(fisica.getEndereco().getLogradouro());
            jtNumero.setText(String.valueOf(fisica.getEndereco().getNumero()) );
            jtComplemento.setText(fisica.getEndereco().getComplemento());

            jtBairro.setText(fisica.getEndereco().getBairro());
            jtCidade.setText(fisica.getEndereco().getCidade());

            jtEstado.setText(fisica.getEndereco().getEstado());
            habilitarInputs(true);
            jtCPF.setEnabled(false);
            habilitarBotoes(true);
            jbBuscarPessoa.setEnabled(false);
        } catch (ServiceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbBuscarCep;
    private javax.swing.JButton jbBuscarPessoa;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbEstadoCivil;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlEstadoCivil;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlLogradouro;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlProfissao;
    private javax.swing.JPanel jpButoes;
    private javax.swing.JPanel jpDadosPessoais;
    private javax.swing.JPanel jpEndereco;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JFormattedTextField jtCEP;
    private javax.swing.JFormattedTextField jtCPF;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtLogradouro;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtProfissao;
    // End of variables declaration//GEN-END:variables
}
