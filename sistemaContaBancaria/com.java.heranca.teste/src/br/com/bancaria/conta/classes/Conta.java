package br.com.bancaria.conta.classes;

import java.util.Scanner;

public class Conta {

    Scanner leitura = new Scanner(System.in);

    //Atributos
    private double saldo;
    private int numeroDaConta;
    private int entradaUsuarioConta;
    private int entradaUsuarioDeposito;
    private int entradaUsuarioSaque;

    //Construtores
    public Conta() {
        this.saldo = 0;
        this.numeroDaConta = 0;
        this.entradaUsuarioDeposito = 0;
        this.entradaUsuarioConta = 0;
        this.entradaUsuarioSaque = 0;
    }


    //Métodos

    public void lerEntradaUsuarioConta() {
        System.out.println("Validando conta");
        System.out.println("Insira o número da sua conta: ");
        entradaUsuarioConta = leitura.nextInt();
    }

    public void lerEntradaUsuarioDeposito() {
        System.out.println("Insira um valor que deseja depositar: ");
        entradaUsuarioDeposito = leitura.nextInt();
    }

    public void lerEntradaUsuarioSaque() {
        System.out.println("Insira um valor à ser sacado: ");
        entradaUsuarioSaque = leitura.nextInt();
    }

    public void depositar() {

        lerEntradaUsuarioConta();
        System.out.println("Depositar");
        if (numeroDaConta == entradaUsuarioConta) {
            lerEntradaUsuarioDeposito();
            if (entradaUsuarioDeposito > 0) {
                System.out.println("Valor adicionado com sucesso!");
                saldo += entradaUsuarioDeposito;
                System.out.println("O seu saldo atual é de: " + saldo);
            } else if (entradaUsuarioDeposito < 0){
                System.out.println("O valor deve ser maior que 0!");
            } else {
                System.out.println("O valor inserido é inválido!");
            }
        } else {
            System.out.println("O número inserido não corresponde com nenhuma conta existente!");
        }
    }

    public void sacar() {

        lerEntradaUsuarioConta();
        System.out.println("Sacar");
        if (numeroDaConta == entradaUsuarioConta) {
            lerEntradaUsuarioSaque();
            if (entradaUsuarioSaque > 0) {
                System.out.println("Saque efetuado com sucesso!");
                saldo -= entradaUsuarioSaque;
                System.out.println("O seu saldo atual é de: " + saldo);
            } else if (entradaUsuarioSaque < 0) {
                System.out.println("Insira um valor acima de 0");
            } else {
                System.out.println("O valor inserido é inválido!");
            }
        } else {
            System.out.println("O número inserido não corresponde com nenhuma conta existente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("O seu saldo é de: " + saldo);
    }

    //Getters e Setters


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getEntradaUsuarioConta() {
        return entradaUsuarioConta;
    }

    public void setEntradaUsuarioConta(int entradaUsuarioConta) {
        this.entradaUsuarioConta = entradaUsuarioConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getEntradaUsuarioValor() {
        return entradaUsuarioDeposito;
    }

    public void setEntradaUsuarioValor(int entradaUsuarioValor) {
        this.entradaUsuarioDeposito = entradaUsuarioValor;
    }
}
