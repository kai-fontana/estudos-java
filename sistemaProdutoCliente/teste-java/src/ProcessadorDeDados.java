import Classes.InformacaoDeCliente;
import Classes.InformacaoDeProduto;

public class ProcessadorDeDados {
    public static void main(String[] args) {

        //Instanciar o objeto da classe infoCliente
        //Cliente 01
        InformacaoDeCliente cliente01 = new InformacaoDeCliente(true);

        //Cliente 02
        InformacaoDeCliente cliente02 = new InformacaoDeCliente(false);

        //Instanciar o objeto da classe infoProduto

        //Produto 01
        InformacaoDeProduto produto01 = new InformacaoDeProduto(true);

        //Produto 02
        InformacaoDeProduto produto02 = new InformacaoDeProduto(false);



                    // Cliente 01
        //Nome e idade
        cliente01.setNome("Salette");
        cliente01.setIdade(57);
        //Método
        cliente01.exibirDetalhes();
        cliente01.exibirTemConvenio();
        cliente01.seMaiorDeIdade();

        //Espaçamento entre os dois clientes
        System.out.println();

                     //Cliente 02
        //Nome e idade
        cliente02.setNome("Felipe");
        cliente02.setIdade(16);

        //Método
        cliente02.exibirDetalhes();
        cliente02.exibirTemConvenio();
        cliente02.seMaiorDeIdade();
        System.out.println();


                    //Produto 01
        //Setters
        produto01.setNome("Chantilly Spray");
        produto01.setMarca("Amélia");

        //Getters
        System.out.println("O nome do produto é: " + produto01.getNome() + "\nSua marca é: " + produto01.getMarca());

        //Método
        produto01.seTemValidade();

                    //Produto 02

        //Setters
        produto02.setNome("Solo Leveling");
        produto02.setMarca("Panini");
        produto02.setTipo("Manhwa");

        System.out.println();

        //Getters
        System.out.println("O nome do produto é: " + produto02.getNome() + "\nA sua marca é: " + produto02.getMarca() + "\nO tipo do produto é: " + produto02.getTipo());
    }
}
