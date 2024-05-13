/*package com.app.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conector {
    private static String url = "jdbc:sqlite:dbTeste.db";

    public static Connection openConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }
    public static void criarTabelas() {
        criarTabelaPessoaFisica();
    }
    private static void criarTabelaPessoaFisica() {

        String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
                + "id INTEGER PRIMARY KEY,"
                + "nome VARCHAR(50),"
                + "cpf VARCHAR(20),"
                + "rg VARCHAR(20),"
                + "dataNascimento VARCHAR(20),"
                + "nacionalidade VARCHAR(20),"
                + "profissao VARCHAR(20)"
                + ")";
        try(PreparedStatement statement = openConnection().prepareStatement(sql)) {
            statement.execute();
            statement.close();
            openConnection().close();
        }catch (SQLException e){
            System.err.println("Erro ao criar tabela pessoas: " + e.getMessage() );
            throw new RuntimeException("Erro ao criar tabela pessoas,", e);
        }
    }
    private static void criarTabelaPessoaJuridica(){

    }
}
 */