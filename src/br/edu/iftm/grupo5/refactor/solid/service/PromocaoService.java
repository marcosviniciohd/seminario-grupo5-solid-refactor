package br.edu.iftm.grupo5.refactor.solid.service;

import br.edu.iftm.grupo5.refactor.solid.ValidacaoException;
import br.edu.iftm.grupo5.refactor.solid.model.Cargo;
import br.edu.iftm.grupo5.refactor.solid.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        if (Cargo.GERENTE == funcionario.getCargo()) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = funcionario.getCargo().getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }
    }
}
