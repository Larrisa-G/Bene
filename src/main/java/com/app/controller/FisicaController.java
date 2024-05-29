
package com.app.controller;

import com.app.Banco.FisicaDAO;
import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.Fisica;
import com.app.exceptions.ServiceException;
import com.app.util.Validador;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;


public class FisicaController implements ControllersInterface<Fisica>{
    FisicaDAO dao = new FisicaDAO();
    
    @Override
    public void criar(Fisica fisica) throws ServiceException{
        try {
            dao.inserirPessoaFisica(fisica);
        } catch (SQLException | ParseException e){
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public void deletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(Fisica fisica, Endereco endereco) throws ServiceException{
        try {
            if(Validador.isEmpty(fisica.getNome()) || Validador.isEmpty(fisica.getProfissao())) {
                throw new IllegalArgumentException("Alguns dados pessoais estão vazios");
            }
            Validador.validarEndereco(endereco);
            dao.alterarPessoaFisica(fisica,endereco);
        } catch(SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    } 

    @Override
    public List<Fisica> buscarTodos() throws ServiceException  {
        try{
            List<Fisica> list = dao.obterTodasPessoasFisicas();
            return list;
        } catch (SQLException e ){
            throw new ServiceException("Erro ao pegar clientes do banco");
        }
    }

    @Override
    public Fisica buscarUm(String value) throws ServiceException{
        
        try{ 
            return dao.obterPessoaFisicaPorCPF(value);
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }
    
    
}
