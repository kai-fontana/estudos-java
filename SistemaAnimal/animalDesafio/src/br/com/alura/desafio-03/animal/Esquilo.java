package br.com.alura.desafios.desafio03;

public class Esquilo extends Animal{
    //Construtor


    public Esquilo(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    //Método
    @Override
    public void emitirSom() {
        System.out.println("Squeak squeak squeak");
    }

    public void roerNoz() {
        System.out.println("Roendo...");
    }
}
