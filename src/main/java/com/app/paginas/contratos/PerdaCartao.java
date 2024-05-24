
package com.app.paginas.contratos;

import com.app.word.WordGenerator;
import com.app.util.DateUtilFormarter;
import com.app.util.FileChooser;
import com.app.word.WordContractPath;

import java.io.IOException;
import javax.swing.JOptionPane;


public class PerdaCartao extends javax.swing.JInternalFrame {

   
    public PerdaCartao() {
        initComponents();
        setTitle("Gerar CARTA COMUNICANDO PERDA DE CARTÃO DE CRÉDITO");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMotivo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jtContratante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtContratado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtAssinoCartao = new javax.swing.JFormattedTextField();
        jtPerdaCartao = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jbFechar = new javax.swing.JButton();
        jbGerar = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel3.setText("Motivo da Perda");

        jtMotivo.setColumns(20);
        jtMotivo.setLineWrap(true);
        jtMotivo.setRows(5);
        jScrollPane1.setViewportView(jtMotivo);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel1.setText("Contratante");

        jLabel2.setText("Contratado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jtContratante, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(jtContratado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtContratante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtContratado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel4.setText("Data de assino do Cartão");

        jLabel5.setText("Data Perda Cartão");

        try {
            jtAssinoCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtPerdaCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtAssinoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtPerdaCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtAssinoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPerdaCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbGerar.setText("Gerar");
        jbGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jbGerar)
                .addGap(18, 18, 18)
                .addComponent(jbFechar)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFechar)
                    .addComponent(jbGerar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarActionPerformed
       
        
        try {
            WordGenerator pdfg = new WordGenerator();
            pdfg.setInputFilePath(WordContractPath.PERDACARTAO);
            
            pdfg.openWord();
            pdfg.modifyWord("CONTRATANTE", jtContratante.getText());
            pdfg.modifyWord("CONTRATADO", jtContratado.getText());
            pdfg.modifyWord("Em (xxx)", String.format("Em %s", jtAssinoCartao.getText()));
            pdfg.modifyWord("no dia (xxx)", String.format("no dia %s", jtPerdaCartao.getText()));
            pdfg.modifyWord(
                    "(xxx) (Descrever as circunstâncias em que se deu a perda, indicando a existência de documento comprovando)",
                    jtMotivo.getText());
            pdfg.modifyWord("(Local, data e ano)", DateUtilFormarter.dateToStringContract());

            
            
            pdfg.setOutputFilePath(FileChooser.getPath());
            pdfg.close();
            JOptionPane.showMessageDialog(null, "Contrato gerado com sucesso");
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_jbGerarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbGerar;
    private javax.swing.JFormattedTextField jtAssinoCartao;
    private javax.swing.JTextField jtContratado;
    private javax.swing.JTextField jtContratante;
    private javax.swing.JTextArea jtMotivo;
    private javax.swing.JFormattedTextField jtPerdaCartao;
    // End of variables declaration//GEN-END:variables
}
