
package com.app.paginas.pessoa;

import com.app.controller.entidades.FisicaController;
import com.app.controller.entidades.JuridicaController;
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
        jpDadosPessoais.setVisible(false);
        jpDadosEmpresa.setVisible(false);
    }
    
    private void criarTabela(){
        table = utilTabela.criarTabela(jpnConsulta, 
               
                new Object[] {"centro","esquerda"}, 
                new Object[] {"CPF","Nome"},
                jtSearch
        ); 
        
        model = (DefaultTableModel) table.getModel(); 
        preencherTabelaFisica();
       
    }
    
    private void preencherTabelaFisica() {
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
    
    private void preencherTabelaJuridica() {
        try {
            JuridicaController jc = new JuridicaController();
            List<Juridica> list = jc.buscarTodos();
            
            
            for (Juridica j : list) {
                FisicaController fc = new FisicaController();
                
                model.addRow(new Object[] {j.getCnpj(),j.getNomeFantasia(),j.getCpfDiretor(),fc.buscarUm(j.getCpfDiretor()).getNome()});
            }
        } catch (ServiceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void preencherDadosFisica(String cpf) {
        FisicaController fc = new FisicaController();
            try {
                Fisica f = fc.buscarUm(cpf);
                if (f == null) {
                    throw new ServiceException("CPF inválido");
                }
                jlRg.setText(f.getRg());
                jlNome.setText(f.getNome());
                jlCPF.setText(f.getCpf());
                jlGenero.setText(f.getGenero().name());
                jlEstadoCivil.setText(f.getEstadoCivil().name());
                jlNacionalidade.setText(f.getNacionalidade());
                jlProfissao.setText(f.getProfissao());
                jlDataNascimento.setText(f.getDataNascimento());
                jlRua.setText(f.getEndereco().getLogradouro());
                jlNumero.setText(String.valueOf(f.getEndereco().getNumero()));
                jlComplemento.setText(f.getEndereco().getComplemento());
                jlCep.setText(f.getEndereco().getCep());
                jlCidade.setText(f.getEndereco().getCidade());
                jlBairro.setText(f.getEndereco().getBairro());
                jlEstado.setText(f.getEndereco().getEstado());

                
                jpDadosPessoais.setVisible(true);
            } catch (ServiceException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
    
    private void preencherDadosJuridica(String cnpj) {
        JuridicaController jc = new JuridicaController();
            try{
                Juridica j = jc.buscarUm(cnpj);
                if (j == null) {
                    throw new ServiceException("CNPJ inválido");
                }
                preencherDadosFisica(j.getCpfDiretor());
                jlCadastroEstadual.setText(j.getCadastroEstadual());
                jlCNPJ.setText(j.getCnpj());
                jlEmpresaRua.setText(j.getEndereco().getLogradouro());
                jlEmpresaNumero.setText(j.getEndereco().getLogradouro());
                jlEmpresaComplemento.setText(j.getEndereco().getComplemento());
                jlEmpresaCep.setText(j.getEndereco().getCep());
                jlEmpresaCidade.setText(j.getEndereco().getCidade());
                jlEmpresaBairro.setText(j.getEndereco().getBairro());
                jlEmpresaEstado.setText(j.getEndereco().getEstado());
                jpDadosEmpresa.setVisible(true);
                
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
        jtSearch = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        jrbFisica = new javax.swing.JRadioButton("Física");
        jrbJuridica = new javax.swing.JRadioButton("Jurídica");
        jpnConsulta = new javax.swing.JPanel();
        jpDadosPessoais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlRg = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlEstadoCivil = new javax.swing.JLabel();
        jlProfissao = new javax.swing.JLabel();
        jlDataNascimento = new javax.swing.JLabel();
        jlNacionalidade = new javax.swing.JLabel();
        jbDeletarFisica = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jlRua = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlComplemento = new javax.swing.JLabel();
        jlCep = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jpDadosEmpresa = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jlCadastroEstadual = new javax.swing.JLabel();
        jbDeletarJuridica = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jlEmpresaRua = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jlEmpresaNumero = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlEmpresaComplemento = new javax.swing.JLabel();
        jlEmpresaCep = new javax.swing.JLabel();
        jlEmpresaCidade = new javax.swing.JLabel();
        jlEmpresaBairro = new javax.swing.JLabel();
        jlEmpresaEstado = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jlCNPJ = new javax.swing.JLabel();

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
                .addComponent(jtSearch)
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
                    .addComponent(jtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel)
                    .addComponent(jrbFisica)
                    .addComponent(jrbJuridica))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpnConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        jpDadosPessoais.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setText("Genero");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setText("RG");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setText("Estado Civil");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setText("Nacionalidade");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setText("Profissão");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel6.setText("Data de Nascimento");

        jbDeletarFisica.setText("Deletar Cliente");
        jbDeletarFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarFisicaActionPerformed(evt);
            }
        });

        jLabel7.setText("Rua");

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel9.setText("Número");

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel10.setText("Complemento");

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel12.setText("Bairro");

        jLabel13.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel13.setText("Cep");

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel14.setText("Cidade");

        jLabel15.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel15.setText("Estado");

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel8.setText("CFF");

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel11.setText("Nome");

        javax.swing.GroupLayout jpDadosPessoaisLayout = new javax.swing.GroupLayout(jpDadosPessoais);
        jpDadosPessoais.setLayout(jpDadosPessoaisLayout);
        jpDadosPessoaisLayout.setHorizontalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbDeletarFisica)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jlNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlRua, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlRg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)))
                                    .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jlCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4)
                                        .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel6)
                                                .addComponent(jlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jlEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(52, 52, 52)
                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jlComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                        .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCep, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel12)
                    .addComponent(jlBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpDadosPessoaisLayout.setVerticalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlRg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlComplemento))
                            .addComponent(jlNumero)))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jlCPF)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbDeletarFisica)
                            .addComponent(jlRua))
                        .addGap(10, 10, 10))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCep)
                            .addComponent(jlCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEstado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jpDadosEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel18.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel18.setText("Cadastro Estadual");

        jbDeletarJuridica.setText("Deletar Empresa");
        jbDeletarJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarJuridicaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel20.setText("Rua");

        jLabel21.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel21.setText("Número");

        jLabel22.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel22.setText("Complemento");

        jLabel23.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel23.setText("Bairro");

        jLabel24.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel24.setText("Cep");

        jLabel25.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel25.setText("Cidade");

        jLabel26.setFont(new java.awt.Font("Courier New", 1, 14));
        jLabel26.setText("Estado");

        jLabel19.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel19.setText("CNPJ");

        javax.swing.GroupLayout jpDadosEmpresaLayout = new javax.swing.GroupLayout(jpDadosEmpresa);
        jpDadosEmpresa.setLayout(jpDadosEmpresaLayout);
        jpDadosEmpresaLayout.setHorizontalGroup(
            jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosEmpresaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jlEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jlCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlEmpresaNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbDeletarJuridica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel19)
                    .addComponent(jlCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jlEmpresaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEmpresaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel22))
                    .addComponent(jLabel23)
                    .addComponent(jLabel26)
                    .addComponent(jlEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlEmpresaCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(jlEmpresaBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDadosEmpresaLayout.setVerticalGroup(
            jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel18)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEmpresaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmpresaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(3, 3, 3)
                        .addComponent(jlCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCadastroEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jlEmpresaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEmpresaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmpresaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEmpresaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addComponent(jbDeletarJuridica)
                        .addGap(19, 19, 19))
                    .addGroup(jpDadosEmpresaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jlEmpresaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpDadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jrbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFisicaActionPerformed
        searchLabel.setText("CPF");
        jtSearch.setText("");
        jpDadosPessoais.setVisible(false);
        jpDadosEmpresa.setVisible(false);
        model.setNumRows(0);
        model.setColumnIdentifiers(new Object[] {"CPF", "Nome"});
        preencherTabelaFisica();
    }//GEN-LAST:event_jrbFisicaActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        
        if (searchLabel.getText() == "CPF") {
            preencherDadosFisica(jtSearch.getText());
        } else {
            preencherDadosJuridica(jtSearch.getText());
        }
    }//GEN-LAST:event_jbListarActionPerformed

    private void jrbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbJuridicaActionPerformed
        searchLabel.setText("CNPJ");
        jtSearch.setText("");
        jpDadosPessoais.setVisible(false);
        jpDadosEmpresa.setVisible(false);
        model.setNumRows(0);
        model.setColumnIdentifiers(new Object[] {"CNPJ", "Empresa","CPF Diretor","Diretor"});
        preencherTabelaJuridica();
        
    }//GEN-LAST:event_jrbJuridicaActionPerformed

    private void jbDeletarFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarFisicaActionPerformed
        int res = JOptionPane.showConfirmDialog(null, String.format("Deseja mesmo excluir este %s? Essa ação é permanente", jlNome.getText()));
        if(res == 0) {
            try{
                FisicaController fc = new FisicaController();
                fc.deletar(jlCPF.getText());
                model.setNumRows(0);
                jpDadosPessoais.setVisible(false);
                preencherTabelaFisica();
            } catch (ServiceException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jbDeletarFisicaActionPerformed

    private void jbDeletarJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarJuridicaActionPerformed
       int res = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir esta empresa? Essa ação é permanente");
        if(res == 0) {
            try{
                JuridicaController jc = new JuridicaController();
                jc.deletar(jlCNPJ.getText());
                 model.setNumRows(0);
                jpDadosPessoais.setVisible(false);
                jpDadosEmpresa.setVisible(false);
                preencherTabelaJuridica();
            } catch (ServiceException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jbDeletarJuridicaActionPerformed
    
    // achar um jeito de listar todos os 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbDeletarFisica;
    private javax.swing.JButton jbDeletarJuridica;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbListar;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCNPJ;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCadastroEstadual;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlEmpresaBairro;
    private javax.swing.JLabel jlEmpresaCep;
    private javax.swing.JLabel jlEmpresaCidade;
    private javax.swing.JLabel jlEmpresaComplemento;
    private javax.swing.JLabel jlEmpresaEstado;
    private javax.swing.JLabel jlEmpresaNumero;
    private javax.swing.JLabel jlEmpresaRua;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlEstadoCivil;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlNacionalidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlProfissao;
    private javax.swing.JLabel jlRg;
    private javax.swing.JLabel jlRua;
    private javax.swing.JPanel jpDadosEmpresa;
    private javax.swing.JPanel jpDadosPessoais;
    private javax.swing.JPanel jpnConsulta;
    private javax.swing.JRadioButton jrbFisica;
    private javax.swing.JRadioButton jrbJuridica;
    private javax.swing.JTextField jtSearch;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
