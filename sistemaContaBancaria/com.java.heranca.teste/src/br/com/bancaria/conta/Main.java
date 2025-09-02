package br.com.bancaria.conta;

import br.com.bancaria.conta.classes.Conta;
import br.com.bancaria.conta.classes.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente pessoa01 = new ContaCorrente();

        pessoa01.setNumeroDaConta(19020);
        pessoa01.setSaldo(1900);
        pessoa01.depositar();
        pessoa01.sacar();
        pessoa01.cobrarTarifaMensal(pessoa01.getSaldo());

    }
}