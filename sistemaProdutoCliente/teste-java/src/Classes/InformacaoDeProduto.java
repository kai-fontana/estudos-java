package Classes;

public class InformacaoDeProduto {
    //Atributos
    private String nome;
    private final boolean temValidade;
    private String marca;
    private String tipo;


    //Construtores
    public InformacaoDeProduto(boolean temValidade) {
        this.nome = "";
        this.temValidade = temValidade;
        this.marca = "";
        this.tipo = "";
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return tipo;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Método

    public void seTemValidade() {
        if (temValidade) {
            System.out.println("Item dentro da data de validade!");
        } else {
            System.out.println("Item fora da data de validade!");
        }
    }

}
