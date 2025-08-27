import Classe.Produto;

public class Main {
    public static void main(String[] args) {
        Produto monitor =   new Produto("Monitor LG UltraFine", 1250, 10);

        //Usando o método get para mostrar o valor do objeto no console
        System.out.println("O nome do produto é: " + monitor.getNome());
        System.out.println("O preço do produto é: " + monitor.getPreco());
        System.out.println("A quantidade de produtos disponíveis em estoquer é de: " + monitor.getQuantidadeEmEstoque());

        //Faz com que o método calcularValorEmEstoque() seja executado e sobre o objeto monitor
        monitor.calcularValorTotalEmEstoque();

        //Dá um set para mudar ao valor do atributo quantidadeEmEstoque
        monitor.setQuantidadeEmEstoque(5);

        //Exibe o valor atual do atributo
        System.out.println("A nova quantidade de produtos disponíveis no estoque é de: " + monitor.getQuantidadeEmEstoque());

        //Chama o método novamente e faz com que ele calcule agora com os valores novos
        monitor.calcularValorTotalEmEstoque();

    }
}
