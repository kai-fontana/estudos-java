import Classes.Calculadora;
import Classes.Musica;
import Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        //Instanciando Objetos
        Pessoa exibirTexto = new Pessoa();
        Calculadora calculoDobro = new Calculadora();
        Musica musica01 = new Musica("Your Idol","Saja Boys", 2025, 10, 25);

        //Utilizando métodos
        exibirTexto.exibirOlaMundo();
        calculoDobro.exibirCalculo(10);
        musica01.avaliarMusica();
        musica01.exibirFichaTecnica();
        musica01.calcularMedia();



    }
}