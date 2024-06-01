package com.app.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conector {

    private static String url = "jdbc:sqlite:Base_de_clientes.db";

    public static Connection openConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public static void criarTabelaPessoaFisica() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS pessoaFisica ("
                + " nome VARCHAR(100),"
                + " cpf VARCHAR(20) PRIMARY KEY,"
                + " genero VARCHAR(20),"
                + " estadoCivil VARCHAR(20),"
                + " rg VARCHAR(20),"
                + " dataNascimento DATE,"
                + " nacionalidade VARCHAR(50),"
                + " profissao VARCHAR(50),"
                + " logradouro VARCHAR(100),"
                + " numero INTEGER,"
                + " complemento VARCHAR(20),"
                + " bairro VARCHAR(100),"
                + " cep VARCHAR(20),"
                + " cidade VARCHAR(100),"
                + " estado VARCHAR(50)"
                + ");";
        try(PreparedStatement statement = openConnection().prepareStatement(sql)) {
            statement.execute();
            statement.close();
        }catch (SQLException e){
            
            throw new SQLException("Erro ao criar tabela pessoaFísica");
        }
    }

    private static void criarTabelaPessoaJuridica() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS empresas ("
                + "nomeFantasia VARCHAR(50),"
                + "cpfDiretor VARCHAR(20),"
                + "cnpj VARCHAR(50) PRIMARY KEY,"
                + "cadastroEstadual varchar(50), "
                + " logradouro VARCHAR(20),"
                + " numero INTEGER,"
                + " complemento VARCHAR(20),"
                + " bairro VARCHAR(20),"
                + " cep VARCHAR(20),"
                + " cidade VARCHAR(20),"
                + " estado VARCHAR(20),"
                + "FOREIGN KEY (cpfDiretor) REFERENCES pessoaFisica(cpf)"
                +")";
        try(PreparedStatement statement = openConnection().prepareStatement(sql)) {
            statement.execute();
            statement.close();
            openConnection().close();
        }catch (SQLException e){
            
            throw new SQLException("Erro ao criar tabela empresas");
        }
    }

    public static void criarTabelas()throws SQLException {
        try {
            criarTabelaPessoaFisica();
            criarTabelaPessoaJuridica();
        }catch (SQLException e){
            
            throw new SQLException("Erro na função criar tabelas: ", e);
        }
    }
}