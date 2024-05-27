
package com.app.controller;

import com.app.Banco.FisicaDAO;
import com.app.entidades.pessoas.Fisica;
import java.util.List;


public class FisicaController implements ControllersInterface<Fisica>{
    FisicaDAO dao = new FisicaDAO();
    @Override
    public void criar(Fisica fisica) throws Exception{
        try {
            dao.inserirPessoaFisica(fisica);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void deletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Fisica> pegarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Fisica pegarUm(String value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
