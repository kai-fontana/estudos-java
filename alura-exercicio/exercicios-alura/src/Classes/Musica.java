package Classes;

import java.util.Scanner;

public class Musica {

    Scanner exibirAlgo = new Scanner(System.in);

    //Atributos
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int avaliacao;
    private int numAvaliacoes;

    //Construtores


    public Musica(String titulo, String artista, int anoLancamento, int avaliacao, int numAvaliacoes) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.numAvaliacoes = numAvaliacoes;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setNumAvaliacoes(int numAvaliacoes) {
        this.numAvaliacoes = numAvaliacoes;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }

    //Métodos
    public void exibirFichaTecnica() {
        System.out.printf("Ficha técnica \nTítulo: %s \nArtista: %s \nAno de Lançamento: %s \nAvaliação: %s \nNúmero de Avaliações: %s", titulo, artista, anoLancamento, avaliacao, numAvaliacoes);
    }



    public void avaliarMusica() {
        System.out.println();
        System.out.println("Diga a sua nota para a música: ");
        avaliacao = exibirAlgo.nextInt();
        System.out.println("A sua avaliacao foi de: " + avaliacao);
    }

    public void calcularMedia() {
        System.out.println();
        int media = (avaliacao + avaliacao) / numAvaliacoes;
        System.out.println("A média de avaliações foi de: " + media);
    }

}
