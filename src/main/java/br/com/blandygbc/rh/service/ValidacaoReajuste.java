package br.com.blandygbc.rh.service;

import java.math.BigDecimal;

import br.com.blandygbc.rh.model.Funcionario;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
