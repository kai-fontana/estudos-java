import Classes.Produto;

public class Main {
    public static void main(String[] args) {
        Produto monitor =   new Produto("Monitor LG UltraFine", 1250, 10);

        //Usando o método get para mostrar um valor no console
        System.out.println("O nome do produto é: " + monitor.getNome());
        System.out.println("O preço do produto é: " + monitor.getPreco());
        System.out.println("A quantidade de produtos disponíveis em estoquer é de: " + monitor.getQuantidadeEmEstoque());

        monitor.calcularValorTotalEmEstoque();

        monitor.setQuantidadeEmEstoque(5);

        System.out.println("A nova quantidade de produtos disponíveis no estoque é de: " + monitor.getQuantidadeEmEstoque());

        monitor.calcularValorTotalEmEstoque();

    }
}
