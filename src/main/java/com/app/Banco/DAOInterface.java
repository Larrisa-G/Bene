
package com.app.Banco;

import java.sql.SQLException;
import java.util.List;


public interface DAOInterface<T> {
    void inserir(T entidade)throws SQLException;
    T obterPorChave(String chave)throws SQLException;
    List<T> obterTodos()throws SQLException;
    void deletar(String chave)throws SQLException;
    void alterar(T entidade)throws SQLException;
}
