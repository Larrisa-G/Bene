
package com.app.Banco;

import com.app.entidades.usuario.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    public void alterar(Usuario usuario )throws SQLException {
        String sql = "UPDATE usuario SET "
                +"nome = ?,"
                +"senha = ?";    
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getSenha());
           
            statement.executeUpdate();
        }catch(SQLException e){
            
            throw new SQLException("Erro ao alterar pessoa jurídica");
        }
    }
    
    public Usuario buscar(Usuario usuario) throws SQLException{
        String sql = "SELECT nome, senha FROM usuario WHERE nome = ? AND senha = ?";
        try (PreparedStatement statment = Conector.openConnection().prepareStatement(sql)) {
            statment.setString(1, usuario.getNome());
            statment.setString(2, usuario.getSenha());
            try (ResultSet result = statment.executeQuery()) {
                if (!result.next()) {
                    return null;
                }
                return new Usuario (
                        result.getString("nome"),  
                        result.getString("senha")
                );
            }
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao obter usuário");
        }
    }
    
}
