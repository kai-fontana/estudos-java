package Classes;

public class Produto {
    //Atributos

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    //Construtor para inicializar os atributos

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //Método

    public void calcularValorTotalEmEstoque() {
        System.out.println("O valor total dos produtos em estoque é de: " + preco * quantidadeEmEstoque);
    }
}
