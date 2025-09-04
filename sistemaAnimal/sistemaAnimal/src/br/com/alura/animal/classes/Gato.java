package br.com.alura.animal.classes;

public class Gato extends Animal{

    //Construtor
    public Gato(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    //Método
    @Override
    public void emitirSom() {
        System.out.println("Miau miau miau");
    }

    public void arranhaMoveis() {
        System.out.println("Arranhando...");
    }
}
