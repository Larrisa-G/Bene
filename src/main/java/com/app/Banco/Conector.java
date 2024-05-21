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
                + " rg VARCHAR(20),"
                + " dataNascimento VARCHAR(20),"
                + " nacionalidade VARCHAR(20),"
                + " profissao VARCHAR(20)"
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
                + "cnpj VARCHAR(50) PRIMARY KEY,"
                + "cpfDiretor VARCHAR(50),"
                + "cadastroEstadual INTEGER, "
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