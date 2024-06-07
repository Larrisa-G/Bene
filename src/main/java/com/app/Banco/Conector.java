package com.app.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conector {

    private static final String URL = "jdbc:sqlite:Base_de_clientes.db";

    public static Connection openConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

    private static void criarTabelaPessoaFisica() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS pessoaFisica ("
                + " nome VARCHAR(255),"
                + " cpf VARCHAR(20) PRIMARY KEY,"
                + " genero VARCHAR(20),"
                + " estadoCivil VARCHAR(20),"
                + " rg VARCHAR(20),"
                + " dataNascimento DATE,"
                + " nacionalidade VARCHAR(255),"
                + " profissao VARCHAR(255),"
                + " logradouro VARCHAR(255),"
                + " numero INTEGER,"
                + " complemento VARCHAR(50),"
                + " bairro VARCHAR(255),"
                + " cep VARCHAR(20),"
                + " cidade VARCHAR(255),"
                + " estado VARCHAR(255)"
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
                + "nomeFantasia VARCHAR(255),"
                + "cpfDiretor VARCHAR(20),"
                + "cnpj VARCHAR(50) PRIMARY KEY,"
                + "cadastroEstadual varchar(255), "
                + " logradouro VARCHAR(255),"
                + " numero INTEGER,"
                + " complemento VARCHAR(50),"
                + " bairro VARCHAR(255),"
                + " cep VARCHAR(20),"
                + " cidade VARCHAR(255),"
                + " estado VARCHAR(255),"
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
            criarTabelaUsuario();
        }catch (SQLException e){
            
            throw new SQLException(e.getMessage());
        }
    }
    
    private static void criarTabelaUsuario() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS usuario ("
                + " nome VARCHAR(255),"
                + " senha VARCHAR(255),"
                + " email VARCHAR(255)"
                + ");";
        try(PreparedStatement statement = openConnection().prepareStatement(sql)) {
            statement.execute();
            statement.close();
        }catch (SQLException e){
            
            throw new SQLException("Erro ao criar tabela Usuario");
        }
    }
}