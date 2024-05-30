package com.app.Banco;

import com.app.entidades.endereco.Endereco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.entidades.pessoas.Juridica;

public class JuridicaDAO {

   

    public void inserirEmpresa(Juridica empresa) throws SQLException{
        String sql = "INSERT INTO empresas ("
                + "nomeFantasia, cpfDiretor, cnpj, cadastroEstadual, logradouro, numero, complemento, bairro, cep, cidade, uf, estado) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, empresa.getNomeFantasia());
            statement.setString(2, empresa.getCpfDiretor());
            statement.setString(3, empresa.getCnpj());
            statement.setString(4, empresa.getCadastroEstadual());
            statement.setString(5, empresa.getEndereco().getLogradouro());
            statement.setInt(6, empresa.getEndereco().getNumero());
            statement.setString(7, empresa.getEndereco().getComplemento());
            statement.setString(8, empresa.getEndereco().getBairro());
            statement.setString(9, empresa.getEndereco().getCep());
            statement.setString(10, empresa.getEndereco().getCidade());
            statement.setString(11, empresa.getEndereco().getUf());
            statement.setString(12, empresa.getEndereco().getEstado());
            statement.execute();
        } catch (SQLException e){
            
            throw new SQLException("Erro ao inserir pessoa jurídica ao banco de dados");
        }
    }

    public Juridica obterEmpresaPorCnpj(String cnpj) throws SQLException{
        String sql = "SELECT nomeFantasia, cnpj, cpfDiretor, cadastroEstadual, logradouro, numero, complemento, bairro, cep, cidade, uf, estado FROM empresas WHERE cnpj = ?";
        try (PreparedStatement statment = Conector.openConnection().prepareStatement(sql)) {
            statment.setString(1, cnpj);
            try (ResultSet result = statment.executeQuery()) {
                if (!result.next()) {
                    return null;
                }
                return new Juridica (
                        result.getString("nomeFantasia"),
                        result.getString("cnpj"),
                        result.getString("cpfDiretor"),
                        result.getString("cadastroEstadual"),
                        new Endereco(
                            result.getString("logradouro"),
                            result.getInt("numero"),
                            result.getString("complemento"),
                            result.getString("bairro"),
                            result.getString("cep"),
                            result.getString("cidade"),
                            result.getString("uf"),
                            result.getString("estado")
                        )
                );
            }
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao obter pessoa jurídica por CNPJ ");
        }
    }

    public List<Juridica> obterTodasEmpresas() throws SQLException{
        List<Juridica> empresas = new ArrayList<>();
        String sql = "SELECT nomeFantasia, cnpj, cpfDiretor, cadastroEstadual, logradouro, numero, complemento, bairro, cep, cidade, uf, estado FROM empresas";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            try (ResultSet result = statement.executeQuery()){
                while(result.next()){
                    empresas.add(
                        new Juridica (
                            result.getString("nomeFantasia"),
                            result.getString("cnpj"),
                            result.getString("cpfDiretor"),
                            result.getString("cadastroEstadual"),
                            new Endereco(
                                result.getString("logradouro"),
                                result.getInt("numero"),
                                result.getString("complemento"),
                                result.getString("bairro"),
                                result.getString("cep"),
                                result.getString("cidade"),
                                result.getString("uf"),
                                result.getString("estado")
                            )
                        )
                    );
                }
            }
        }catch (SQLException e){
           
            throw new SQLException("Erro ao obter todas as pessoas jurídicas");
        }
        return empresas;
    }

    public void deletarEmpresa(String cnpj){
        String sql = "DELETE FROM empresas WHERE cnpj = ?";
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(3, cnpj);
            statement.executeUpdate();
        }catch(SQLException e){
            System.err.println("Erro ao deletar pessoa jurídica: " + e.getMessage());
            throw new RuntimeException("Erro ao deletar pessoa jurídica: ", e);
        }
    }

    public void alterarPessoaFisica(String nomeFantasia, String cpfDiretor, String cnpj, String cadastroEstadual, String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf, String estado){
        StringBuilder sqlBuilder = new StringBuilder("UPDATE pessoaFisica SET ");
        List<Object> parametros = new ArrayList<>();
        /*
        if(nome !=null){
            sqlBuilder.append("nomeFntasia = ?,");
            parametros.add(nome);
        }
        if(nome !=null){
            sqlBuilder.append("cpfDiretor = ?,");
            parametros.add(nome);
        }
        if(nome !=null){
            sqlBuilder.append("cadastroEstadual = ?,");
            parametros.add(nome);
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
        */
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sqlBuilder.toString())){
            for (int i = 0; i < parametros.size(); i++){
                statement.setObject(i + 1, parametros.get(i));
            }
            statement.executeUpdate();
        }catch(SQLException e){
            System.err.println("Erro ao alterar pessoa jurídica: " + e.getMessage());
            throw new RuntimeException("Erro ao alterar pessoa jurídica: ", e);
        }
    }

    /*public void alterarEmpresa(String nomeFantasia, String cnpj, String cpfDiretor, String cadastroEstadual){
        String sql = "UPDATE empresas SET nomeFantasia = ?, cpfDiretor = ?, cadastroEstadual = ? WHERE cnpj = ?";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, nomeFantasia);
            statement.setString(2, cnpj);
            statement.setString(3, cpfDiretor);
            statement.setString(4, cadastroEstadual);
            statement.setString("logradouro");
            statement.setInt("numero");
            statement.setString("complemento");
            statement.setString("bairro");
            statement.setString("cep");
            statement.setString("cidade");
            statement.setString("uf");
            statement.setString("estado");
            statement.execute();
        } catch (SQLException e){
            System.err.println("Erro ao alterar empresa no banco de dados:" + e.getMessage());
            throw new RuntimeException("Erro ao alterar empresa no banco de dados, " + e);
        }
    }*/
}