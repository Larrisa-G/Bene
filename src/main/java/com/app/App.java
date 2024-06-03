
package com.app;

import com.app.entidades.usuario.Usuario;
import com.app.paginas.contratos.AssistenciaMedicaEmpresa;
import com.app.paginas.contratos.CobrancaBancariaIndevida;
import com.app.paginas.contratos.ComodatoImovel;
import com.app.paginas.pessoa.fisica.FormularioCriarPessoaFisica;
import com.app.paginas.pessoa.juridica.FormularioCriarPessoaJuridica;
import com.app.paginas.pessoa.FormularioListarClientes;
import com.app.paginas.contratos.PerdaCartao;
import com.app.paginas.pessoa.fisica.FormularioAlterarPessoaFisica;
import com.app.paginas.pessoa.juridica.FormularioAlterarPessoaJuridica;
import com.app.paginas.usuario.ConfigurarUsuario;
import com.app.util.CentralizarForm;
import javax.swing.JFrame;


public class App extends javax.swing.JFrame {
    private CentralizarForm centralizarForm = new CentralizarForm();
    private Usuario user;
    public App(Usuario user) {
        
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.user = user;
        jlUsername.setText("Olá, "+user.getNome());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlUsername = new javax.swing.JLabel();
        jbLogOut = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmListarrCliente = new javax.swing.JMenuItem();
        jmPessoaFisica = new javax.swing.JMenu();
        jmcPFCriar = new javax.swing.JMenuItem();
        jmcPFAlterar = new javax.swing.JMenuItem();
        jmPessoaJuridica = new javax.swing.JMenu();
        jmcPJCriar = new javax.swing.JMenuItem();
        jmcPJAlterar = new javax.swing.JMenuItem();
        jmContratos = new javax.swing.JMenu();
        jmiPerdaCartao = new javax.swing.JMenuItem();
        jmiCobrancaBancariaIndevida = new javax.swing.JMenuItem();
        jmiAssistenciaMedicaEmpresa = new javax.swing.JMenuItem();
        jmiComodatoImovel = new javax.swing.JMenuItem();
        jmUsuario = new javax.swing.JMenu();
        jmUsuarioConfiguracao = new javax.swing.JMenuItem();

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

        jbLogOut.setText("Log out");
        jbLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jbLogOut)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmClientes.setText("Clientes");

        jmListarrCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmListarrCliente.setText("Listar");
        jmListarrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarrClienteActionPerformed(evt);
            }
        });
        jmClientes.add(jmListarrCliente);

        jmPessoaFisica.setText("Pessoa Física");

        jmcPFCriar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmcPFCriar.setText("Criar");
        jmcPFCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPFCriarActionPerformed(evt);
            }
        });
        jmPessoaFisica.add(jmcPFCriar);

        jmcPFAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmcPFAlterar.setText("Alterar");
        jmcPFAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPFAlterarActionPerformed(evt);
            }
        });
        jmPessoaFisica.add(jmcPFAlterar);

        jmClientes.add(jmPessoaFisica);

        jmPessoaJuridica.setText("Pessoa Jurídica");

        jmcPJCriar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmcPJCriar.setText("Criar");
        jmcPJCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPJCriarActionPerformed(evt);
            }
        });
        jmPessoaJuridica.add(jmcPJCriar);

        jmcPJAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmcPJAlterar.setText("Alterar");
        jmcPJAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcPJAlterarActionPerformed(evt);
            }
        });
        jmPessoaJuridica.add(jmcPJAlterar);

        jmClientes.add(jmPessoaJuridica);

        jMenuBar1.add(jmClientes);

        jmContratos.setText("Contratos");

        jmiPerdaCartao.setText("Perda Cartão");
        jmiPerdaCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPerdaCartaoActionPerformed(evt);
            }
        });
        jmContratos.add(jmiPerdaCartao);

        jmiCobrancaBancariaIndevida.setText("Cobrança Bancaria Indevida");
        jmiCobrancaBancariaIndevida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCobrancaBancariaIndevidaActionPerformed(evt);
            }
        });
        jmContratos.add(jmiCobrancaBancariaIndevida);

        jmiAssistenciaMedicaEmpresa.setText("Assistencia Médica à Empresa");
        jmiAssistenciaMedicaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAssistenciaMedicaEmpresaActionPerformed(evt);
            }
        });
        jmContratos.add(jmiAssistenciaMedicaEmpresa);

        jmiComodatoImovel.setText(" Comodato de Imóvel para moradia de empregado");
        jmiComodatoImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComodatoImovelActionPerformed(evt);
            }
        });
        jmContratos.add(jmiComodatoImovel);

        jMenuBar1.add(jmContratos);

        jmUsuario.setText("Usuario");

        jmUsuarioConfiguracao.setText("configurações");
        jmUsuarioConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuarioConfiguracaoActionPerformed(evt);
            }
        });
        jmUsuario.add(jmUsuarioConfiguracao);

        jMenuBar1.add(jmUsuario);

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

    private void jmiPerdaCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPerdaCartaoActionPerformed
        PerdaCartao perdaCartao;
        centralizarForm.abrirFormulario(perdaCartao=new PerdaCartao(), jDesktop);
    }//GEN-LAST:event_jmiPerdaCartaoActionPerformed

    private void jmListarrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarrClienteActionPerformed
        FormularioListarClientes formularioListarClientes;
        centralizarForm.abrirFormulario(formularioListarClientes=new FormularioListarClientes(), jDesktop);
    }//GEN-LAST:event_jmListarrClienteActionPerformed

    private void jmcPFCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPFCriarActionPerformed
        FormularioCriarPessoaFisica formularioCriarPessoaFisica;
        centralizarForm.abrirFormulario(formularioCriarPessoaFisica=new FormularioCriarPessoaFisica(), jDesktop);

    }//GEN-LAST:event_jmcPFCriarActionPerformed

    private void jmcPJCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPJCriarActionPerformed
        FormularioCriarPessoaJuridica criarPessoaJuridica;
        centralizarForm.abrirFormulario(criarPessoaJuridica=new FormularioCriarPessoaJuridica(), jDesktop);
    }//GEN-LAST:event_jmcPJCriarActionPerformed

    private void jmcPFAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPFAlterarActionPerformed
        FormularioAlterarPessoaFisica formularioAlterarPessoaFisica;
        centralizarForm.abrirFormulario(formularioAlterarPessoaFisica=new FormularioAlterarPessoaFisica(), jDesktop);
    }//GEN-LAST:event_jmcPFAlterarActionPerformed

    private void jmcPJAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcPJAlterarActionPerformed
         FormularioAlterarPessoaJuridica formularioAlterarPessoaJuridica;
        centralizarForm.abrirFormulario(formularioAlterarPessoaJuridica=new FormularioAlterarPessoaJuridica(), jDesktop);
    }//GEN-LAST:event_jmcPJAlterarActionPerformed

    private void jbLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogOutActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jbLogOutActionPerformed

    private void jmiCobrancaBancariaIndevidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCobrancaBancariaIndevidaActionPerformed
        CobrancaBancariaIndevida cobrancaBancariaIndevida;
        centralizarForm.abrirFormulario(cobrancaBancariaIndevida = new CobrancaBancariaIndevida(), jDesktop);
    }//GEN-LAST:event_jmiCobrancaBancariaIndevidaActionPerformed

    private void jmiAssistenciaMedicaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAssistenciaMedicaEmpresaActionPerformed
        AssistenciaMedicaEmpresa assistenciaMedicaEmpresa;
        centralizarForm.abrirFormulario(assistenciaMedicaEmpresa = new AssistenciaMedicaEmpresa(), jDesktop);
    }//GEN-LAST:event_jmiAssistenciaMedicaEmpresaActionPerformed

    private void jmiComodatoImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComodatoImovelActionPerformed
       ComodatoImovel comodatoImovel;
       centralizarForm.abrirFormulario(comodatoImovel = new ComodatoImovel(), jDesktop);
    }//GEN-LAST:event_jmiComodatoImovelActionPerformed

    private void jmUsuarioConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuarioConfiguracaoActionPerformed
        ConfigurarUsuario configurarUsuario;
        centralizarForm.abrirFormulario(configurarUsuario = new ConfigurarUsuario(user), jDesktop);
    }//GEN-LAST:event_jmUsuarioConfiguracaoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLogOut;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmContratos;
    private javax.swing.JMenuItem jmListarrCliente;
    private javax.swing.JMenu jmPessoaFisica;
    private javax.swing.JMenu jmPessoaJuridica;
    private javax.swing.JMenu jmUsuario;
    private javax.swing.JMenuItem jmUsuarioConfiguracao;
    private javax.swing.JMenuItem jmcPFAlterar;
    private javax.swing.JMenuItem jmcPFCriar;
    private javax.swing.JMenuItem jmcPJAlterar;
    private javax.swing.JMenuItem jmcPJCriar;
    private javax.swing.JMenuItem jmiAssistenciaMedicaEmpresa;
    private javax.swing.JMenuItem jmiCobrancaBancariaIndevida;
    private javax.swing.JMenuItem jmiComodatoImovel;
    private javax.swing.JMenuItem jmiPerdaCartao;
    // End of variables declaration//GEN-END:variables
}
