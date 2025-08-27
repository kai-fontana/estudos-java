package Classes;

public class Aluno {
    //Atributos
    private String nome;
    private String matricula;
    private double nota01;
    private double nota02;

    //Construtores
    public Aluno(String kai, String numero1412, double v, double v1) {
        this.nome = "";
        this.matricula = "";
        this.nota01 = 0.0;
        this.nota02 = 0.0;
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota01 = 0.0;
        this.nota02 = 0.0;
    }

    //Getters para todos os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    //Mudança com condicional na nota 01
    public void setNota01() {
        if (nota01 < 0.0) {
            System.out.println("Erro!\nO valor da nota deve ser acima de 0.0");
        } else if (nota01 > 10.0) {
            System.out.println("Erro!\nO valor da nota deve ser abaixo de 10.0");
        } else {
            setNota01();
        }
        System.out.println("A nota é de: " + nota01 );
    }

    //Mudança com condicional na nota 02
    public void setNota02() {
        if (nota02 < 0.0) {
            System.out.println("Erro!\nO valor da nota deve ser acima de 0.0");
        } else if (nota02 > 10.0) {
            System.out.println("Erro!\nO valor da nota deve ser abaixo de 10.0");
        } else {
            setNota02();
        }
        System.out.println("A nota é de: " + nota02 );
    }

    //Método para calcular a média
    public double calcularMedia() {
        return (nota01 + nota02) / 2;
    }

    //Método para verificar a aprovação
    public String verificarAprovacao(){
        if (calcularMedia() >= 7.0) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }

    }
}
