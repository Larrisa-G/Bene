
package com.app.controller.contratos;

import com.app.entidades.pessoas.Fisica;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ValidationError;
import com.app.util.Validador;

public class AssistenciaMedicaController {
    public void validarContratanteContratada(Juridica juridica, Fisica fisica) throws ValidationError {

            Validador.validarPessoaJuridica(juridica);
            Validador.validarEndereco(juridica.getEndereco());
            Validador.validarPessoaFisica(fisica);
            Validador.validarEndereco(fisica.getEndereco());
        
    }
    
}
