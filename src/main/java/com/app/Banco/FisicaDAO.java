/*package com.app.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class PessoaDAO  {
public PessoaDAO (String nameDatabase, String user, String password){ //Cria e conecta o banco de dados
    try {
        Connection conn = Conector.openConnection();
        conn.close();
    }catch(SQLException e){
        System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        throw new RuntimeException("Erro ao conectar com o banco de dados: ", e);
    }
}

public void inserirPessoa(Pessoa pessoa){
    String sql = "INSERT INTO pessoas (id,nome,cpf, rg, dataNascimento, nacionalidade, profissao, genero, estadoCivil) VALUES (?,?,?,?,?,?,?,?,?)";
    try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
        statement.setInt(1, pessoa.getId());
        statement.setString(2, pessoa.getNome());
        statement.setString(3, pessoa.getCpf());
        statement.setString(4, pessoa.getRg());
        statement.setString(5, pessoa.getDataNascimento());
        statement.setString(6, pessoa.getNacionalidade());
        statement.setString(7, pessoa.getProfissao());
        statement.setString(7, pessoa.getGenero());
        statement.setString(7, pessoa.getEstadoCivil());
        statement.execute();
    } catch (SQLException e){
        System.err.println("Erro ao inserir pessoa no banco de dados:" + e.getMessage());
        throw new RuntimeException("Erro ao inserir pessoa no banco de dados, " + e);
    }
}
public Pessoa obterPessoaPorId(int id) {
    String sql = "SELECT id, nome, cpf, rg, dataNascimento, nacionalidade, profissao, genero, estadoCivil FROM pessoas WHERE id = ?";
    try (PreparedStatement statment = Conector.openConnection().prepareStatement(sql)) {
        statment.setInt(1, id);
        try (ResultSet result = statment.executeQuery()) {
            if (!result.next()) {
                return null;
            }
            return new Pessoa(result.getInt("id"),
                    result.getString("nome"),
                    result.getString("cpf"),
                    result.getString("rg"),
                    result.getString("dataNascimento"),
                    result.getString("nacionalidade"),
                    result.getString("profissao"),
                    result.getString("genero"),
                    result.getString("estadoCivil"));
        }
    } catch (SQLException e) {
        System.err.println("Erro ao obter pessoa por id: " + e.getMessage());
        throw new RuntimeException("Erro ao obter pessoa por ID: ", e);
    }
}
public List<Pessoa> obterTodasPessoas(){
    List<Pessoa> pessoas = new ArrayList<>();
    String sql = "SELECT id, nome, cpf, rg, dataNascimento, nacionalidade, profissao, genero, estadoCivil FROM pessoas";
    try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
        try (ResultSet result = statement.executeQuery()){
            while(result.next()){
                pessoas.add(new Pessoa(result.getInt("id"),
                        result.getString("nome"),
                        result.getString("cpf"),
                        result.getString("rg"),
                        result.getString("dataNascimento"),
                        result.getString("nacionalidade"),
                        result.getString("profissao"),
                        result.getString("genero"),
                        result.getString("estadoCivil")));
            }
        }
    }catch (SQLException e){
        System.err.println("Rerro ao obter todas as pessoas: " + e.getMessage());
        throw new RuntimeException("Eroo ao obter todas as pessoas", e);
    }
    return pessoas;
}
public void deletarPessoa(int id){
    String sql = "DELETE FROM pessoas WHERE id = ?";
    try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
        statement.setInt(1,id);
        statement.executeUpdate();
    }catch(SQLException e){
        System.err.println("Erro ao deletar pessoa: " + e.getMessage());
        throw new RuntimeException("Erro ao deletar pessoa: ", e);
    }
}
public void alterarPessoa(int id, String nome, String cpf, String rg, String dataNascimento, String nacionalidade, String profissao String genero, String estadoCivil){
    StringBuilder sqlBuilder = new StringBuilder("UPDATE pessoa SET");
    List<Object> parametros = new ArrayList<>();
    if(nome !=null){
        sqlBuilder.append("nome = ?,");
        parametros.add(nome);
    }
    if(cpf !=null){
        sqlBuilder.append("cpf = ?,");
        parametros.add(cpf);
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
        sqlBuilder.append("profissao = ?,");
        parametros.add(profissao);
    }
    if(genero !=null){
        sqlBuilder.append("genero = ?,");
        parametros.add(profissao);
    }
    if(estadoCivil !=null){
        sqlBuilder.append("estadoCivil = ?,");
        parametros.add(profissao);
    }
    sqlBuilder.append("WHERE id = ?");
    parametros.add(id);
    try(PreparedStatement statement = DB.openConnection().prepareStatement(sqlBuilder.toString())){
        for (int i = 0; i < parametros.size(); i++){
            statement.setObject(i + 1, parametros.get(i));
        }
        statement.executeUpdate();
    }catch(SQLException e){
        System.err.println("Erro ao alterar pessoa: " + e.getMessage());
        throw new RuntimeException("Erro ao alterar pessoa: ", e);
    }
}
}*/