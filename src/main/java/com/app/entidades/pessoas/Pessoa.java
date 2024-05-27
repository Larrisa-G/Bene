package com.app.entidades.pessoas;

import com.app.entidades.endereco.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Pessoa {
    private Endereco endereco;
}