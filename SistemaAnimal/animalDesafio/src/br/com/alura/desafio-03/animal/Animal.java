package br.com.alura.desafios.desafio03;

public abstract class Animal {
    //Atributos
    private String nome;
    private String raca;
    private int idade;

    //Construtores

    public Animal(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    //Método
    public abstract void emitirSom();

    //Get/Set

}
