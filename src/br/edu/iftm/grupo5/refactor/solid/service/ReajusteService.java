package br.edu.iftm.grupo5.refactor.solid.service;

import br.edu.iftm.grupo5.refactor.solid.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {
    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajusteSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
