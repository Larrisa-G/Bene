
package com.app.controller.contratos;
import com.app.exceptions.ValidationException;
import com.app.util.Validador;

public class CobrancaIndevidaController {
    
    public void validarCampos(
            String contratante, String contratada, String prazoDevolucao,
            String dataAssino, String dataPerda
            ) 
            throws ValidationException {
        
        if(Validador.isEmpty(contratante)) {
            throw new ValidationException("Campo Contratantante vazio");
        }
        if(Validador.isEmpty(contratada)) {
            throw new ValidationException("Campo Contratada vazio");
        }
        if(Validador.isEmpty(prazoDevolucao)) {
            throw new ValidationException("Campo Prazo devolução vazio");
        }
        
        
        if(Validador.isEmpty(dataAssino)) {
            throw new ValidationException("Campo Data assino cartão");
        }
        if(Validador.isEmpty(dataPerda)) {
            throw new ValidationException("Campo Data perda cartão");
        }
        
        if (!Validador.validarData(dataAssino) || !Validador.validarData(dataPerda)) {
            throw new ValidationException("Data inválida");
        }
        
        if (!Validador.validarDataTermino(dataAssino, dataPerda)) {
            throw new ValidationException("Data de cobrança deve ser postorior a data de cotratação");
        }        
    }
}
