
package com.app.controller;

import java.util.List;


public interface ControllersInterface<T> {
    void  criar(T entidade) throws Exception;
    void deletar();
    void alterar();
    List<T> buscarTodos() throws Exception;
    T buscarUm(String value) throws Exception;
}
