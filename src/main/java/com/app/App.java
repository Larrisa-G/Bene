
package com.app;

import com.app.paginas.cliente.FormularioPessoaFisica;
import com.app.paginas.cliente.FormularioPessoaJuridica;
import com.app.paginas.cliente.FormularioListarClientes;
import com.app.paginas.contratos.PerdaCartao;
import com.app.util.CentralizarForm;
import javax.swing.JFrame;


public class App extends javax.swing.JFrame {
    CentralizarForm centralizarForm = new CentralizarForm();
    
    public App(String text) {
        
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jlUsername.setText("Olá, "+text);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlUsername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmcPessoaJuridica = new javax.swing.JMenuItem();
        jmcPessoaFisica = new javax.swing.JMenuItem();
        jmListarrCliente = new javax.swing.JMenuItem();
        jmContratos = new javax.swing.JMenu();
        jmcPerdaCartao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 24)); // NOI18N

        jDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jButton1.setText("Log out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmClientes.setText("Clientes");

        jmcPessoaJuridica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmcPessoaJuridica.setText("Pessoa Jurídica");
        jmcPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPessoaJuridicaActionPerformed(evt);
            }
        });
        jmClientes.add(jmcPessoaJuridica);

        jmcPessoaFisica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmcPessoaFisica.setText("Pessoa Física");
        jmcPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPessoaFisicaActionPerformed(evt);
            }
        });
        jmClientes.add(jmcPessoaFisica);

        jmListarrCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmListarrCliente.setText("Listar");
        jmListarrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarrClienteActionPerformed(evt);
            }
        });
        jmClientes.add(jmListarrCliente);

        jMenuBar1.add(jmClientes);

        jmContratos.setText("Contratos");

        jmcPerdaCartao.setText("Perda Cartão");
        jmcPerdaCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPerdaCartaoActionPerformed(evt);
            }
        });
        jmContratos.add(jmcPerdaCartao);

        jMenuBar1.add(jmContratos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktop))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmcPerdaCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPerdaCartaoActionPerformed
        PerdaCartao perdaCartao;
        centralizarForm.abrirFormulario(perdaCartao=new PerdaCartao(), jDesktop);
    }//GEN-LAST:event_jmcPerdaCartaoActionPerformed

    private void jmListarrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarrClienteActionPerformed
        FormularioListarClientes formularioListarClientes;
        centralizarForm.abrirFormulario(formularioListarClientes=new FormularioListarClientes(), jDesktop);
    }//GEN-LAST:event_jmListarrClienteActionPerformed

    private void jmcPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPessoaFisicaActionPerformed
        FormularioPessoaFisica formularioPessoaFisica;
        centralizarForm.abrirFormulario(formularioPessoaFisica=new FormularioPessoaFisica(), jDesktop);

    }//GEN-LAST:event_jmcPessoaFisicaActionPerformed

    private void jmcPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPessoaJuridicaActionPerformed
        FormularioPessoaJuridica formularioPessoaJuridica;
        centralizarForm.abrirFormulario(formularioPessoaJuridica=new FormularioPessoaJuridica(), jDesktop);
    }//GEN-LAST:event_jmcPessoaJuridicaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmContratos;
    private javax.swing.JMenuItem jmListarrCliente;
    private javax.swing.JMenuItem jmcPerdaCartao;
    private javax.swing.JMenuItem jmcPessoaFisica;
    private javax.swing.JMenuItem jmcPessoaJuridica;
    // End of variables declaration//GEN-END:variables
}
