
package com.app.controller;

import com.app.Banco.FisicaDAO;
import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.Fisica;
import com.app.util.Validador;
import java.sql.SQLException;
import java.util.List;


public class FisicaController implements ControllersInterface<Fisica>{
    FisicaDAO dao = new FisicaDAO();
    @Override
    public void criar(Fisica fisica) throws Exception{
        try {
            dao.inserirPessoaFisica(fisica);
        } catch (SQLException e){
            throw new SQLException(e.getMessage());
        }
    }

    @Override
    public void deletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(Fisica fisica, Endereco endereco) throws Exception{
        try {
            if(Validador.isEmpty(fisica.getNome()) || Validador.isEmpty(fisica.getProfissao())) {
                throw new IllegalArgumentException("Alguns dados pessoais estão vazios");
            }
            Validador.validarEndereco(endereco);
            dao.alterarPessoaFisica(fisica,endereco);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    } 

    @Override
    public List<Fisica> buscarTodos() throws Exception  {
        
            List<Fisica> list = dao.obterTodasPessoasFisicas();
            return list;
       
    }

    @Override
    public Fisica buscarUm(String value) throws Exception{
        
        try{ 
            return dao.obterPessoaFisicaPorCPF(value);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    
    
}
