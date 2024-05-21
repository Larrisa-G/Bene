package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JuridicaDAO {

    public JuridicaDAO (String nameDatabase){
        try {
            Connection conexao = Conector.openConnection() ;
            conexao.close();
        }catch (SQLException e){
            System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            throw new RuntimeException("Erro ao conectar com o banco de dados: ", e);
        }
    }

    public void inserirEmpresa(Juridica empresa){
        String sql = "INSERT INTO empresas (nomeFantasia, cnpj, cpfDiretor, cadastroEstadual) VALUES (?,?,?,?)";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, empresa.getNomeFantasia());
            statement.setString(2, empresa.getCnpj());
            statement.setString(3, empresa.getCpfDiretor());
            statement.setString(4, empresa.getCadastroEstadual());
            statement.execute();
        } catch (SQLException e){
            System.err.println("Erro ao inserir empresa ao banco de dados:" + e.getMessage());
            throw new RuntimeException("Erro ao inserir empresa ao banco de dados, " + e);
        }
    }

    public Juridica obterEmpresaPorCnpj(String cnpj) {
        String sql = "SELECT nomeFantasia, cnpj, cpfDiretor, cadastroEstadual FROM empresas WHERE cnpj = ?";
        try (PreparedStatement statment = Conector.openConnection().prepareStatement(sql)) {
            statment.setString(4, cnpj);
            try (ResultSet result = statment.executeQuery()) {
                if (!result.next()) {
                    return null;
                }
                return new Juridica (result.getString("nomeFantasia"), result.getString("cnpj"), result.getString("cpfDiretor"), result.getString("cadastroEstadusl"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao obter empresa por CNPJ: " + e.getMessage());
            throw new RuntimeException("Erro ao obter empresa por CNPJ: ", e);
        }
    }

    public List<Juridica> obterTodasEmpresas(){
        List<Juridica> empresas = new ArrayList<>();
        String sql = "SELECT nomeFantasia, cnpj, cpfDiretor, cadastroEstadual FROM empresas";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            try (ResultSet result = statement.executeQuery()){
                while(result.next()){
                    empresas.add(new Juridica(result.getString("nomeFantasia"),  result.getString("cnpj"),  result.getString("cpfDiretor"),  result.getString("cadastroEstadual")));
                }
            }
        }catch (SQLException e){
            System.err.println("Erro ao obter todas as empresas: " + e.getMessage());
            throw new RuntimeException("Erro ao obter todas as empresas", e);
        }
        return empresas;
    }

    public void deletarEmpresa(String cnpj){
        String sql = "DELETE FROM empresas WHERE cnpj = ?";
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(2, cnpj);
            statement.executeUpdate();
        }catch(SQLException e){
            System.err.println("Erro ao deletar empresa: " + e.getMessage());
            throw new RuntimeException("Erro ao deletar empresa: ", e);
        }
    }

    /*public void alterarEmpresa(String nomeFantasia, String cnpj, String cpfDiretor, String cadastroEstadual) {
        StringBuilder sqlBuilder = new StringBuilder("UPDATE empresa SET");
        List<Object> parametros = new ArrayList<>();
        if (nomeFantasia != null) {
            sqlBuilder.append("nomeFantasia = ?,");
            parametros.add(nomeFantasia);
        }
        if (cpfDiretor != null) {
            sqlBuilder.append("cpfDiretor = ?,");
            parametros.add(cpfDiretor);
        }
        if (cadastroEstadual != null) {
            sqlBuilder.append("cadastroEstadual = ?,");
            parametros.add(cadastroEstadual);
        }
        sqlBuilder.append("WHERE cnpj = ?");
        parametros.add(cnpj);
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sqlBuilder.toString())) {
            for (int i = 0; i < parametros.size(); i++) {
                statement.setObject(i + 1, parametros.get(i));
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar empresa: " + e.getMessage());
            throw new RuntimeException("Erro ao alterar empresa: ", e);
        }
    }*/

    /*public static void atualizarContato(String cnpj) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_FILE);
             PreparedStatement statement = connection.prepareStatement(UPDATE_CONTATO_SQL)) {
            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getTelefone());
            statement.setInt(3, contato.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    public void alterarEmpresa(String nomeFantasia, String cnpj, String cpfDiretor, String cadastroEstadual){
        //String sql = "UPDATE empresas SET (nomeFantasia, cnpj, cpfDiretor, cadastroEstadual) VALUES (?,?,?,?) Were id = ?";
        String sql = "UPDATE empresas SET nomeFantasia = ?, cpfDiretor = ?, cadastroEstadual = ? WHERE cnpj = ?";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, nomeFantasia);
            statement.setString(2, cnpj);
            statement.setString(3, cpfDiretor);
            statement.setString(4, cadastroEstadual);
            statement.execute();
        } catch (SQLException e){
            System.err.println("Erro ao alterar empresa no banco de dados:" + e.getMessage());
            throw new RuntimeException("Erro ao alterar empresa no banco de dados, " + e);
        }
    }



}