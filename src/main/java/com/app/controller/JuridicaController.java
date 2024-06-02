
package com.app.controller;

import com.app.Banco.JuridicaDAO;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ServiceException;
import com.app.exceptions.ValidationError;
import com.app.util.Validador;
import java.sql.SQLException;
import java.util.List;


public class JuridicaController implements ControllersInterface<Juridica>{
    
    JuridicaDAO dao = new JuridicaDAO();
    
    @Override
    public void criar(Juridica juridica) throws ServiceException {
        try {
            if(buscarUm(juridica.getCnpj()) != null) {           
               throw new ServiceException("Empresa já cadastrada");
            } 
            Validador.validarPessoaJuridica(juridica);
            Validador.validarEndereco(juridica.getEndereco());
            
                    
            dao.inserir(juridica);
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
    public void alterar(Juridica juridica) throws ServiceException {
        try {
            if (Validador.isEmpty(juridica.getCpfDiretor())) {
                throw new ValidationError("CPF não pode estar vazio");
            }
            if(new FisicaController().buscarUm(juridica.getCpfDiretor()) == null) {           
                throw new ValidationError("CPF não cadastrado");
            }
            
            
            Validador.validarEndereco(juridica.getEndereco());
            dao.alterar(juridica);
        } catch (ValidationError e) {
            throw new ServiceException("Erro de validação: " + e.getMessage());
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public List<Juridica> buscarTodos() throws ServiceException {
         try{
            List<Juridica> list = dao.obterTodos();
            return list;
        } catch (SQLException e ){
            throw new ServiceException("Erro ao pegar clientes do banco");
        }
    }

    @Override
    public Juridica buscarUm(String value) throws ServiceException {
         try{ 
           Juridica juridica = dao.obterPorChave(value);
           if (juridica == null) {
               return null;
           } 
           
           return juridica;
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }
    
}
