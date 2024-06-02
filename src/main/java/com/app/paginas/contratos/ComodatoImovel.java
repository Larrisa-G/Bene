
package com.app.paginas.contratos;

import com.app.api.BuscaCep;
import com.app.controller.contratos.ComodatoImovelController;
import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.EstadoCivil;
import com.app.entidades.pessoas.Fisica;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ValidationError;
import com.app.util.DateUtilFormarter;
import com.app.util.FileChooser;
import com.app.util.ValoresEnum;
import com.app.word.WordContractPath;
import com.app.word.WordGenerator;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ComodatoImovel extends javax.swing.JInternalFrame {
    ComodatoImovelController controller = new ComodatoImovelController();
    
    private final String comodanteTextWord = "(Nome da Comodante), com sede em (xxx), na Rua (xxx), nº (xxx), bairro (xxx), "
            + "Cep (xxx), no Estado (xxx), inscrita no C.N.P.J. sob o nº (xxx), e no"
            + " Cadastro Estadual sob o nº (xxx), neste ato representada pelo seu diretor (xxx), "
            + "(Nacionalidade), (Estado Civil), (Profissão), Carteira de Identidade nº (xxx), C.P.F. nº "
            + "(xxx), residente e domiciliado na Rua (xxx), nº (xxx), bairro (xxx), Cep (xxx), Cidade (xxx), no Estado (xxx);";
    
    private final String comodatarioTextWord = "(Nome do Comodatário), (Nacionalidade), (Estado Civil), (Profissão), "
            + "Carteira de Identidade nº (xxx), C.P.F. nº (xxx), Carteira de Trabalho nº (xxx) e série (xxx), "
            + "residente e domiciliado na Rua (xxx), nº (xxx), bairro (xxx), Cep (xxx), Cidade (xxx), no Estado (xxx).";
    
    private final String objcontrato = "O presente contrato tem como OBJETO, o imóvel de propriedade da COMODANTE, "
            + "localizado na Rua (xxx), nº (xxx), bairro (xxx), Cep (xxx), na Cidade (xxx), no Estado (xxx), "
            + "sob o Registro nº (xxx), do Cartório do (xxx) Ofício de Registro de Imóveis, livre de ônus ou quaisquer dívidas.";
    
    public ComodatoImovel() {
        initComponents();
        setTitle("Comodado de Imóvel para moradia de empregado");
    }
    
    private String comodanteInfo() {
        
        String s = String.format("%s, com sede em %s, na %s, nº %s, bairro %s, Cep %s, no Estado %s,"
                + " inscrita no C.N.P.J. sob o nº %s, e no Cadastro Estadual sob o nº %s, "
                + "neste ato representada pelo seu diretor %s, "
                + "%s, %s, %s, Carteira de Identidade nº %s,"
                + " C.P.F. nº %s, residente e domiciliado na"
                + " Rua %s, nº %s, bairro %s,"
                + " Cep %s, Cidade %s, no Estado %s;",
                jtComodanteNomeEmpresa.getText(), jtComodanteSedeEm.getText(), jtComodanteEmpresaRua.getText(), jtComodanteEmpresaNumero.getText(), 
                jtComodanteEmpresaBairro.getText(), jtComodanteEmpresaCEP.getText(), jtComodanteEmpresaEstado.getText(), 
                jtComodanteCNPJ.getText() ,jtComodanteCadastroEstadual.getText(), 
                jtContratanteComodanteNome.getText(), jtContratanteComodanteNacionalidade.getText(),(String)jtContratanteComodanteEstadoCivil.getSelectedItem(), 
                jtContratanteComodanteProfissao.getText(), jtContratanteComodanteRG.getText(), jtContratanteComodanteCPF.getText(), 
                jtContratanteComodanteRua.getText(), jtContratanteComodanteNumero.getText(), jtContratanteComodanteBairro.getText(), 
                jtContratanteComodanteCEP.getText(), jtContratanteComodanteCidade.getText(), jtContratanteComodanteEstado.getText()
                ); 
        
        return s;
    }
    
    private String comodatarioInfo() {
         String s = String.format("%s, %s, %s, %s, "
            + "Carteira de Identidade nº %s, C.P.F. nº %s, Carteira de Trabalho nº %s e série %s, "
            + "residente e domiciliado na Rua %s, nº %s, bairro %s, Cep %s, Cidade %s, no Estado %s.",
                jtComodatarioNome.getText(), jtComodatarioNacionalidade.getText(),(String)jtComodatarioEstadoCivil.getSelectedItem(),
                jtComodatarioProfissao.getText(), jtComodatarioRG.getText(), jtComodatarioCPF.getText(),
                jtComodatarioCarteiraTrabalho.getText(),jtComodatarioSerieCarteiraTrabalho.getText(),
                jtComodatarioRua.getText(), jtComodatarioNumero.getText(), jtComodatarioBairro.getText(),
                jtComodatarioCEP.getText(), jtComodatarioCidade.getText(), jtComodatarioEstado.getText()
                );
        
        return s;
    }
    
    private String objetodoContrato(){
        String s = String.format("O presente contrato tem como OBJETO, o imóvel de propriedade da COMODANTE, "
                + "localizado na Rua %s, nº %s, bairro %s, Cep %s, na Cidade %s, "
                + "no Estado %s, sob o Registro nº %s, do Cartório do %s Ofício de Registro de Imóveis, "
                + "livre de ônus ou quaisquer dívidas.",jtPropriedadeRua.getText(),jtPropriedadeNumero.getText(),jtPropriedadeBairro.getText(),
                jtPropriedadeCEP.getText(),jtPropriedadeCidade.getText(),
                jtPropriedadeEstado.getText(),jtPropriedadeRegistro.getText(),jtPropriedadeCartorio.getText());
        
        return s;
    }   
    
    
    private void validarDadosComodante() throws ValidationError {
        try {
            Juridica juridica = new Juridica(
                    jtComodanteNomeEmpresa.getText(),jtContratanteComodanteCPF.getText(), 
                    jtComodanteCNPJ.getText() ,jtComodanteCadastroEstadual.getText(),
                    new Endereco(
                       jtComodanteEmpresaRua.getText(), Integer.parseInt(jtComodanteEmpresaNumero.getText()),"", jtComodanteEmpresaBairro.getText(),
                        jtComodanteEmpresaCEP.getText(),jtComodanteSedeEm.getText(), jtComodanteEmpresaEstado.getText()
                    )
            ) ;
                
            
            Fisica fisica = new Fisica(
                jtContratanteComodanteNome.getText(),jtContratanteComodanteCPF.getText(),null,EstadoCivil.valueOf((String)jtContratanteComodanteEstadoCivil.getSelectedItem()),
               jtContratanteComodanteRG.getText(), DateUtilFormarter.dateToString(),jtContratanteComodanteNacionalidade.getText(), jtContratanteComodanteProfissao.getText(), 
                new Endereco(
                        jtContratanteComodanteRua.getText(),Integer.parseInt(jtContratanteComodanteNumero.getText()),"",
                        jtContratanteComodanteBairro.getText(),jtContratanteComodanteCEP.getText(),
                       jtContratanteComodanteCidade.getText(), jtContratanteComodanteEstado.getText()
                )                    
            );
            controller.validarComodante(juridica,fisica);
        } catch(ValidationError e) {
           throw new ValidationError("Erro nos campos do Comodante: "+e.getMessage());
        } catch(NumberFormatException e) {
           throw new ValidationError("Erro nos campos do Comodante: Número inválido ");
        } catch (IllegalArgumentException e) {
            throw new ValidationError("Erro nos campos da Comodante: Estado Civil Inválido");
        }
    }
    
    private void validarDadosComodatario() throws ValidationError {
        try {
            
                
            
            Fisica fisica = new Fisica(
               jtComodatarioNome.getText(),jtComodatarioCPF.getText(),null,EstadoCivil.valueOf((String)jtComodatarioEstadoCivil.getSelectedItem()),
                jtComodatarioRG.getText(), DateUtilFormarter.dateToString(),jtComodatarioNacionalidade.getText(), jtComodatarioProfissao.getText(), 
                new Endereco(
                        jtComodatarioRua.getText(), Integer.parseInt(jtComodatarioNumero.getText()),"",
                        jtComodatarioBairro.getText(),jtComodatarioCEP.getText(),
                        jtComodatarioCidade.getText(), jtComodatarioEstado.getText()
                )                    
            );
            controller.validarComodatario(fisica, jtComodatarioCarteiraTrabalho.getText(),jtComodatarioSerieCarteiraTrabalho.getText());
        } catch(ValidationError e) {
           throw new ValidationError("Erro nos campos do Comodatário: "+e.getMessage());
        } catch(NumberFormatException e) {
           throw new ValidationError("Erro nos campos do Comodatário: Número inválido ");
        } catch (IllegalArgumentException e) {
            throw new ValidationError("Erro nos campos do Comodatário: Estado Civil Inválido");
        }
    }
    
    private void validarObjContrato() throws ValidationError {
        try {
            Endereco endereco = new Endereco(
                    jtPropriedadeRua.getText(), Integer.parseInt(jtPropriedadeNumero.getText()), "",
                    jtPropriedadeBairro.getText(),jtPropriedadeCEP.getText(),
                    jtPropriedadeCidade.getText(),jtPropriedadeCidade.getText()
            );
            
            controller.validarObjContrato(endereco, jtPropriedadeCartorio.getText(), jtPropriedadeRegistro.getText());
        }catch(ValidationError e) {
           throw new ValidationError("Erro nos campos do Objeto de contrato: "+e.getMessage());
        } catch(NumberFormatException e) {
           throw new ValidationError("Erro nos campos do Objeto de contrato: Número inválido ");
        } 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jpComodante = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpComodanteDadosEmpresa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtComodanteNomeEmpresa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtComodanteCNPJ = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jtComodanteCadastroEstadual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtComodanteEmpresaCEP = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jtComodanteSedeEm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtComodanteEmpresaEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtComodanteEmpresaBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtComodanteEmpresaRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtComodanteEmpresaNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jpComodanteDados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtContratanteComodanteNome = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtContratanteComodanteCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jtContratanteComodanteRG = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jtContratanteComodanteEstadoCivil = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jtContratanteComodanteProfissao = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtContratanteComodanteNacionalidade = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jtContratanteComodanteCEP = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jtContratanteComodanteEstado = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtContratanteComodanteCidade = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtContratanteComodanteBairro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtContratanteComodanteRua = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jtContratanteComodanteNumero = new javax.swing.JTextField();
        jbBuscarContratanteEmpresa = new javax.swing.JButton();
        jbBuscarCepContratanteEmpresa = new javax.swing.JButton();
        jbBuscarContratante = new javax.swing.JButton();
        jbBuscarCepContratanteRepesentante = new javax.swing.JButton();
        jpComodatario = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jpComodatarioDados = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jtComodatarioNome = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jtComodatarioCPF = new javax.swing.JFormattedTextField();
        jLabel64 = new javax.swing.JLabel();
        jtComodatarioRG = new javax.swing.JFormattedTextField();
        jLabel65 = new javax.swing.JLabel();
        jtComodatarioEstadoCivil = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jtComodatarioProfissao = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jtComodatarioNacionalidade = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jtComodatarioCEP = new javax.swing.JFormattedTextField();
        jLabel69 = new javax.swing.JLabel();
        jtComodatarioEstado = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jtComodatarioCidade = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jtComodatarioBairro = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jtComodatarioRua = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jtComodatarioNumero = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jtComodatarioCarteiraTrabalho = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jtComodatarioSerieCarteiraTrabalho = new javax.swing.JTextField();
        jbBuscarCepComodatario = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jpObjContrato = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jtPropriedadeCEP = new javax.swing.JFormattedTextField();
        jtPropriedadeEstado = new javax.swing.JTextField();
        jtPropriedadeCidade = new javax.swing.JTextField();
        jtPropriedadeBairro = new javax.swing.JTextField();
        jtPropriedadeRua = new javax.swing.JTextField();
        jtPropriedadeNumero = new javax.swing.JTextField();
        jtPropriedadeCartorio = new javax.swing.JTextField();
        jtPropriedadeRegistro = new javax.swing.JTextField();
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
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

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

        jpComodante.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel26.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel26.setText("Comodante");

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel11.setText("Dados da Empresa");

        jpComodanteDadosEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setText("Nome da Empresa");

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel12.setText("CNPJ");

        try {
            jtComodanteCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel13.setText("Cadastro Estadual");

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel9.setText("CEP");

        try {
            jtComodanteEmpresaCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
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

        javax.swing.GroupLayout jpComodanteDadosEmpresaLayout = new javax.swing.GroupLayout(jpComodanteDadosEmpresa);
        jpComodanteDadosEmpresa.setLayout(jpComodanteDadosEmpresaLayout);
        jpComodanteDadosEmpresaLayout.setHorizontalGroup(
            jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodanteDadosEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComodanteDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtComodanteEmpresaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtComodanteSedeEm, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(78, 78, 78)
                        .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtComodanteEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodanteDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpComodanteDadosEmpresaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtComodanteEmpresaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpComodanteDadosEmpresaLayout.createSequentialGroup()
                                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtComodanteNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jtComodanteCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jtComodanteCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodanteDadosEmpresaLayout.createSequentialGroup()
                        .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtComodanteEmpresaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtComodanteEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(86, 86, 86))))
        );
        jpComodanteDadosEmpresaLayout.setVerticalGroup(
            jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodanteDadosEmpresaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodanteNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodanteCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodanteCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodanteEmpresaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodanteSedeEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodanteEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpComodanteDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodanteEmpresaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodanteEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodanteEmpresaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel14.setText("Dados do Representante");

        jpComodanteDados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jpComodanteDados.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel15.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel15.setText("CPF");

        try {
            jtContratanteComodanteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setText("RG");

        try {
            jtContratanteComodanteRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel17.setText("Estado Civil");

        jtContratanteComodanteEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(ValoresEnum.obterValoresEnum(EstadoCivil.class)));

        jLabel18.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel18.setText("Profissão");

        jLabel16.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel16.setText("Nacionalidade");

        jLabel22.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel22.setText("CEP");

        try {
            jtContratanteComodanteCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
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

        javax.swing.GroupLayout jpComodanteDadosLayout = new javax.swing.GroupLayout(jpComodanteDados);
        jpComodanteDados.setLayout(jpComodanteDadosLayout);
        jpComodanteDadosLayout.setHorizontalGroup(
            jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                        .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtContratanteComodanteEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(67, 67, 67)
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtContratanteComodanteProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)))
                            .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodanteDadosLayout.createSequentialGroup()
                                        .addComponent(jtContratanteComodanteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(175, 175, 175)))
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jtContratanteComodanteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodanteDadosLayout.createSequentialGroup()
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jtContratanteComodanteNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137))
                            .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtContratanteComodanteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpComodanteDadosLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(219, 219, 219)
                        .addComponent(jLabel19)
                        .addGap(258, 258, 258)
                        .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jtContratanteComodanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpComodanteDadosLayout.createSequentialGroup()
                        .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpComodanteDadosLayout.createSequentialGroup()
                                .addComponent(jtContratanteComodanteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jtContratanteComodanteRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpComodanteDadosLayout.createSequentialGroup()
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                                        .addComponent(jtContratanteComodanteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodanteDadosLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(162, 162, 162)))
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtContratanteComodanteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(57, 57, 57)
                                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jtContratanteComodanteCidade))))
                        .addGap(137, 137, 137))))
        );
        jpComodanteDadosLayout.setVerticalGroup(
            jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtContratanteComodanteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel16))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtContratanteComodanteProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComodanteDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodanteDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtContratanteComodanteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpComodanteDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtContratanteComodanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContratanteComodanteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout jpComodanteLayout = new javax.swing.GroupLayout(jpComodante);
        jpComodante.setLayout(jpComodanteLayout);
        jpComodanteLayout.setHorizontalGroup(
            jpComodanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpComodanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComodanteLayout.createSequentialGroup()
                        .addGroup(jpComodanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(52, 52, 52)
                        .addComponent(jbBuscarContratanteEmpresa)
                        .addGap(42, 42, 42)
                        .addComponent(jbBuscarCepContratanteEmpresa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpComodanteLayout.createSequentialGroup()
                        .addGroup(jpComodanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpComodanteLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(51, 51, 51)
                                .addComponent(jbBuscarContratante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscarCepContratanteRepesentante))
                            .addComponent(jpComodanteDados, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpComodanteDadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpComodanteLayout.setVerticalGroup(
            jpComodanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodanteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpComodanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jbBuscarContratanteEmpresa)
                    .addComponent(jbBuscarCepContratanteEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpComodanteDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpComodanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jbBuscarCepContratanteRepesentante)
                    .addComponent(jbBuscarContratante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpComodanteDados, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jpComodatario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel51.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel51.setText("Comodatário");

        jLabel61.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jpComodatarioDados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jpComodatarioDados.setForeground(new java.awt.Color(102, 102, 102));

        jLabel62.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel62.setText("Nome");

        jLabel63.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel63.setText("CPF");

        try {
            jtComodatarioCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel64.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel64.setText("RG");

        try {
            jtComodatarioRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel65.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel65.setText("Estado Civil");

        jtComodatarioEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(ValoresEnum.obterValoresEnum(EstadoCivil.class)));

        jLabel66.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel66.setText("Profissão");

        jLabel67.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel67.setText("Nacionalidade");

        jLabel68.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel68.setText("CEP");

        try {
            jtComodatarioCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
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

        jLabel84.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel84.setText("Série da Carteira de Trabalho");

        jLabel85.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel85.setText("Nº da Cartira de Trabalho");

        javax.swing.GroupLayout jpComodatarioDadosLayout = new javax.swing.GroupLayout(jpComodatarioDados);
        jpComodatarioDados.setLayout(jpComodatarioDadosLayout);
        jpComodatarioDadosLayout.setHorizontalGroup(
            jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                        .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtComodatarioBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71))
                                .addGap(31, 31, 31)
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtComodatarioRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72))
                                .addGap(18, 18, 18)
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73)
                                    .addComponent(jtComodatarioNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtComodatarioCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68))
                                .addGap(48, 48, 48)
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtComodatarioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69))
                                .addGap(39, 39, 39)
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70)
                                    .addComponent(jtComodatarioCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                                .addComponent(jtComodatarioEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240)
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jtComodatarioNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtComodatarioCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                        .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addGap(111, 111, 111)
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtComodatarioProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66)))
                            .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addGap(175, 175, 175))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpComodatarioDadosLayout.createSequentialGroup()
                                        .addComponent(jtComodatarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addComponent(jtComodatarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jtComodatarioRG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodatarioDadosLayout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtComodatarioSerieCarteiraTrabalho)
                            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addGap(137, 137, 137))))
        );
        jpComodatarioDadosLayout.setVerticalGroup(
            jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodatarioDadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64))
                .addGap(14, 14, 14)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodatarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel84))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodatarioCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioSerieCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodatarioEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodatarioCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpComodatarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtComodatarioBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComodatarioNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jbBuscarCepComodatario.setText("Buscar Cep Representante");
        jbBuscarCepComodatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCepComodatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpComodatarioLayout = new javax.swing.GroupLayout(jpComodatario);
        jpComodatario.setLayout(jpComodatarioLayout);
        jpComodatarioLayout.setHorizontalGroup(
            jpComodatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComodatarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpComodatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComodatarioLayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpComodatarioLayout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscarCepComodatario)
                        .addGap(134, 134, 134))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodatarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpComodatarioDados, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jpComodatarioLayout.setVerticalGroup(
            jpComodatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComodatarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpComodatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jbBuscarCepComodatario))
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpComodatarioDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel77.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel77.setText("Clausulas do Contrato");

        jpObjContrato.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel74.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel74.setText("Rua");

        jLabel75.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel75.setText("DO OBJETO DO CONTRATO");

        jLabel86.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel86.setText("1º Cláusula");

        jLabel76.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel76.setText("Numero");

        jLabel87.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel87.setText("Bairro");

        jLabel88.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel88.setText("Cep");

        jLabel89.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel89.setText("Cidade");

        jLabel90.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel90.setText("Estado");

        jLabel91.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel91.setText("Número do Registro da propriedade");

        jLabel92.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel92.setText("Cartório do Ofício de Registro de Imóveil");

        try {
            jtPropriedadeCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpObjContratoLayout = new javax.swing.GroupLayout(jpObjContrato);
        jpObjContrato.setLayout(jpObjContratoLayout);
        jpObjContratoLayout.setHorizontalGroup(
            jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpObjContratoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpObjContratoLayout.createSequentialGroup()
                        .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpObjContratoLayout.createSequentialGroup()
                                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpObjContratoLayout.createSequentialGroup()
                                        .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpObjContratoLayout.createSequentialGroup()
                                                .addComponent(jLabel88)
                                                .addGap(153, 153, 153))
                                            .addGroup(jpObjContratoLayout.createSequentialGroup()
                                                .addComponent(jtPropriedadeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)))
                                        .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel90)
                                            .addComponent(jtPropriedadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtPropriedadeRua, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jpObjContratoLayout.createSequentialGroup()
                                        .addComponent(jLabel87)
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel74))
                                    .addComponent(jtPropriedadeCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jpObjContratoLayout.createSequentialGroup()
                                .addComponent(jtPropriedadeCartorio)
                                .addGap(119, 119, 119)))
                        .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpObjContratoLayout.createSequentialGroup()
                                .addComponent(jLabel89)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpObjContratoLayout.createSequentialGroup()
                                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtPropriedadeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpObjContratoLayout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel76)
                                            .addComponent(jtPropriedadeNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jpObjContratoLayout.createSequentialGroup()
                        .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpObjContratoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(jLabel75)
                            .addGroup(jpObjContratoLayout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addGap(88, 88, 88)
                                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel91)
                                    .addComponent(jtPropriedadeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpObjContratoLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel86)
                    .addContainerGap(599, Short.MAX_VALUE)))
        );
        jpObjContratoLayout.setVerticalGroup(
            jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpObjContratoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel75)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabel90)
                    .addComponent(jLabel89))
                .addGap(4, 4, 4)
                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPropriedadeCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPropriedadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPropriedadeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel74)
                    .addComponent(jLabel76))
                .addGap(9, 9, 9)
                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPropriedadeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPropriedadeRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPropriedadeNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jLabel91))
                .addGap(9, 9, 9)
                .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPropriedadeCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPropriedadeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(jpObjContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpObjContratoLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel86)
                    .addContainerGap(242, Short.MAX_VALUE)))
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpForro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpComodante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpComodatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpObjContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel77)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jpComodante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpComodatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpObjContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jpForro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
            validarDadosComodante();
            validarDadosComodatario();
            validarObjContrato();
            controller.validarForro(jtForroComarca.getText());
            WordGenerator wg = new WordGenerator();
            wg.setInputFilePath(WordContractPath.COMODATOIMOVEL);
            wg.openWord();
            
            wg.modifyWord(comodanteTextWord, comodanteInfo());
            wg.modifyWord(comodatarioTextWord,comodatarioInfo());
            wg.modifyWord(objcontrato, objetodoContrato());
            wg.modifyWord("comarca de (xxx)", jtForroComarca.getText());
            wg.modifyWord("(Local, data e ano)", DateUtilFormarter.dateToStringContract());
            wg.setOutputFilePath(FileChooser.getPath());
            wg.close();
            JOptionPane.showMessageDialog(null, "Contrato gerado com sucesso");
        }
        catch(IOException | ValidationError e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbBuscarCepContratanteEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepContratanteEmpresaActionPerformed
       try {
            Endereco endereco = BuscaCep.buscar(jtComodanteEmpresaCEP.getText().trim());
            jtComodanteEmpresaCEP.setText(endereco.getCep());
            jtComodanteEmpresaRua.setText(endereco.getLogradouro());
            jtComodanteEmpresaNumero.setText( String.valueOf((Object)endereco.getNumero()));
            jtComodanteEmpresaBairro.setText(endereco.getBairro());
            jtComodanteSedeEm.setText(endereco.getCidade());
            jtComodanteEmpresaEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jbBuscarCepContratanteEmpresaActionPerformed

    private void jbBuscarCepContratanteRepesentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepContratanteRepesentanteActionPerformed
        try {
            Endereco endereco = BuscaCep.buscar(jtContratanteComodanteCEP.getText().trim());
            jtContratanteComodanteCEP.setText(endereco.getCep());
            jtContratanteComodanteRua.setText(endereco.getLogradouro());
            jtContratanteComodanteNumero.setText( String.valueOf((Object)endereco.getNumero()));
            jtContratanteComodanteBairro.setText(endereco.getBairro());
            jtContratanteComodanteCidade.setText(endereco.getCidade());
            jtContratanteComodanteEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jbBuscarCepContratanteRepesentanteActionPerformed

    private void jbBuscarCepComodatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCepComodatarioActionPerformed
        try {
            Endereco endereco = BuscaCep.buscar(jtComodatarioCEP.getText().trim());
            jtComodatarioCEP.setText(endereco.getCep());
            jtComodatarioRua.setText(endereco.getLogradouro());
            jtComodatarioNumero.setText( String.valueOf((Object)endereco.getNumero()));
            jtComodatarioBairro.setText(endereco.getBairro());
            jtComodatarioCidade.setText(endereco.getCidade());
            jtComodatarioEstado.setText(endereco.getEstado());
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jbBuscarCepComodatarioActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed


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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCepComodatario;
    private javax.swing.JButton jbBuscarCepContratanteEmpresa;
    private javax.swing.JButton jbBuscarCepContratanteRepesentante;
    private javax.swing.JButton jbBuscarContratante;
    private javax.swing.JButton jbBuscarContratanteEmpresa;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpComodante;
    private javax.swing.JPanel jpComodanteDados;
    private javax.swing.JPanel jpComodanteDadosEmpresa;
    private javax.swing.JPanel jpComodatario;
    private javax.swing.JPanel jpComodatarioDados;
    private javax.swing.JPanel jpForro;
    private javax.swing.JPanel jpObjContrato;
    private javax.swing.JFormattedTextField jtComodanteCNPJ;
    private javax.swing.JTextField jtComodanteCadastroEstadual;
    private javax.swing.JTextField jtComodanteEmpresaBairro;
    private javax.swing.JFormattedTextField jtComodanteEmpresaCEP;
    private javax.swing.JTextField jtComodanteEmpresaEstado;
    private javax.swing.JTextField jtComodanteEmpresaNumero;
    private javax.swing.JTextField jtComodanteEmpresaRua;
    private javax.swing.JTextField jtComodanteNomeEmpresa;
    private javax.swing.JTextField jtComodanteSedeEm;
    private javax.swing.JTextField jtComodatarioBairro;
    private javax.swing.JFormattedTextField jtComodatarioCEP;
    private javax.swing.JFormattedTextField jtComodatarioCPF;
    private javax.swing.JTextField jtComodatarioCarteiraTrabalho;
    private javax.swing.JTextField jtComodatarioCidade;
    private javax.swing.JTextField jtComodatarioEstado;
    private javax.swing.JComboBox<String> jtComodatarioEstadoCivil;
    private javax.swing.JTextField jtComodatarioNacionalidade;
    private javax.swing.JTextField jtComodatarioNome;
    private javax.swing.JTextField jtComodatarioNumero;
    private javax.swing.JTextField jtComodatarioProfissao;
    private javax.swing.JFormattedTextField jtComodatarioRG;
    private javax.swing.JTextField jtComodatarioRua;
    private javax.swing.JTextField jtComodatarioSerieCarteiraTrabalho;
    private javax.swing.JTextField jtContratanteComodanteBairro;
    private javax.swing.JFormattedTextField jtContratanteComodanteCEP;
    private javax.swing.JFormattedTextField jtContratanteComodanteCPF;
    private javax.swing.JTextField jtContratanteComodanteCidade;
    private javax.swing.JTextField jtContratanteComodanteEstado;
    private javax.swing.JComboBox<String> jtContratanteComodanteEstadoCivil;
    private javax.swing.JTextField jtContratanteComodanteNacionalidade;
    private javax.swing.JTextField jtContratanteComodanteNome;
    private javax.swing.JTextField jtContratanteComodanteNumero;
    private javax.swing.JTextField jtContratanteComodanteProfissao;
    private javax.swing.JFormattedTextField jtContratanteComodanteRG;
    private javax.swing.JTextField jtContratanteComodanteRua;
    private javax.swing.JTextField jtForroComarca;
    private javax.swing.JTextField jtPropriedadeBairro;
    private javax.swing.JFormattedTextField jtPropriedadeCEP;
    private javax.swing.JTextField jtPropriedadeCartorio;
    private javax.swing.JTextField jtPropriedadeCidade;
    private javax.swing.JTextField jtPropriedadeEstado;
    private javax.swing.JTextField jtPropriedadeNumero;
    private javax.swing.JTextField jtPropriedadeRegistro;
    private javax.swing.JTextField jtPropriedadeRua;
    // End of variables declaration//GEN-END:variables
}
