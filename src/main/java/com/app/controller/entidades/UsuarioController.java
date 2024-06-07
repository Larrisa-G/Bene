
package com.app.controller.entidades;

import com.app.Banco.UsuarioDAO;
import com.app.entidades.usuario.Usuario;
import com.app.exceptions.ServiceException;
import com.app.exceptions.ValidationException;
import com.app.util.Validador;
import java.sql.SQLException;

public class UsuarioController {
    UsuarioDAO dao = new UsuarioDAO();
    public Usuario buscarUm() throws ServiceException {
         try{ 
           Usuario usuario = dao.buscar();
           if (usuario == null) {
               return null;
           } 
           
           return usuario;
        } catch (SQLException e) {
            throw new ServiceException(e.getMessage());
        }
    }
    
    public void alterar(Usuario usuario)throws ServiceException,ValidationException  {
       try{ 
          Validador.validarUsuario(usuario);
          dao.alterar(usuario);
          
        } catch (SQLException | ValidationException e) {
            throw new ServiceException(e.getMessage());
        } 
    }
}
