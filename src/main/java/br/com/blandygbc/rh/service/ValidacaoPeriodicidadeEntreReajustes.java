package br.com.blandygbc.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.blandygbc.rh.ValidacaoException;
import br.com.blandygbc.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate hoje = LocalDate.now();
        Long messesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, hoje);
        if (messesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
        }

    }
}
