package br.com.alura.desafios;

import br.com.alura.desafios.desafio03.Cachorro;
import br.com.alura.desafios.desafio03.Esquilo;
import br.com.alura.desafios.desafio03.Gato;

public class Main {
    public static void main(String[] args) {
        //Instanciando
        Cachorro cachorro01 = new Cachorro("Totó", "Pinscher", 1);
        Gato gato01 = new Gato("Fifi", "Siâmes", 5);
        Esquilo esquilo01 = new Esquilo("Alvin", "Esquilo voador", 2);

        cachorro01.emitirSom();
        cachorro01.abanarRabo();

        gato01.emitirSom();
        gato01.arranharMoveis();

        esquilo01.emitirSom();
        esquilo01.roerNoz();
    }
}