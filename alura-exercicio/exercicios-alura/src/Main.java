import Classes.Calculadora;
import Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        //Instanciando Objetos
        Pessoa exibirTexto = new Pessoa();
        Calculadora calculoDobro = new Calculadora();

        //Utilizando métodos
        exibirTexto.exibirOlaMundo();
        calculoDobro.exibirCalculo(10);


    }
}