
package com.app.util;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Tabela {
     public JTable criarTabela(JPanel jpn, Object[] pos, Object[] col,JTextField textField) throws NullPointerException {
        
        JTable tabela = new JTable(new DefaultTableModel());
        tabela.setVisible(true);
        
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();    

    
        tabela.setFont(new Font("Arial", Font.BOLD, 16));
        JScrollPane jsp = new JScrollPane(tabela);
        tabela.setRowHeight(30);
        jsp.setBounds(0, 0, 675, 200);
       
        jsp.setVisible(true);
        jpn.add(jsp);
      

        // Ordenando ao clicar no titulo da coluna da tabela
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modeloTabela);
        tabela.setRowSorter(sorter);             
       
        //Adicionando coluna
        for (int i = 0; i < col.length; i++) {
            modeloTabela.addColumn(col[i]);
        }

        //Criando objeto para alinhamento dos dados dentro da tabela
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();

        //Adicionando as posiçoes
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);

        //Trabalhando com as colunas 
        for (int i = 0; i < col.length; i++) {
            if (pos[i].equals("centro")) {
                pos[i] = centro;
            }
            if (pos[i].equals("direita")) {
                pos[i] = direita;
            }
            if (pos[i].equals("esquerda")) {
                pos[i] = esquerda;
            }

            tabela.getColumnModel().getColumn(i).setPreferredWidth(700/col.length);

            tabela.getColumnModel().getColumn(i).setCellRenderer(
                    (TableCellRenderer) pos[i]);

        }
        
         tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tabela.rowAtPoint(e.getPoint());
                int col = 0; // Altere para o índice da coluna que deseja capturar
                if (row >= 0) {
                    Object valorSelecionado = tabela.getValueAt(row, col);
                    textField.setText(valorSelecionado.toString());
                }
            }
        });
        return tabela;
    }
}
