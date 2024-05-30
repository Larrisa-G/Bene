
package com.app.controller;

import com.app.Banco.JuridicaDAO;
import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ServiceException;
import com.app.exceptions.ValidationError;
import com.app.util.Validador;
import java.sql.SQLException;
import java.util.List;


public class JuridicaController implements ControllersInterface<Juridica>{
    
    JuridicaDAO dao = new JuridicaDAO();
    @Override
    public void criar(Juridica empresa) throws ServiceException {
        try {
            //if(buscarUm(fisica.getCpf()).getCpf().equals(fisica.getCpf())) {           
            //   throw new ServiceException("Cliente já cadastrado");
            //}    
            Validador.validarEndereco(empresa.getEndereco());
            Validador.validarPessoaJuridica(empresa);
                    
            dao.inserirEmpresa(empresa);
        } catch (SQLException e){
            throw new ServiceException(e.getMessage());
        } catch (ValidationError e){
            throw new ServiceException("Erro de validação: "+e.getMessage());
        }
    }

    @Override
    public void deletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(Juridica entidade, Endereco endereco) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Juridica> buscarTodos() throws ServiceException {
         try{
            List<Juridica> list = dao.obterTodasEmpresas();
            return list;
        } catch (SQLException e ){
            throw new ServiceException("Erro ao pegar clientes do banco");
        }
    }

    @Override
    public Juridica buscarUm(String value) throws ServiceException {
         try{ 
           Juridica juridica = dao.obterEmpresaPorCnpj(value);
           if (juridica == null) {
               return null;
           } 
           
           return juridica;
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }
    
}
