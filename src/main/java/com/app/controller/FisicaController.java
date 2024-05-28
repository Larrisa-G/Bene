
package com.app.controller;

import com.app.Banco.FisicaDAO;
import com.app.entidades.pessoas.Fisica;
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
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
