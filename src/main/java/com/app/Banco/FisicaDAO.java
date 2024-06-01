package com.app.Banco;

import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.EstadoCivil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import com.app.entidades.pessoas.Fisica;
import com.app.entidades.pessoas.Genero;
import com.app.util.DateUtilFormarter;
import java.sql.Date;
import java.text.ParseException;

public class FisicaDAO implements DAOInterface<Fisica>{

    @Override
    public void inserir(Fisica fisica) throws SQLException{
        String sql = "INSERT INTO pessoaFisica ("
                + "nome, cpf, genero, estadoCivil, rg, dataNascimento, nacionalidade, "
                + "profissao, logradouro, numero, complemento, bairro, cep, cidade, estado"
                + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, fisica.getNome());
            statement.setString(2, fisica.getCpf());
            statement.setString(3, fisica.getGenero().toString());
            statement.setString(4, fisica.getEstadoCivil().toString());
            statement.setString(5, fisica.getRg());
            statement.setDate(6, new Date(DateUtilFormarter.stringToDate(fisica.getDataNascimento()).getTime()));
            statement.setString(7, fisica.getNacionalidade());
            statement.setString(8, fisica.getProfissao());
            statement.setString(9, fisica.getEndereco().getLogradouro());
            statement.setInt(10, fisica.getEndereco().getNumero());
            statement.setString(11, fisica.getEndereco().getComplemento());
            statement.setString(12, fisica.getEndereco().getBairro());
            statement.setString(13, fisica.getEndereco().getCep());
            statement.setString(14, fisica.getEndereco().getCidade());        
            statement.setString(15, fisica.getEndereco().getEstado());
            statement.execute();
        } catch (SQLException e){        
            throw new SQLException("Erro ao inserir pessoa física no banco de dados");
        } catch (ParseException e) {
            throw new SQLException("Data inválida");
        }
    }

    @Override
    public Fisica obterPorChave(String cpf) throws SQLException{
        String sql = "SELECT "
                + "nome, cpf, genero, estadoCivil, rg, dataNascimento, nacionalidade, "
                + "profissao, logradouro, numero, complemento, bairro, cep, cidade, estado "
                + "FROM pessoaFisica WHERE cpf = ?";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)) {
            statement.setString(1,cpf);
            try (ResultSet result = statement.executeQuery()) {
                if (!result.next()) {
                    return null;
                }
                return new Fisica(
                    result.getString("nome"),
                    result.getString("cpf"),
                    Genero.valueOf(result.getString("genero")),
                    EstadoCivil.valueOf(result.getString("estadoCivil")),
                    result.getString("rg"),
                    DateUtilFormarter.sqlDateToString(result.getDate("dataNascimento")),
                    result.getString("nacionalidade"),
                    result.getString("profissao"),
                    new Endereco(
                        result.getString("logradouro"),
                        result.getInt("numero"),
                        result.getString("complemento"),
                        result.getString("bairro"),
                        result.getString("cep"),
                        result.getString("cidade"),
                        result.getString("estado")
                    )
                );
            }
        } catch (SQLException e) {    
            throw new SQLException("Erro ao obter pessoa física pelo CPF");
        }
    }

    @Override
    public List<Fisica> obterTodos() throws SQLException{
        List<Fisica> pessoas = new ArrayList<>();
        String sql = "SELECT nome, cpf, genero, estadoCivil, rg, dataNascimento, nacionalidade,"
                + " profissao, logradouro, numero, complemento, bairro, cep, cidade, estado  FROM pessoaFisica";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            try (ResultSet result = statement.executeQuery()){
                while(result.next()){
                    pessoas.add(new Fisica(
                        result.getString("nome"),
                        result.getString("cpf"),
                        Genero.valueOf(result.getString("genero")),
                        EstadoCivil.valueOf(result.getString("estadoCivil")),
                        result.getString("rg"),
                        DateUtilFormarter.sqlDateToString(result.getDate("dataNascimento")),
                        result.getString("nacionalidade"),
                        result.getString("profissao"),
                        new Endereco(
                            result.getString("logradouro"),
                            result.getInt("numero"),
                            result.getString("complemento"),
                            result.getString("bairro"),
                            result.getString("cep"),
                            result.getString("cidade"),
                            result.getString("estado")
                        )
                    ));
                }
            }
        }catch (SQLException e){
           
            throw new SQLException("Erro ao obter todas as pessoas físicas");
        }
        return pessoas;
    }

    @Override
    public void deletar(String cpf) throws SQLException{
        String sql = "DELETE FROM pessoaFisica WHERE cpf = ?";
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, cpf);
            statement.executeUpdate();
        }catch(SQLException e){
            
            throw new SQLException("Erro ao deletar pessoa física");
        }
    }

    @Override
    public void alterar(Fisica fisica) throws SQLException{
        String sql = "UPDATE pessoaFisica SET "
           + "nome = ?, "
           + "estadoCivil = ?, "
           + "genero = ?, "
           + "profissao = ?, "
           + "logradouro = ?, "
           + "numero = ?, "
           + "complemento = ?, "
           + "bairro = ?, "
           + "cep = ?, "
           + "cidade = ?, "
           + "estado = ? "
           + "WHERE cpf = ?";
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, fisica.getNome());
            statement.setString(2, fisica.getEstadoCivil().toString());
            statement.setString(3, fisica.getGenero().toString());
            statement.setString(4, fisica.getProfissao());
            statement.setString(5, fisica.getEndereco().getLogradouro());
            statement.setInt(6, fisica.getEndereco().getNumero());
            statement.setString(7, fisica.getEndereco().getComplemento());
            statement.setString(8, fisica.getEndereco().getBairro());
            statement.setString(9, fisica.getEndereco().getCep());
            statement.setString(10, fisica.getEndereco().getCidade());  
            statement.setString(11, fisica.getEndereco().getEstado());
            statement.setString(12, fisica.getCpf());
            statement.executeUpdate();
        }catch(SQLException e){     
            throw new SQLException("Erro ao alterar pessoa física ");
        }
    }
}