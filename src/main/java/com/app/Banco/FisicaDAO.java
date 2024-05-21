package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class FisicaDAO  {
    public FisicaDAO (String nameDatabase){
        try {
            Connection conexao = Conector.openConnection();
            conexao.close();
        }catch(SQLException e){
            System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            throw new RuntimeException("Erro ao conectar com o banco de dados: ", e);
        }
    }

    public void inserirPessoaFisica(Fisica fisica){
        String sql = "INSERT INTO pessoaFisica (nome, cpf, rg, dataNascimento, nacionalidade, profissao) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, fisica.getNome());
            statement.setString(2, fisica.getCpf());
            statement.setString(3, fisica.getRg());
            statement.setString(4, fisica.getDataNascimento());
            statement.setString(5, fisica.getNacionalidade());
            statement.setString(6, fisica.getProfissao());
            statement.execute();
        } catch (SQLException e){
            System.err.println("Erro ao inserir pessoa no banco de dados:" + e.getMessage());
            throw new RuntimeException("Erro ao inserir pessoa no banco de dados, " + e);
        }
    }

    public Fisica obterPessoaFisicaPorCPF(String cpf) {
        String sql = "SELECT nome, cpf, rg, dataNascimento, nacionalidade, profissao FROM pessoaFisica WHERE id = ?";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)) {
            statement.setString(2,cpf);
            try (ResultSet result = statement.executeQuery()) {
                if (!result.next()) {
                    return null;
                }
                return new Fisica(
                        result.getString("nome"),
                        result.getString("cpf"),
                        result.getString("rg"),
                        result.getString("dataNascimento"),
                        result.getString("nacionalidade"),
                        result.getString("profissao"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao obter pessoa física pelo CPF: " + e.getMessage());
            throw new RuntimeException("Erro ao obter pessoa física pelo CPF: ", e);
        }
    }

    public List<Fisica> obterTodasPessoasFisicas(){
        List<Fisica> pessoas = new ArrayList<>();
        String sql = "SELECT nome, cpf, rg, dataNascimento, nacionalidade, profissao FROM pessoaFisica";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            try (ResultSet result = statement.executeQuery()){
                while(result.next()){
                    pessoas.add(new Fisica(
                            result.getString("nome"),
                            result.getString("cpf"),
                            result.getString("rg"),
                            result.getString("dataNascimento"),
                            result.getString("nacionalidade"),
                            result.getString("profissao")));
                }
            }
        }catch (SQLException e){
            System.err.println("Rerro ao obter todas as pessoas físicas: " + e.getMessage());
            throw new RuntimeException("Eroo ao obter todas as pessoas físicas", e);
        }
        return pessoas;
    }

    public void deletarPessoaFisica(String cpf){
        String sql = "DELETE FROM pessoaFisica WHERE cpf = ?";
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(2, cpf);
            statement.executeUpdate();
        }catch(SQLException e){
            System.err.println("Erro ao deletar pessoa física: " + e.getMessage());
            throw new RuntimeException("Erro ao deletar pessoa física: ", e);
        }
    }

    public void alterarPessoaFisica(String nome, String cpf, String rg, String dataNascimento, String nacionalidade, String profissao){
        StringBuilder sqlBuilder = new StringBuilder("UPDATE pessoaFisica SET ");
        List<Object> parametros = new ArrayList<>();
        if(nome !=null){
            sqlBuilder.append("nome = ?,");
            parametros.add(nome);
        }
        if(rg !=null){
            sqlBuilder.append("rg = ?,");
            parametros.add(rg);
        }
        if(dataNascimento !=null){
            sqlBuilder.append("dataNascimento = ?,");
            parametros.add(dataNascimento);
        }
        if(nacionalidade !=null){
            sqlBuilder.append("nacionalidade = ?,");
            parametros.add(nacionalidade);
        }
        if(profissao !=null){
            sqlBuilder.append("profissao = ? ");
            parametros.add(profissao);
        }
        sqlBuilder.append("WHERE cpf = ?");
        parametros.add(cpf);
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sqlBuilder.toString())){
            for (int i = 0; i < parametros.size(); i++){
                statement.setObject(i + 1, parametros.get(i));
            }
            statement.executeUpdate();
        }catch(SQLException e){
            System.err.println("Erro ao alterar pessoa física: " + e.getMessage());
            throw new RuntimeException("Erro ao alterar pessoa física: ", e);
        }
    }
}