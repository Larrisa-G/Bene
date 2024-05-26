
package com.app.paginas.contratos;

import com.app.api.BuscaCep;
import com.app.entidades.endereco.Endereco;
import com.app.util.DateUtilFormarter;
import com.app.util.FileChooser;
import com.app.word.WordContractPath;
import com.app.word.WordGenerator;
import java.io.IOException;
import javax.swing.JOptionPane;

public class AssistenciaMedicaEmpresa extends javax.swing.JInternalFrame {

    private final String contratanteTextWord = "(Nome da Contratante), com sede em (xxx), na Rua (xxx), nº (xxx), bairro (xxx), "
            + "Cep (xxx), no Estado (xxx), inscrita no C.N.P.J. sob o nº (xxx), e no"
            + " Cadastro Estadual sob o nº (xxx), neste ato representada pelo seu diretor (xxx), "
            + "(Nacionalidade), (Estado Civil), (Profissão), Carteira de Identidade nº (xxx), C.P.F. nº "
            + "(xxx), residente e domiciliado na Rua (xxx), nº (xxx), bairro (xxx), Cep (xxx), Cidade (xxx), no Estado (xxx);";
    
    private final String contratadaTextWord = "(Nome da Contratada), com sede em (xxx), na Rua (xxx), nº (xxx), bairro (xxx), "
            + "Cep (xxx), no Estado (xxx), inscrita no C.N.P.J. sob o nº (xxx), e no "
            + "Cadastro Estadual sob o nº (xxx), neste ato representada pelo seu diretor (xxx), "
            + "(Nacionalidade), (Estado Civil), (Profissão), Carteira de Identidade nº (xxx), C.P.F. nº (xxx), "
            + "residente e domiciliado na Rua (xxx), nº (xxx), bairro (xxx), Cep (xxx), Cidade (xxx), no Estado (xxx).";
    public AssistenciaMedicaEmpresa() {
        initComponents();
        setTitle("Assistência Médica à Empresa");
    }
    
    private String contratanteInfo() {
        
        String s = String.format("%s, com sede em %s, na %s, nº %s, bairro %s, Cep %s, no Estado %s,"
                + " inscrita no C.N.P.J. sob o nº %s, e no Cadastro Estadual sob o nº %s, "
                + "neste ato representada pelo seu diretor %s, "
                + "%s, %s, %s, Carteira de Identidade nº %s,"
                + " C.P.F. nº %s, residente e domiciliado na"
                + " Rua %s, nº %s, bairro %s,"
                + " Cep %s, Cidade %s, no Estado %s;",
                jpContratanteNomeEmpresa.getText(), jpContratanteEmpresaSedeEm.getText(), jpContratanteEmpresaRua.getText(), jpContratanteEmpresaNumero.getText(), 
                jpContratanteEmpresaBairro.getText(), jpContratanteEmpresaCEP.getText(), jpContratanteEmpresaEstado.getText(), 
                jpContratanteCNPJ.getText() ,jpContratanteCadastroEstadual.getText(), 
                jpContratanteRepresentanteNome.getText(), jpContratanteNacionalidade.getText(),(String)jpContratanteEstadoCivil.getSelectedItem(), 
                jpContratanteProfissao.getText(), jpContratanteRG.getText(), jpContratanteCPF.getText(), 
                jpContratanteRepresentanteRua.getText(), jpContratanteRepresentanteNumero.getText(), jpContratanteRepresentanteBairro.getText(), 
                jpContratanteRepresentanteCEP.getText(), jpContratanteRepresentanteCidade.getText(), jpContratanteRepresentanteEstado.getText()
                ); 
        
        return s;
    }
    
    private String contratadaInfo() {
         String s = String.format("%s, com sede em %s, na %s, nº %s, bairro %s, Cep %s, no Estado %s,"
                + " inscrita no C.N.P.J. sob o nº %s, e no Cadastro Estadual sob o nº %s, "
                + "neste ato representada pelo seu diretor %s, "
                + "%s, %s, %s, Carteira de Identidade nº %s,"
                + " C.P.F. nº %s, residente e domiciliado na"
                + " Rua %s, nº %s, bairro %s,"
                + " Cep %s, Cidade %s, no Estado %s;",
                jpContratadaNomeEmpresa.getText(), jpContratadaEmpresaSedeEm.getText(), jpContratadaEmpresaRua.getText(), jpContratadaEmpresaNumero.getText(),
                jpContratadaEmpresaBairro.getText(), jpContratadaEmpresaCEP.getText(), jpContratadaEmpresaEstado.getText(),
                jpContratanteCNPJ.getText(), jpContratanteCadastroEstadual.getText(),
                jpContratadaRepresentanteNome.getText(), jpContratadaNacionalidade.getText(),(String)jpContratadaEstadoCivil.getSelectedItem(),
                jpContratadaProfissao.getText(), jpContratadaRG.getText(), jpContratadaCPF.getText(),
                jpContratadaRepresentanteRua.getText(), jpContratadaRepresentanteNumero.getText(), jpContratadaRepresentanteBairro.getText(),
                jpContratadaRepresentanteCEP.getText(), jpContratadaRepresentanteCidade.getText(), jpContratadaRepresentanteEstado.getText()
                );
        
        return s;
    }
    
    private String isPlural(Integer num,String text) {
        return num > 1 ? text+"s" : text;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jpContratante = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpContratanteDadosEmpresa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpContratanteNomeEmpresa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jpContratanteCNPJ = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jpContratanteCadastroEstadual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jpContratanteEmpresaCEP = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jpContratanteEmpresaSedeEm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jpContratanteEmpresaEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jpContratanteEmpresaBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpContratanteEmpresaRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jpContratanteEmpresaNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jpContratanteDadosRepresentante = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpContratanteRepresentanteNome = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jpContratanteCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jpContratanteRG = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jpContratanteEstadoCivil = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jpContratanteProfissao = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jpContratanteNacionalidade = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jpContratanteRepresentanteCEP = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jpContratanteRepresentanteEstado = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jpContratanteRepresentanteCidade = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jpContratanteRepresentanteBairro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jpContratanteRepresentanteRua = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jpContratanteRepresentanteNumero = new javax.swing.JTextField();
        jbBuscarContratanteEmpresa = new javax.swing.JButton();
        jbBuscarCepContratanteEmpresa = new javax.swing.JButton();
        jbBuscarContratante = new javax.swing.JButton();
        jbBuscarCepContratanteRepesentante = new javax.swing.JButton();
        jpContratada = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jpContratadaDadosEmpresa = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jpContratadaNomeEmpresa = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jpContratadaCNPJ = new javax.swing.JFormattedTextField();
        jLabel54 = new javax.swing.JLabel();
        jpContratadaCadastroEstadual = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jpContratadaEmpresaCEP = new javax.swing.JFormattedTextField();
        jLabel56 = new javax.swing.JLabel();
        jpContratadaEmpresaSedeEm = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jpContratadaEmpresaEstado = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jpContratadaEmpresaBairro = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jpContratadaEmpresaRua = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jpContratadaEmpresaNumero = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jpContratadaDadosRepresentante = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jpContratadaRepresentanteNome = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jpContratadaCPF = new javax.swing.JFormattedTextField();
        jLabel64 = new javax.swing.JLabel();
        jpContratadaRG = new javax.swing.JFormattedTextField();
        jLabel65 = new javax.swing.JLabel();
        jpContratadaEstadoCivil = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jpContratadaProfissao = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jpContratadaNacionalidade = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jpContratadaRepresentanteCEP = new javax.swing.JFormattedTextField();
        jLabel69 = new javax.swing.JLabel();
        jpContratadaRepresentanteEstado = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jpContratadaRepresentanteCidade = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jpContratadaRepresentanteBairro = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jpContratadaRepresentanteRua = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jpContratadaRepresentanteNumero = new javax.swing.JTextField();
        jbBuscarCepEmpresaContratada = new javax.swing.JButton();
        jbBuscarCepRepresentanteContratada = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jpPagamento = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtQuantiaMensal = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jtDiaPagamento = new javax.swing.JSpinner();
        jLabel76 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jtPorcentagemMulta = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jpRescissao = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jtQtdMeses = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jpPrazo = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jtQtdPrazoContrato = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jtQtdPrazoProrrogacao = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jpForro = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jtForroComarca = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbSalvar)
                .addGap(29, 29, 29)
                .addComponent(jbCancelar)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jpContratante.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel26.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel26.setText("Contratante");

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel11.setText("Dados da Empresa");

        jpContratanteDadosEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setText("Nome da Empresa");

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel12.setText("CNPJ");

        try {
            jpContratanteCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel13.setText("Cadastro Estadual");

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel9.setText("CEP");

        try {
            jpContratanteEmpresaCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setText("Sede em");

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel10.setText("Estado");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel7.setText("Bairro");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel6.setText("Rua");

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel8.setText("Número");

        javax.swing.GroupLayout jpContratanteDadosEmpresaLayout = new javax.swing.GroupLayout(jpContratanteDadosEmpresa);
        jpContratanteDadosEmpresa.setLayout(jpContratanteDadosEmpresaLayout);
        jpContratanteDadosEmpresaLayout.setHorizontalGroup(
            jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratanteDadosEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContratanteDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jpContratanteEmpresaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpContratanteEmpresaSedeEm, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(78, 78, 78)
                        .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpContratanteEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratanteDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpContratanteDadosEmpresaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jpContratanteEmpresaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContratanteDadosEmpresaLayout.createSequentialGroup()
                                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jpContratanteNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jpContratanteCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jpContratanteCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratanteDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jpContratanteEmpresaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpContratanteEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(86, 86, 86))))
        );
        jpContratanteDadosEmpresaLayout.setVerticalGroup(
            jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratanteDadosEmpresaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratanteNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratanteEmpresaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteEmpresaSedeEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratanteEmpresaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteEmpresaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel14.setText("Dados do Representante");

        jpContratanteDadosRepresentante.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jpContratanteDadosRepresentante.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel15.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel15.setText("CPF");

        try {
            jpContratanteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setText("RG");

        try {
            jpContratanteRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel17.setText("Estado Civil");

        jpContratanteEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Selecione--"}));

        jLabel18.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel18.setText("Profissão");

        jLabel16.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel16.setText("Nacionalidade");

        jLabel22.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel22.setText("CEP");

        try {
            jpContratanteRepresentanteCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel23.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel23.setText("Estado");

        jLabel25.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel25.setText("Cidade");

        jLabel20.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel20.setText("Bairro");

        jLabel19.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel19.setText("Rua");

        jLabel21.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel21.setText("Número");

        javax.swing.GroupLayout jpContratanteDadosRepresentanteLayout = new javax.swing.GroupLayout(jpContratanteDadosRepresentante);
        jpContratanteDadosRepresentante.setLayout(jpContratanteDadosRepresentanteLayout);
        jpContratanteDadosRepresentanteLayout.setHorizontalGroup(
            jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                        .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpContratanteEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(67, 67, 67)
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpContratanteProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)))
                            .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                        .addComponent(jpContratanteRepresentanteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(175, 175, 175)))
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jpContratanteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jpContratanteNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137))
                            .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jpContratanteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(219, 219, 219)
                        .addComponent(jLabel19)
                        .addGap(258, 258, 258)
                        .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jpContratanteRepresentanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                        .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                .addComponent(jpContratanteRepresentanteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jpContratanteRepresentanteRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                        .addComponent(jpContratanteRepresentanteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(162, 162, 162)))
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpContratanteRepresentanteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(57, 57, 57)
                                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jpContratanteRepresentanteCidade))))
                        .addGap(137, 137, 137))))
        );
        jpContratanteDadosRepresentanteLayout.setVerticalGroup(
            jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratanteRepresentanteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel16))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContratanteProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratanteDadosRepresentanteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratanteRepresentanteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteRepresentanteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteRepresentanteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratanteDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratanteRepresentanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteRepresentanteRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratanteRepresentanteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        jbBuscarContratanteEmpresa.setText("Buscar Empresa");

        jbBuscarCepContratanteEmpresa.setText("Buscar Cep Empresa");
        jbBuscarCepContratanteEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCepContratanteEmpresaActionPerformed(evt);
            }
        });

        jbBuscarContratante.setText("Buscar Contratante");

        jbBuscarCepContratanteRepesentante.setText("Buscar Cep Representante");
        jbBuscarCepContratanteRepesentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCepContratanteRepesentanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContratanteLayout = new javax.swing.GroupLayout(jpContratante);
        jpContratante.setLayout(jpContratanteLayout);
        jpContratanteLayout.setHorizontalGroup(
            jpContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContratanteLayout.createSequentialGroup()
                        .addGroup(jpContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(52, 52, 52)
                        .addComponent(jbBuscarContratanteEmpresa)
                        .addGap(42, 42, 42)
                        .addComponent(jbBuscarCepContratanteEmpresa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpContratanteLayout.createSequentialGroup()
                        .addGroup(jpContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpContratanteLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(51, 51, 51)
                                .addComponent(jbBuscarContratante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscarCepContratanteRepesentante))
                            .addComponent(jpContratanteDadosRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpContratanteDadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpContratanteLayout.setVerticalGroup(
            jpContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratanteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jbBuscarContratanteEmpresa)
                    .addComponent(jbBuscarCepContratanteEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpContratanteDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jbBuscarCepContratanteRepesentante)
                    .addComponent(jbBuscarContratante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContratanteDadosRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jpContratada.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel51.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel51.setText("Contratada");

        jLabel24.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel24.setText("Dados da Empresa");

        jpContratadaDadosEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel52.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel52.setText("Nome da Empresa");

        jLabel53.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel53.setText("CNPJ");

        try {
            jpContratadaCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel54.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel54.setText("Cadastro Estadual");

        jLabel55.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel55.setText("CEP");

        try {
            jpContratadaEmpresaCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel56.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel56.setText("Sede em");

        jLabel57.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel57.setText("Estado");

        jLabel58.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel58.setText("Bairro");

        jLabel59.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel59.setText("Rua");

        jLabel60.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel60.setText("Número");

        javax.swing.GroupLayout jpContratadaDadosEmpresaLayout = new javax.swing.GroupLayout(jpContratadaDadosEmpresa);
        jpContratadaDadosEmpresa.setLayout(jpContratadaDadosEmpresaLayout);
        jpContratadaDadosEmpresaLayout.setHorizontalGroup(
            jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratadaDadosEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContratadaDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jpContratadaEmpresaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpContratadaEmpresaSedeEm, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addGap(78, 78, 78)
                        .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpContratadaEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratadaDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpContratadaDadosEmpresaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jpContratadaEmpresaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContratadaDadosEmpresaLayout.createSequentialGroup()
                                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jpContratadaNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(jpContratadaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(jpContratadaCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratadaDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jpContratadaEmpresaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpContratadaEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel60)
                        .addGap(86, 86, 86))))
        );
        jpContratadaDadosEmpresaLayout.setVerticalGroup(
            jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratadaDadosEmpresaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratadaNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratadaEmpresaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaEmpresaSedeEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratadaDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratadaEmpresaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaEmpresaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel61.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel61.setText("Dados do Representante");

        jpContratadaDadosRepresentante.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jpContratadaDadosRepresentante.setForeground(new java.awt.Color(102, 102, 102));

        jLabel62.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel62.setText("Nome");

        jLabel63.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel63.setText("CPF");

        try {
            jpContratadaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel64.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel64.setText("RG");

        try {
            jpContratadaRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel65.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel65.setText("Estado Civil");

        jpContratadaEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Selecione--"}));

        jLabel66.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel66.setText("Profissão");

        jLabel67.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel67.setText("Nacionalidade");

        jLabel68.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel68.setText("CEP");

        try {
            jpContratadaRepresentanteCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel69.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel69.setText("Estado");

        jLabel70.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel70.setText("Cidade");

        jLabel71.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel71.setText("Bairro");

        jLabel72.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel72.setText("Rua");

        jLabel73.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel73.setText("Número");

        javax.swing.GroupLayout jpContratadaDadosRepresentanteLayout = new javax.swing.GroupLayout(jpContratadaDadosRepresentante);
        jpContratadaDadosRepresentante.setLayout(jpContratadaDadosRepresentanteLayout);
        jpContratadaDadosRepresentanteLayout.setHorizontalGroup(
            jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                        .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                .addComponent(jpContratadaRepresentanteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jpContratadaRepresentanteRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(jpContratadaRepresentanteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpContratadaRepresentanteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel70)))
                        .addContainerGap())
                    .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                        .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpContratadaEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65))
                                .addGap(67, 67, 67)
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpContratadaProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66)))
                            .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                        .addComponent(jpContratadaRepresentanteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addGap(175, 175, 175)))
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addComponent(jpContratadaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jpContratadaNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137))
                            .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel64)
                                    .addComponent(jpContratadaRG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(219, 219, 219)
                        .addComponent(jLabel72)
                        .addGap(258, 258, 258)
                        .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(jpContratadaRepresentanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpContratadaRepresentanteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        jpContratadaDadosRepresentanteLayout.setVerticalGroup(
            jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratadaDadosRepresentanteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratadaRepresentanteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(jLabel67))
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContratadaProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratadaRepresentanteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaRepresentanteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaRepresentanteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratadaDadosRepresentanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpContratadaRepresentanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaRepresentanteRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaRepresentanteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        jbBuscarCepEmpresaContratada.setText("Buscar Cep empresa");
        jbBuscarCepEmpresaContratada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCepEmpresaContratadaActionPerformed(evt);
            }
        });

        jbBuscarCepRepresentanteContratada.setText("Buscar Cep Representante");
        jbBuscarCepRepresentanteContratada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCepRepresentanteContratadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContratadaLayout = new javax.swing.GroupLayout(jpContratada);
        jpContratada.setLayout(jpContratadaLayout);
        jpContratadaLayout.setHorizontalGroup(
            jpContratadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContratadaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpContratadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContratadaLayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(76, 76, 76)
                        .addComponent(jbBuscarCepRepresentanteContratada))
                    .addGroup(jpContratadaLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(113, 113, 113)
                        .addComponent(jbBuscarCepEmpresaContratada))
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratadaDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpContratadaDadosRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpContratadaLayout.setVerticalGroup(
            jpContratadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContratadaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContratadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jbBuscarCepEmpresaContratada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpContratadaDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContratadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jbBuscarCepRepresentanteContratada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpContratadaDadosRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jLabel77.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel77.setText("Clausulas do Contrato");

        jpPagamento.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel74.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel74.setText("13º Cláusula");

        jLabel75.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel75.setText("Do Pagamento");

        jLabel1.setText("Quantia mensal a ser paga pelo contratante");

        jLabel27.setText("R$");

        jLabel28.setText("Dia a ser pago");

        jtDiaPagamento.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel76.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel76.setText("14º Cláusula");

        jLabel29.setText("Porcentagem da multa caso o  descumprimento da cláusula anterior");

        jLabel30.setText("%");

        javax.swing.GroupLayout jpPagamentoLayout = new javax.swing.GroupLayout(jpPagamento);
        jpPagamento.setLayout(jpPagamentoLayout);
        jpPagamentoLayout.setHorizontalGroup(
            jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPagamentoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPagamentoLayout.createSequentialGroup()
                        .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPagamentoLayout.createSequentialGroup()
                        .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPagamentoLayout.createSequentialGroup()
                                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPagamentoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel29))
                                    .addComponent(jLabel76)
                                    .addGroup(jpPagamentoLayout.createSequentialGroup()
                                        .addComponent(jtPorcentagemMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel30)))
                                .addGap(0, 288, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPagamentoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jpPagamentoLayout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtQuantiaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jtDiaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))))
        );
        jpPagamentoLayout.setVerticalGroup(
            jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPagamentoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtQuantiaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jtDiaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPorcentagemMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jpRescissao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel79.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel79.setText("16º Cláusula");

        jLabel31.setText("Quantidades de meses a ser ressacido  caso uma das partes não cumpra o estabelecido em qualquer uma das cláusulas");

        jtQtdMeses.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel32.setText("meses");

        jLabel80.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel80.setText("Da Rescisão");

        javax.swing.GroupLayout jpRescissaoLayout = new javax.swing.GroupLayout(jpRescissao);
        jpRescissao.setLayout(jpRescissaoLayout);
        jpRescissaoLayout.setHorizontalGroup(
            jpRescissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRescissaoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpRescissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel80)
                    .addComponent(jLabel79)
                    .addGroup(jpRescissaoLayout.createSequentialGroup()
                        .addComponent(jtQtdMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jpRescissaoLayout.setVerticalGroup(
            jpRescissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRescissaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRescissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtQtdMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jpPrazo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel81.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel81.setText("17º Cláusula");

        jLabel33.setText("Prazo do contrato");

        jtQtdPrazoContrato.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel34.setText("anos");

        jLabel35.setText("Prazo de prorrogação do contrato");

        jtQtdPrazoProrrogacao.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel36.setText("dias");

        jLabel82.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel82.setText("Do Prazo");

        javax.swing.GroupLayout jpPrazoLayout = new javax.swing.GroupLayout(jpPrazo);
        jpPrazo.setLayout(jpPrazoLayout);
        jpPrazoLayout.setHorizontalGroup(
            jpPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrazoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addComponent(jLabel81)
                    .addGroup(jpPrazoLayout.createSequentialGroup()
                        .addGroup(jpPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addGroup(jpPrazoLayout.createSequentialGroup()
                                .addComponent(jtQtdPrazoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)))
                        .addGap(144, 144, 144)
                        .addGroup(jpPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addGroup(jpPrazoLayout.createSequentialGroup()
                                .addComponent(jtQtdPrazoProrrogacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jpPrazoLayout.setVerticalGroup(
            jpPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrazoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel82)
                .addGap(18, 18, 18)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtQtdPrazoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jtQtdPrazoProrrogacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpForro.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel78.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel78.setText("Do Forro");

        jLabel83.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel83.setText("18º Cláusula");

        jLabel37.setText("Forro da comarca elegido por ambas as partes");

        javax.swing.GroupLayout jpForroLayout = new javax.swing.GroupLayout(jpForro);
        jpForro.setLayout(jpForroLayout);
        jpForroLayout.setHorizontalGroup(
            jpForroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpForroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpForroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel83)
                    .addComponent(jLabel78)
                    .addComponent(jtForroComarca, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        jpForroLayout.setVerticalGroup(
            jpForroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpForroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtForroComarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel77))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpForro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpContratante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContratada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpRescissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jpContratante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpContratada, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addComponent(jpPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpRescissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jpPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jpForro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            WordGenerator wg = new WordGenerator();
            wg.setInputFilePath(WordContractPath.ASSISTENCIAMEDICAEMPRESA);
            wg.openWord();
            
            wg.modifyWord(contratanteTextWord, contratanteInfo());
            wg.modifyWord(contratadaTextWord,contratadaInfo());
            
            wg.modifyWord("(xxx) (Valor Expresso)", jtQuantiaMensal.getText());
            wg.modifyWord("todo dia (xxx)",String.format("todo dia %d",jtDiaPagamento.getValue())) ;
            wg.modifyWord("(xxx)%", jtPorcentagemMulta.getText()+"%");
            
            wg.modifyWord("(xxx) (Nº de mensalidades) mensalidades", String.format("%d %s", jtQtdMeses.getValue(), isPlural((Integer)jtQtdMeses.getValue(), "mensalidade")));
            wg.modifyWord("(xxx) ano", String.format("%d %s", jtQtdPrazoContrato.getValue(), isPlural((Integer)jtQtdPrazoContrato.getValue(), "ano")));
            wg.modifyWord("(xxx) dias", String.format("%d %s", jtQtdPrazoProrrogacao.getValue(), isPlural((Integer)jtQtdPrazoProrrogacao.getValue(), "dia")));
            
            wg.modifyWord("comarca de (xxx)", String.format("comarca de %s", jtForroComarca.getText()));
            
            wg.modifyWord("(Local, data e ano)", DateUtilFormarter.dateToStringContract());
            wg.setOutputFilePath(FileChooser.getPath());
            wg.close();
            JOptionPane.showMessageDialog(null, "Contrato gerado com sucesso");
        }
         catch(IOException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbBuscarCepContratanteEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepContratanteEmpresaActionPerformed
       try {
            Endereco endereco = BuscaCep.buscar(jpContratanteEmpresaCEP.getText().trim());
            jpContratanteEmpresaCEP.setText(endereco.getCep());
            jpContratanteEmpresaRua.setText(endereco.getLogradouro());
            jpContratanteEmpresaNumero.setText( String.valueOf((Object)endereco.getNumero()));
            jpContratanteEmpresaBairro.setText(endereco.getBairro());
            jpContratanteEmpresaSedeEm.setText(endereco.getCidade());
            jpContratanteEmpresaEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jbBuscarCepContratanteEmpresaActionPerformed

    private void jbBuscarCepContratanteRepesentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepContratanteRepesentanteActionPerformed
        try {
            Endereco endereco = BuscaCep.buscar(jpContratanteRepresentanteCEP.getText().trim());
            jpContratanteRepresentanteCEP.setText(endereco.getCep());
            jpContratanteRepresentanteRua.setText(endereco.getLogradouro());
            jpContratanteRepresentanteNumero.setText( String.valueOf((Object)endereco.getNumero()));
            jpContratanteRepresentanteBairro.setText(endereco.getBairro());
            jpContratanteRepresentanteCidade.setText(endereco.getCidade());
            jpContratanteRepresentanteEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jbBuscarCepContratanteRepesentanteActionPerformed

    private void jbBuscarCepEmpresaContratadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepEmpresaContratadaActionPerformed
        try {
            Endereco endereco = BuscaCep.buscar(jpContratadaEmpresaCEP.getText().trim());
            jpContratadaEmpresaCEP.setText(endereco.getCep());
            jpContratadaEmpresaRua.setText(endereco.getLogradouro());
            jpContratadaEmpresaNumero.setText( String.valueOf((Object)endereco.getNumero()));
            jpContratadaEmpresaBairro.setText(endereco.getBairro());
            jpContratadaEmpresaSedeEm.setText(endereco.getCidade());
            jpContratadaEmpresaEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jbBuscarCepEmpresaContratadaActionPerformed

    private void jbBuscarCepRepresentanteContratadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepRepresentanteContratadaActionPerformed
        try {
            Endereco endereco = BuscaCep.buscar(jpContratadaRepresentanteCEP.getText().trim());
            jpContratadaRepresentanteCEP.setText(endereco.getCep());
            jpContratadaRepresentanteRua.setText(endereco.getLogradouro());
            jpContratadaRepresentanteNumero.setText( String.valueOf((Object)endereco.getNumero()));
            jpContratadaRepresentanteBairro.setText(endereco.getBairro());
            jpContratadaRepresentanteCidade.setText(endereco.getCidade());
            jpContratadaRepresentanteEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jbBuscarCepRepresentanteContratadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCepContratanteEmpresa;
    private javax.swing.JButton jbBuscarCepContratanteRepesentante;
    private javax.swing.JButton jbBuscarCepEmpresaContratada;
    private javax.swing.JButton jbBuscarCepRepresentanteContratada;
    private javax.swing.JButton jbBuscarContratante;
    private javax.swing.JButton jbBuscarContratanteEmpresa;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpContratada;
    private javax.swing.JFormattedTextField jpContratadaCNPJ;
    private javax.swing.JFormattedTextField jpContratadaCPF;
    private javax.swing.JTextField jpContratadaCadastroEstadual;
    private javax.swing.JPanel jpContratadaDadosEmpresa;
    private javax.swing.JPanel jpContratadaDadosRepresentante;
    private javax.swing.JTextField jpContratadaEmpresaBairro;
    private javax.swing.JFormattedTextField jpContratadaEmpresaCEP;
    private javax.swing.JTextField jpContratadaEmpresaEstado;
    private javax.swing.JTextField jpContratadaEmpresaNumero;
    private javax.swing.JTextField jpContratadaEmpresaRua;
    private javax.swing.JTextField jpContratadaEmpresaSedeEm;
    private javax.swing.JComboBox<String> jpContratadaEstadoCivil;
    private javax.swing.JTextField jpContratadaNacionalidade;
    private javax.swing.JTextField jpContratadaNomeEmpresa;
    private javax.swing.JTextField jpContratadaProfissao;
    private javax.swing.JFormattedTextField jpContratadaRG;
    private javax.swing.JTextField jpContratadaRepresentanteBairro;
    private javax.swing.JFormattedTextField jpContratadaRepresentanteCEP;
    private javax.swing.JTextField jpContratadaRepresentanteCidade;
    private javax.swing.JTextField jpContratadaRepresentanteEstado;
    private javax.swing.JTextField jpContratadaRepresentanteNome;
    private javax.swing.JTextField jpContratadaRepresentanteNumero;
    private javax.swing.JTextField jpContratadaRepresentanteRua;
    private javax.swing.JPanel jpContratante;
    private javax.swing.JFormattedTextField jpContratanteCNPJ;
    private javax.swing.JFormattedTextField jpContratanteCPF;
    private javax.swing.JTextField jpContratanteCadastroEstadual;
    private javax.swing.JPanel jpContratanteDadosEmpresa;
    private javax.swing.JPanel jpContratanteDadosRepresentante;
    private javax.swing.JTextField jpContratanteEmpresaBairro;
    private javax.swing.JFormattedTextField jpContratanteEmpresaCEP;
    private javax.swing.JTextField jpContratanteEmpresaEstado;
    private javax.swing.JTextField jpContratanteEmpresaNumero;
    private javax.swing.JTextField jpContratanteEmpresaRua;
    private javax.swing.JTextField jpContratanteEmpresaSedeEm;
    private javax.swing.JComboBox<String> jpContratanteEstadoCivil;
    private javax.swing.JTextField jpContratanteNacionalidade;
    private javax.swing.JTextField jpContratanteNomeEmpresa;
    private javax.swing.JTextField jpContratanteProfissao;
    private javax.swing.JFormattedTextField jpContratanteRG;
    private javax.swing.JTextField jpContratanteRepresentanteBairro;
    private javax.swing.JFormattedTextField jpContratanteRepresentanteCEP;
    private javax.swing.JTextField jpContratanteRepresentanteCidade;
    private javax.swing.JTextField jpContratanteRepresentanteEstado;
    private javax.swing.JTextField jpContratanteRepresentanteNome;
    private javax.swing.JTextField jpContratanteRepresentanteNumero;
    private javax.swing.JTextField jpContratanteRepresentanteRua;
    private javax.swing.JPanel jpForro;
    private javax.swing.JPanel jpPagamento;
    private javax.swing.JPanel jpPrazo;
    private javax.swing.JPanel jpRescissao;
    private javax.swing.JSpinner jtDiaPagamento;
    private javax.swing.JTextField jtForroComarca;
    private javax.swing.JTextField jtPorcentagemMulta;
    private javax.swing.JSpinner jtQtdMeses;
    private javax.swing.JSpinner jtQtdPrazoContrato;
    private javax.swing.JSpinner jtQtdPrazoProrrogacao;
    private javax.swing.JTextField jtQuantiaMensal;
    // End of variables declaration//GEN-END:variables
}
