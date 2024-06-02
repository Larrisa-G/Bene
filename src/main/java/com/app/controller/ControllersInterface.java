
package com.app.controller;

import com.app.entidades.endereco.Endereco;
import java.util.List;


public interface ControllersInterface<T> {
    void  criar(T entidade) throws Exception;
    void deletar();
    void alterar(T entidate, Endereco endereco)throws Exception;
    List<T> buscarTodos() throws Exception;
    T buscarUm(String value) throws Exception;
}
