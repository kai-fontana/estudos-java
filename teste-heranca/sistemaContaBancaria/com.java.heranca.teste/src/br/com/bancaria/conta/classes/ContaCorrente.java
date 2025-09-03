package br.com.bancaria.conta.classes;

public class ContaCorrente extends Conta {
    //Atributos
        //*O final se encontra presente pois a tarifa é fixa
    private final double tarifa;

    //Construtores

    public ContaCorrente() {
        this.tarifa = 50;
    }

    //Método
    public void cobrarTarifaMensal(double saldo) {
        System.out.println("Cobrando tarifa mensal: ");
        saldo -= tarifa;
        System.out.println("Após a cobrança da tarifa mensal, o seu saldo atual é de: " + saldo);
    }

}
