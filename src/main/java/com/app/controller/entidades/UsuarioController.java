
package com.app.controller.entidades;

import com.app.Banco.UsuarioDAO;
import com.app.entidades.usuario.Usuario;
import com.app.exceptions.ServiceException;
import java.sql.SQLException;

public class UsuarioController {
    UsuarioDAO dao = new UsuarioDAO();
    public Usuario buscarUm(Usuario user) throws ServiceException {
         try{ 
           Usuario usuario = dao.buscar(user);
           if (usuario == null) {
               return null;
           } 
           
           return usuario;
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }
    
    public void alterar(Usuario usuario)throws ServiceException  {
       try{ 
           dao.alterar(usuario);
          
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        } 
    }
}
