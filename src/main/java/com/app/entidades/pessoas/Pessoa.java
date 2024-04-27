package com.app.entidades.pessoas;

import com.app.entidades.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Pessoa {
    private Endereco endereco;
}