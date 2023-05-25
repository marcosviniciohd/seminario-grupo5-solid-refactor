package br.edu.iftm.grupo5.refactor.solid.service;

import br.edu.iftm.grupo5.refactor.solid.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
