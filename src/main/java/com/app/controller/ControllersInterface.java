
package com.app.controller;

import com.app.entidades.endereco.Endereco;
import com.app.exceptions.ServiceException;
import java.util.List;


public interface ControllersInterface<T> {
    void  criar(T entidade) throws ServiceException;
    void deletar();
    void alterar(T entidade, Endereco endereco)throws ServiceException;
    List<T> buscarTodos() throws ServiceException;
    T buscarUm(String value) throws ServiceException;
}
