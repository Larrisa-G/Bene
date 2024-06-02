
package com.app.controller;
import com.app.exceptions.ValidationError;
import com.app.util.Validador;

public class CobrancaIndevidaController {
    
    public void validarCampos(
            String contratante, String contratada, String prazoDevolucao,
            String dataAssino, String dataPerda
            ) 
            throws ValidationError {
        
        if(Validador.isEmpty(contratante)) {
            throw new ValidationError("Campo Contratantante vazio");
        }
        if(Validador.isEmpty(contratada)) {
            throw new ValidationError("Campo Contratada vazio");
        }
        if(Validador.isEmpty(prazoDevolucao)) {
            throw new ValidationError("Campo Prazo devolução vazio");
        }
        
        
        if(Validador.isEmpty(dataAssino)) {
            throw new ValidationError("Campo Data assino cartão");
        }
        if(Validador.isEmpty(dataPerda)) {
            throw new ValidationError("Campo Data perda cartão");
        }
        
        if (!Validador.validarData(dataAssino) || !Validador.validarData(dataPerda)) {
            throw new ValidationError("Data inválida");
        }
        
        if (!Validador.validarDataTermino(dataAssino, dataPerda)) {
            throw new ValidationError("Data de cobrança deve ser postorior a data de cotratação");
        }        
    }
}
