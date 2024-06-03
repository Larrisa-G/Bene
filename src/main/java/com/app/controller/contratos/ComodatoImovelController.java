
package com.app.controller.contratos;

import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.Fisica;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ValidationError;
import com.app.util.Validador;


public class ComodatoImovelController {
    
    public void validarComodante(Juridica juridica, Fisica fisica) throws ValidationError {

        Validador.validarPessoaJuridica(juridica);
        Validador.validarEndereco(juridica.getEndereco());
        Validador.validarPessoaFisica(fisica);
        Validador.validarEndereco(fisica.getEndereco());
        
    }
     
    public void validarComodatario(Fisica fisica, String carteiraTrab, String serieCartTrab) throws ValidationError {
          Validador.validarPessoaFisica(fisica);
          Validador.validarEndereco(fisica.getEndereco());
          if(Validador.isEmpty(carteiraTrab)) {
              throw new ValidationError("Campo carteira de trabalho vazio");
          }
          if(Validador.isEmpty(serieCartTrab)) {
              throw new ValidationError("Campo série carteira de trabalho vazio");
          }

    }
    
    public void validarObjContrato(Endereco endereco, String cartorio, String numRegistro) throws ValidationError {
        
          Validador.validarEndereco(endereco);
          if(Validador.isEmpty(cartorio)) {
              throw new ValidationError("Campo Cartório está vazio");
          }
          if(Validador.isEmpty(numRegistro)) {
              throw new ValidationError("Campo numero de registro da propriedade está vazio");
          }
    }
    
    public void validarForro(String forro)throws ValidationError {
        if(Validador.isEmpty(forro)) {
              throw new ValidationError("Campo Forro da comarca está vazio");
          }
    }
}
