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
        String sql = "INSERT INTO pessoaFisica (nome, cpf,genero, estadoCivil rg, dataNascimento, nacionalidade, profissao, logradouro, número, complemento, bairro, cep, cidade, uf, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, fisica.getNome());
            statement.setString(2, fisica.getCpf());
            statement.setString(3, fisica.getGenero());
            statement.setString(4, fisica.getEstadoCivil());
            statement.setString(5, fisica.getRg());
            statement.setString(6, fisica.getDataNascimento());
            statement.setString(7, fisica.getNacionalidade());
            statement.setString(8, fisica.getProfissao());
            statement.setString(9, fisica.getLogradouro());
            statement.setString(10, fisica.getNumero());
            statement.setString(11, fisica.getComplemento());
            statement.setString(12, fisica.getBairro());
            statement.setString(13, fisica.getCep());
            statement.setString(14, fisica.getCidade());
            statement.setString(15, fisica.getUf());
            statement.setString(16, fisica.getEstado());
            statement.execute();
        } catch (SQLException e){
            System.err.println("Erro ao inserir pessoa física no banco de dados:" + e.getMessage());
            throw new RuntimeException("Erro ao inserir pessoa física no banco de dados, " + e);
        }
    }

    public Fisica obterPessoaFisicaPorCPF(String cpf) {
        String sql = "SELECT nome, cpf, rg, dataNascimento, nacionalidade, profissao, logradouro, numero, complemento, bairro, cep, cidade, uf, estado  FROM pessoaFisica WHERE cpf = ?";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)) {
            statement.setString(2,cpf);
            try (ResultSet result = statement.executeQuery()) {
                if (!result.next()) {
                    return null;
                }
                return new Fisica(
                        result.getString("nome"),
                        result.getString("cpf"),
                        result.getString("genero"),
                        result.getString("estadoCivil")
                        result.getString("rg"),
                        result.getString("dataNascimento"),
                        result.getString("nacionalidade"),
                        result.getString("profissao"),
                        result.getString("logradouro"),
                        result.getInt("numero"),
                        result.getString("complemento"),
                        result.getString("bairro"),
                        esult.getString("cep"),
                        esult.getString("cidade"),
                        esult.getString("uf"),
                        esult.getString("estado"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao obter pessoa física pelo CPF: " + e.getMessage());
            throw new RuntimeException("Erro ao obter pessoa física pelo CPF: ", e);
        }
    }

    public List<Fisica> obterTodasPessoasFisicas(){
        List<Fisica> pessoas = new ArrayList<>();
        String sql = "SELECT nome, cpf, genero, estadoCivil, rg, dataNascimento, nacionalidade, profissao, logradouro, numero, complemento, bairro, cep, cidade, uf, estado  FROM pessoaFisica";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            try (ResultSet result = statement.executeQuery()){
                while(result.next()){
                    pessoas.add(new Fisica(
                            result.getString("nome"),
                            result.getString("cpf"),
                            result.getString("genero"),
                            result.getString("estadoCivil")
                            result.getString("rg"),
                            result.getString("dataNascimento"),
                            result.getString("nacionalidade"),
                            result.getString("profissao"),
                            result.getString("logradouro"),
                            result.getInt("numero"),
                            result.getString("complemento"),
                            result.getString("bairro"),
                            result.getString("cep"),
                            result.getString("cidade"),
                            result.getString("uf"),
                            result.getString("estado")));
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

    public void alterarPessoaFisica(String nome, String cpf, String genero, String estadoCivil, String rg, String dataNascimento, String nacionalidade, String profissao, String logradouro, Int numero, String complemento, String bairro, String cep, String cidade, String uf, String estado){
        StringBuilder sqlBuilder = new StringBuilder("UPDATE pessoaFisica SET ");
        List<Object> parametros = new ArrayList<>();
        if(nome !=null){
            sqlBuilder.append("nome = ?,");
            parametros.add(nome);
        }
        if(nome !=null){
            sqlBuilder.append("genero = ?,");
            parametros.add(nome);
        }
        if(nome !=null){
            sqlBuilder.append("estadoCivil = ?,");
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
        if( !=null){
            sqlBuilder.append("logradouro = ?,");
            parametros.add(rg);
        }
        if( !=null){
            sqlBuilder.append("numero = ?,");
            parametros.add(rg);
        }
        if( !=null){
            sqlBuilder.append("complemento = ?,");
            parametros.add(rg);
        }
        if( !=null){
            sqlBuilder.append("bairro = ?,");
            parametros.add(rg);
        }
        if( !=null){
            sqlBuilder.append("cep = ?,");
            parametros.add(rg);
        }
        if( !=null){
            sqlBuilder.append("cidade = ?,");
            parametros.add(rg);
        }
        if( !=null){
            sqlBuilder.append("uf = ?,");
            parametros.add(rg);
        }
        if( !=null){
            sqlBuilder.append("estado = ?,");
            parametros.add(rg);
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