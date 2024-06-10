
package com.app.paginas.pessoa.juridica;

import com.app.api.BuscaCep;
import com.app.controller.entidades.JuridicaController;
import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ServiceException;
import java.io.IOException;
import javax.swing.JOptionPane;


public class FormularioAlterarPessoaJuridica extends javax.swing.JInternalFrame {

    
    public FormularioAlterarPessoaJuridica() {
        initComponents();
        setTitle("Alterar Pessoa Jurídica");
        habilitarBotoes(false);
        habilitarInputs(false);
    }

    private void habilitarBotoes(boolean value) {
        jbAlterar.setEnabled(!value);
        jbSalvar.setEnabled(!value);
        
        jbSalvar.setEnabled(value);
        jbCancelar.setEnabled(value);
        jbBuscarCep.setEnabled(value);
        jbBuscarCNPJ.setEnabled(value);
    }
    
    private void habilitarInputs(boolean value) {
        jtCPFDiretor.setEnabled(value);
        jtCNPJ.setEnabled(value);
        jtNomeFantasia.setEnabled(value);
        jtCEP.setEnabled(value);
        
        jtLogradouro.setEnabled(value);
        jtNumero.setEnabled(value);
        jtComplemento.setEnabled(value);
        
        jtBairro.setEnabled(value);
        jtCidade.setEnabled(value);
        
        jtEstado.setEnabled(value);
    }
    
    private void limparInputs() {
        jtCEP.setText("");

        jtLogradouro.setText("");
        jtNumero.setText("");
        jtComplemento.setText("");

        jtBairro.setText("");
        jtCidade.setText("");

        jtEstado.setText("");
        jtNomeFantasia.setText(""); 
        jtCPFDiretor.setText(""); 
        jtCNPJ.setText(""); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpButoes = new javax.swing.JPanel();
        jbAlterar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jbBuscarCep = new javax.swing.JButton();
        jbBuscarCNPJ = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jpDadosEmpresa = new javax.swing.JPanel();
        jlNomeFantasia = new javax.swing.JLabel();
        jtNomeFantasia = new javax.swing.JTextField();
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
        jpCNPJ = new javax.swing.JPanel();
        jlCNPJ = new javax.swing.JLabel();
        jtCNPJ = new javax.swing.JFormattedTextField();
        jlCPF = new javax.swing.JLabel();
        jtCPFDiretor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        jbBuscarCNPJ.setText("Buscar CNPJ");
        jbBuscarCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCNPJActionPerformed(evt);
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
                .addGap(136, 136, 136)
                .addComponent(jbAlterar)
                .addGap(30, 30, 30)
                .addComponent(jbSalvar)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscarCNPJ)
                .addGap(18, 18, 18)
                .addComponent(jbBuscarCep)
                .addGap(18, 18, 18)
                .addComponent(jbFechar)
                .addGap(180, 180, 180))
        );
        jpButoesLayout.setVerticalGroup(
            jpButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbFechar)
                    .addComponent(jbBuscarCep)
                    .addComponent(jbBuscarCNPJ)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpDadosEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jlNomeFantasia.setText("Nome Fantasia");

        jtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeFantasiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDadosEmpresaLayout = new javax.swing.GroupLayout(jpDadosEmpresa);
        jpDadosEmpresa.setLayout(jpDadosEmpresaLayout);
        jpDadosEmpresaLayout.setHorizontalGroup(
            jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomeFantasia))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jpDadosEmpresaLayout.setVerticalGroup(
            jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlNomeFantasia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addGap(27, 27, 27)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(jlCEP)
                                .addGap(219, 219, 219))
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(jtCEP)
                                .addGap(77, 77, 77)))
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlLogradouro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNumero)))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCidade)
                            .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlComplemento))
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlBairro)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 170, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnderecoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEstado)
                                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110))))))
        );
        jpEnderecoLayout.setVerticalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCEP)
                    .addComponent(jlLogradouro)
                    .addComponent(jlNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlComplemento)
                    .addComponent(jlBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCNPJ.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jlCNPJ.setText("CNPJ");

        try {
            jtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlCPF.setText("CPF");

        try {
            jtCPFDiretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpCNPJLayout = new javax.swing.GroupLayout(jpCNPJ);
        jpCNPJ.setLayout(jpCNPJLayout);
        jpCNPJLayout.setHorizontalGroup(
            jpCNPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCNPJLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCNPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCNPJLayout.createSequentialGroup()
                        .addComponent(jlCNPJ)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpCNPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCPF)
                    .addComponent(jtCPFDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jpCNPJLayout.setVerticalGroup(
            jpCNPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCNPJLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpCNPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCNPJ)
                    .addComponent(jlCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCNPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCPFDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setText("CNPJ");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setText("Dados Empresariais");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setText("Endereço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpButoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jpDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(371, 371, 371)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpButoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitarBotoes(false);
        habilitarInputs(false);
        jbSalvar.setEnabled(true);
        jtCNPJ.setEnabled(true);
        jtCNPJ.requestFocus();
        jbAlterar.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbBuscarCNPJ.setEnabled(true);
    
       
        
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

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

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try{
           
            Juridica juridica = new Juridica();
            juridica.setNomeFantasia(jtNomeFantasia.getText());
            juridica.setCnpj(jtCNPJ.getText());
            juridica.setCpfDiretor(jtCPFDiretor.getText());
            Endereco endereco = new Endereco(
                jtLogradouro.getText(),
                Integer.parseInt(jtNumero.getText()),
                jtComplemento.getText(),      
                jtBairro.getText(),
                jtCEP.getText(),
                jtCidade.getText(),
                jtEstado.getText()
            );
            juridica.setEndereco(endereco);
            JuridicaController controller = new JuridicaController();
            controller.alterar(juridica);
            limparInputs();
            habilitarBotoes(false);
            habilitarInputs(false);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (ServiceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número Inválido");
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitarBotoes(false);
        habilitarInputs(false);
        limparInputs();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbBuscarCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCNPJActionPerformed
        try {
            JuridicaController controller = new JuridicaController();
            Juridica juridica = controller.buscarUm(jtCNPJ.getText());
            if( juridica == null){
                throw  new ServiceException("Enpresa não encontrada");
            } 
           
            jtCEP.setText(juridica.getEndereco().getCep());

            jtLogradouro.setText(juridica.getEndereco().getLogradouro());
            jtNumero.setText(String.valueOf(juridica.getEndereco().getNumero()));
            jtComplemento.setText(juridica.getEndereco().getComplemento());

            jtBairro.setText(juridica.getEndereco().getBairro());
            jtCidade.setText(juridica.getEndereco().getCidade());

            jtEstado.setText(juridica.getEndereco().getEstado());
            jtNomeFantasia.setText(juridica.getNomeFantasia());
            jtCPFDiretor.setText(juridica.getCpfDiretor());
            habilitarInputs(true);
            jtCNPJ.setEnabled(false);
       } catch (ServiceException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
           
       }
    }//GEN-LAST:event_jbBuscarCNPJActionPerformed

    private void jtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeFantasiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbBuscarCNPJ;
    private javax.swing.JButton jbBuscarCep;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCNPJ;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlLogradouro;
    private javax.swing.JLabel jlNomeFantasia;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JPanel jpButoes;
    private javax.swing.JPanel jpCNPJ;
    private javax.swing.JPanel jpDadosEmpresa;
    private javax.swing.JPanel jpEndereco;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JFormattedTextField jtCEP;
    private javax.swing.JFormattedTextField jtCNPJ;
    private javax.swing.JFormattedTextField jtCPFDiretor;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtLogradouro;
    private javax.swing.JTextField jtNomeFantasia;
    private javax.swing.JTextField jtNumero;
    // End of variables declaration//GEN-END:variables
}
