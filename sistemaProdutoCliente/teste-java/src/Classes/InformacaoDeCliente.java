package Classes;

public class InformacaoDeCliente {

    //Atributos
    private String nome;
    private int idade;
    private final boolean temConvenio;



    //Construtores
    public InformacaoDeCliente(boolean temConvenio) {
        this.nome = "";
        this.idade = 0;
        this.temConvenio = temConvenio;

    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    //Método
    public void exibirTemConvenio() {
        if (temConvenio) {
            System.out.println("Sim, você tem convênio!");
        } else {
            System.out.println("Não, você não tem convênio!");
        }
    }

    public void seMaiorDeIdade() {
        if (idade >= 18) {
            System.out.println("Você pode fazer um cartão!");
        } else {
            System.out.println("Você ainda não pode fazer um cartão!");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
}
