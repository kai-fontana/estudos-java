package Classes;

public class Carro {
    //Atributos
    String marca;
    String modelo;
    int anoDeFabricacao;
    String cor;

    //Construtores
    public Carro(String marca, String modelo, int anoDeFabricacao, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    //Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Método de exibição
    public void exibirConteudo() {
        System.out.println("A marca do carro: " + marca + "\nO modelo do carro: " + modelo + "\nO ano de fabricação é: " + anoDeFabricacao + "\nA cor do carro é: " + cor);
    }
}
