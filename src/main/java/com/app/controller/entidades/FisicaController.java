
package com.app.controller.entidades;

import com.app.Banco.FisicaDAO;
import com.app.entidades.pessoas.Fisica;
import com.app.exceptions.ServiceException;
import com.app.exceptions.ValidationError;
import com.app.util.Validador;
import java.sql.SQLException;
import java.util.List;


public class FisicaController implements ControllersInterface<Fisica>{
    FisicaDAO dao = new FisicaDAO();
    
    @Override
    public void criar(Fisica fisica) throws ServiceException{
        
        try {
            Validador.validarEndereco(fisica.getEndereco());
            Validador.validarPessoaFisica(fisica);
            if(buscarUm(fisica.getCpf()) != null) {           
               throw new ValidationError("Cliente já cadastrado");
            }    
            
            dao.inserir(fisica);
        } catch (SQLException e){
            throw new ServiceException(e.getMessage());
        } catch (ValidationError e){
            throw new ServiceException("Erro de validação: "+e.getMessage());
        }
    }

    @Override
    public void deletar(String value)throws ServiceException {
        try {
            dao.deletar(value);
            
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public void alterar(Fisica fisica) throws ServiceException{
        try {
            if(Validador.isEmpty(fisica.getNome()) || Validador.isEmpty(fisica.getProfissao())) {
                throw new ValidationError("Alguns dados pessoais estão vazios");
            }
            Validador.validarEndereco(fisica.getEndereco());
            dao.alterar(fisica);
        } catch(SQLException e) {
            throw new ServiceException(e.getMessage());
        }  catch (ValidationError e){
            throw new ServiceException("Erro de validação: "+e.getMessage());
        }
    } 

    @Override
    public List<Fisica> buscarTodos() throws ServiceException  {
        try{
            List<Fisica> list = dao.obterTodos();
            return list;
        } catch (SQLException e ){
            throw new ServiceException("Erro ao pegar clientes do banco");
        }
    }

    @Override
    public Fisica buscarUm(String value) throws ServiceException{
        
        try{ 
           Fisica fisica = dao.obterPorChave(value);
           if (fisica == null) {
               return null;
           } 
           
           return fisica;
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }
    
    
}
