
package com.app.Banco;

import com.app.entidades.usuario.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    public void alterar(Usuario usuario )throws SQLException {
        String sql = "UPDATE usuario SET "
                + "nome = ?,"
                + "senha = ?,"
                + "email = ?";
                
        try(PreparedStatement statement = Conector.openConnection().prepareStatement(sql)){
            
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getEmail());
           
            statement.executeUpdate();
        }catch(SQLException e){
            
            throw new SQLException("Erro ao alterar pessoa jurídica");
        }
    }
    
    public Usuario buscar() throws SQLException{
        String sql = "SELECT nome, senha,email FROM usuario LIMIT 1";
        try (PreparedStatement statment = Conector.openConnection().prepareStatement(sql)) {
            try (ResultSet result = statment.executeQuery()) {
               
                return new Usuario(result.getString("nome"), result.getString("senha"),  result.getString("email"));
                
            }
            
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao obter usuário");
        }
    }
    
}
