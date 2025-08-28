import Classes.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro01 = new Carro("Chevrolet", "Onix LT", 2022, "Branco");

        Carro carro02 = new Carro("Chevrolet", "Onix LT", 2024, "Preto");

        carro01.setCor("Vermelho");

        carro01.exibirConteudo();
        carro02.exibirConteudo();

    }
}
