package org.example;
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

    public static void criarTabelaPessoaFisica() {
        String sql = "CREATE TABLE IF NOT EXISTS pessoaFisica ("
                + " nome VARCHAR(100),"
                + " cpf VARCHAR(20) PRIMARY KEY,"
                + " genero VARCHAR(20),"
                + " estadoCivil VARCHAR(20),"
                + " rg VARCHAR(20),"
                + " dataNascimento DATE,"
                + " nacionalidade VARCHAR(20),"
                + " profissao VARCHAR(20),"
                + " logradouro VARCHAR(20),"
                + " numero INTEGER,"
                + " complemento VARCHAR(20),"
                + " bairro VARCHAR(20),"
                + " cep VARCHAR(20),"
                + " cidade VARCHAR(20),"
                + " uf VARCHAR(20),"
                + " estado VARCHAR(20)"
                + ");";
        try(PreparedStatement statement = openConnection().prepareStatement(sql)) {
            statement.execute();
            statement.close();
        }catch (SQLException e){
            System.err.println("Erro ao criar tabela pessoaFísica: " + e.getMessage() );
            throw new RuntimeException("Erro ao criar tabela pessoaFísica,", e);
        }
    }

    private static void criarTabelaPessoaJuridica(){
        String sql = "CREATE TABLE IF NOT EXISTS empresas ("
                + "nomeFantasia VARCHAR(50),"
                + "cpfDiretor VARCHAR(50),"
                + "cnpj VARCHAR(50) PRIMARY KEY,"
                + "cadastroEstadual INTEGER, "
                + " logradouro VARCHAR(20),"
                + " numero INTEGER,"
                + " complemento VARCHAR(20),"
                + " bairro VARCHAR(20),"
                + " cep VARCHAR(20),"
                + " cidade VARCHAR(20),"
                + " uf VARCHAR(20),"
                + " estado VARCHAR(20),"
                + "FOREIGN KEY (cpfDiretor) REFERENCES pessoas(cpf)"
                +")";
        try(PreparedStatement statement = openConnection().prepareStatement(sql)) {
            statement.execute();
            statement.close();
            openConnection().close();
        }catch (SQLException e){
            System.err.println("Erro ao criar tabela pessoas: " + e.getMessage() );
            throw new RuntimeException("Erro ao criar tabela pessoas,", e);
        }
    }

    public static void criarTabelas() {
        try {
            criarTabelaPessoaFisica();
            criarTabelaPessoaJuridica();
        }catch (Exception e){
            System.err.println("Erro na função criar tabelas: " + e.getMessage());
            throw new RuntimeException("Erro na função criar tabelas: ", e);
        }
    }
}