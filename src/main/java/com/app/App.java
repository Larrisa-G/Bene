
package com.app;

import com.app.paginas.cliente.FormularioPessoaFisica;
//import com.app.paginas.cliente.FormularioCadastroPessoaJuridica;
import com.app.paginas.cliente.FormularioListarClientes;
import com.app.util.CentralizarForm;
import javax.swing.JFrame;


public class App extends javax.swing.JFrame {
    CentralizarForm centralizarForm = new CentralizarForm();
    
    public App() {
        initComponents();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmcPessoaFisica = new javax.swing.JMenuItem();
        jmListarrCliente = new javax.swing.JMenuItem();
        jmcPessoaJuridica = new javax.swing.JMenuItem();
        jmContratos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        jmClientes.setText("Clientes");

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

        jmcPessoaJuridica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmcPessoaJuridica.setText("Pessoa Jurídica");
        jmcPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPessoaJuridicaActionPerformed(evt);
            }
        });
        jmClientes.add(jmcPessoaJuridica);

        jMenuBar1.add(jmClientes);

        jmContratos.setText("Contratos");
        jMenuBar1.add(jmContratos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmcPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPessoaFisicaActionPerformed
        FormularioPessoaFisica formularioPessoaFisica;
        centralizarForm.abrirFormulario(formularioPessoaFisica=new FormularioPessoaFisica(), jDesktop);
        
    }//GEN-LAST:event_jmcPessoaFisicaActionPerformed

    private void jmcPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPessoaJuridicaActionPerformed
        //FormularioCadastroPessoaJuridica formularioCadastroPessoaJuridica;
        //centralizarForm.abrirFormulario(formularioCadastroPessoaJuridica=new FormularioCadastroPessoaJuridica(), jDesktop);
    }//GEN-LAST:event_jmcPessoaJuridicaActionPerformed

    private void jmListarrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarrClienteActionPerformed
        FormularioListarClientes formularioListarClientes;
        centralizarForm.abrirFormulario(formularioListarClientes=new FormularioListarClientes(), jDesktop);
    }//GEN-LAST:event_jmListarrClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmContratos;
    private javax.swing.JMenuItem jmListarrCliente;
    private javax.swing.JMenuItem jmcPessoaFisica;
    private javax.swing.JMenuItem jmcPessoaJuridica;
    // End of variables declaration//GEN-END:variables
}
