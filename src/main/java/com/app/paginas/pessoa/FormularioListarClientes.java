
package com.app.paginas.pessoa;

import com.app.controller.FisicaController;
import com.app.controller.JuridicaController;
import com.app.entidades.pessoas.Fisica;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ServiceException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.app.util.Tabela;
import javax.swing.JOptionPane;
import java.util.List;
public class FormularioListarClientes extends javax.swing.JInternalFrame {
    JTable table;
    DefaultTableModel model = new DefaultTableModel();
    Tabela utilTabela = new Tabela();
   
    public FormularioListarClientes() {
        setTitle("Listar Clientes");
        initComponents();
        jrbFisica.setSelected(true);
        criarTabela();
    }
    
    private void criarTabela(){
        table = utilTabela.criarTabela(jpnConsulta, 
               
                new Object[] {"centro","esquerda"}, 
                new Object[] {"CPF","Nome"}
        ); 
        
        model = (DefaultTableModel) table.getModel();       
        try {
            FisicaController controller = new FisicaController();
            List<Fisica> list = controller.buscarTodos();
            
            for (Fisica f : list) {
                model.addRow(new Object[] {f.getCpf(),f.getNome()});
            }
        } catch (ServiceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
                .addComponent(jtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
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
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jrbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFisicaActionPerformed
        searchLabel.setText("CPF");
        model.setNumRows(0);
        model.setColumnIdentifiers(new Object[] {"CPF", "Nome"});
        try {
            FisicaController controller = new FisicaController();
            List<Fisica> list = controller.buscarTodos();
            
            for (Fisica f : list) {
                model.addRow(new Object[] {f.getCpf(),f.getNome()});
            }
        } catch (ServiceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jrbFisicaActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        
    }//GEN-LAST:event_jbListarActionPerformed

    private void jrbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbJuridicaActionPerformed
        searchLabel.setText("CNPJ");
        model.setNumRows(0);
        model.setColumnIdentifiers(new Object[] {"CNPJ", "Empresa","Diretor"});
        try {
            JuridicaController jc = new JuridicaController();
            List<Juridica> list = jc.buscarTodos();
            
            
            for (Juridica j : list) {
                FisicaController fc = new FisicaController();
                model.addRow(new Object[] {j.getCnpj(),j.getNomeFantasia(), fc.buscarUm(j.getCpfDiretor()).getNome()});
            }
        } catch (ServiceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
