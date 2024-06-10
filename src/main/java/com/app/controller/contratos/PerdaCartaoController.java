
package com.app.controller.contratos;
import com.app.exceptions.ValidationException;
import com.app.util.Validador;

public class PerdaCartaoController {
    
    public void validarCampos(
            String contratante, String contratada, String motivo,
            String dataAssino, String dataPerda
            ) 
            throws ValidationException {
        
        if(Validador.isEmpty(contratante)) {
            throw new ValidationException("Campo Contratantante vazio");
        }
        if(Validador.isEmpty(contratada)) {
            throw new ValidationException("Campo Contratada vazio");
        }
        if(Validador.isEmpty(motivo)) {
            throw new ValidationException("Campo Motivo vazio");
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
            throw new ValidationException("Data de perda deve ser postorior a data de assino");
        }
    }
}
