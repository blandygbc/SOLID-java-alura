package br.com.blandygbc.rh.service.promocao;

import br.com.blandygbc.rh.ValidacaoException;
import br.com.blandygbc.rh.model.Cargo;
import br.com.blandygbc.rh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metabatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE.equals(cargoAtual)) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (metabatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }
    }
}
