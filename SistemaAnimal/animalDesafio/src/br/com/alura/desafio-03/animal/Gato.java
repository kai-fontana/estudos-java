package br.com.alura.desafios.desafio03;

public class Gato extends Animal {

    //Construtor
    public Gato(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    //Sobrescrevendo método
    @Override
    public void emitirSom() {
        System.out.println("Miau miau miau");
    }
    public void arranharMoveis() {
        System.out.println("Arranhando...");
    }
}
