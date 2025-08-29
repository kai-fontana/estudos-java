package Classes;

import java.util.Scanner;

public class Musica {
    Scanner exibirAlgo = new Scanner(System.in);
    //Atributos
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    //Métodos
    public void exibirFichaTecnica() {
        System.out.println("""
                ----------------------
                
                Ficha técnica:
                
                ----------------------
                """);
    }

    public void avaliarMusica() {
        System.out.println("Diga a sua nota para a música: ");
        avaliacao = exibirAlgo.nextInt();
        System.out.println("A sua avaliacao foi de: " + avaliacao);
    }

    public void calcularMedia(int media) {
        numAvaliacoes = (avaliacao + avaliacao + avaliacao) / 3;
        System.out.println("A média de avaliações foi de: " + numAvaliacoes);
    }

}
