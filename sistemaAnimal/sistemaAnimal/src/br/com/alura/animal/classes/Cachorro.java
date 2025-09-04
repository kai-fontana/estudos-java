package br.com.alura.animal.classes;

public class Cachorro extends Animal{
    //Construtor
    public Cachorro(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    //Método
    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }

    public void abanarRabo() {
        System.out.println("Abanando...");
    }
}
