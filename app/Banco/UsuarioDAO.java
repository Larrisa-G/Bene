package com.app.Banco;

import com.app.entidades.pessoas.Fisica;
import com.app.entidades.usuario.Usuario;
import com.app.util.DateUtilFormarter;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class UsuarioDAO {

    public boolean validarUsuario(String username, String senha) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE username = ? AND senha = ?";

        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, username);
            statement.setString(2, senha);

            try(ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao validar usuário: " + e.getMessage());
            throw new RuntimeException("Erro ao validar usuário: ", e);
        }
    }

    public void inserir(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios (username, senha) VALUES (?, ?)";
        try (PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, usuario.getUserName());
            statement.setString(2, usuario.getSenha());
            statement.execute();
        } catch (SQLException e){
            throw new SQLException("Erro ao inserir usuario no banco de dados");
        }
    }

    public void deletar(String username) throws SQLException{
        String sql = "DELETE FROM usuarios WHERE username = ?";
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, username);
            statement.executeUpdate();
        }catch(SQLException e){
            throw new SQLException("Erro ao deletar usuário");
        }
    }

    public void alterar(Usuario usuario) throws SQLException{
        String sql = "UPDATE usuarios SET "
                + "username = ?, "
                + "senah = ? "
                + "WHERE username = ?";
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            statement.setString(1, usuario.getUserName());
            statement.setString(2, usuario.getSenha().toString());
            statement.executeUpdate();
        }catch(SQLException e){
            throw new SQLException("Erro ao alterar usuário ");
        }
    }
}
