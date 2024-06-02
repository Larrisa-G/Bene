
package com.app.controller;

import com.app.exceptions.ServiceException;
import java.util.List;


public interface ControllersInterface<T> {
    void  criar(T entidade) throws ServiceException;
    void deletar(String value) throws ServiceException;
    void alterar(T entidade)throws ServiceException;
    List<T> buscarTodos() throws ServiceException;
    T buscarUm(String value) throws ServiceException;
}
