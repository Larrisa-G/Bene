
package com.app.controller.contratos;

import com.app.entidades.endereco.Endereco;
import com.app.entidades.pessoas.Fisica;
import com.app.entidades.pessoas.Juridica;
import com.app.exceptions.ValidationException;
import com.app.util.Validador;


public class ComodatoImovelController {
    
    public void validarComodante(Juridica juridica, Fisica fisica) throws ValidationException {

        Validador.validarPessoaJuridica(juridica);
        Validador.validarEndereco(juridica.getEndereco());
        Validador.validarPessoaFisica(fisica);
        Validador.validarEndereco(fisica.getEndereco());
        
    }
     
    public void validarComodatario(Fisica fisica, String carteiraTrab, String serieCartTrab) throws ValidationException {
          Validador.validarPessoaFisica(fisica);
          Validador.validarEndereco(fisica.getEndereco());
          if(Validador.isEmpty(carteiraTrab)) {
              throw new ValidationException("Campo carteira de trabalho vazio");
          }
          if(Validador.isEmpty(serieCartTrab)) {
              throw new ValidationException("Campo série carteira de trabalho vazio");
          }

    }
    
    public void validarObjContrato(Endereco endereco, String cartorio, String numRegistro) throws ValidationException {
        
          Validador.validarEndereco(endereco);
          if(Validador.isEmpty(cartorio)) {
              throw new ValidationException("Campo Cartório está vazio");
          }
          if(Validador.isEmpty(numRegistro)) {
              throw new ValidationException("Campo numero de registro da propriedade está vazio");
          }
    }
    
    public void validarForro(String forro)throws ValidationException {
        if(Validador.isEmpty(forro)) {
              throw new ValidationException("Campo Forro da comarca está vazio");
          }
    }
}
