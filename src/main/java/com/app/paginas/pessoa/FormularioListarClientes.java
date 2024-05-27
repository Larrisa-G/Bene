
package com.app.paginas.pessoa;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.app.util.Tabela;

public class FormularioListarClientes extends javax.swing.JInternalFrame {
    JTable table;
    DefaultTableModel model = new DefaultTableModel();
    Tabela utilTabela = new Tabela();
   
    public FormularioListarClientes() {
        setTitle("Listar Clientes");
        initComponents();
        jrbFisica.setSelected(true);
        table = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {50,300}, 
                new Object[] {"centro","esquerda"}, 
                new Object[] {"CNJP","Descrição","A"}
        ); 
        
        model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[] {"a","b","c"});
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbFechar = new javax.swing.JButton();
        jbListar = new javax.swing.JButton();
        jtCPF = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        jrbFisica = new javax.swing.JRadioButton("Física");
        jrbJuridica = new javax.swing.JRadioButton("Jurídica");
        jpnConsulta = new javax.swing.JPanel();

        buttonGroup.add(jrbFisica);
        buttonGroup.add(jrbJuridica);

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        searchLabel.setText("CPF");

        jrbFisica.setText("Física");
        jrbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFisicaActionPerformed(evt);
            }
        });

        jrbJuridica.setText("Jurídica");
        jrbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(jrbFisica)
                .addGap(18, 18, 18)
                .addComponent(jrbJuridica)
                .addGap(18, 18, 18)
                .addComponent(jbListar)
                .addGap(18, 18, 18)
                .addComponent(jbFechar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFechar)
                    .addComponent(jbListar)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel)
                    .addComponent(jrbFisica)
                    .addComponent(jrbJuridica))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 241, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jrbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFisicaActionPerformed
       searchLabel.setText("CPF");
    }//GEN-LAST:event_jrbFisicaActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        
    }//GEN-LAST:event_jbListarActionPerformed

    private void jrbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbJuridicaActionPerformed
        searchLabel.setText("CNPJ");
    }//GEN-LAST:event_jrbJuridicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbListar;
    private javax.swing.JPanel jpnConsulta;
    private javax.swing.JRadioButton jrbFisica;
    private javax.swing.JRadioButton jrbJuridica;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
