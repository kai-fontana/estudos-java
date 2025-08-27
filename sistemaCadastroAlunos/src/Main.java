import Classes.Aluno;

public class Main {
    public static void main(String[] args) {
        //Objetos
        Aluno aluno01 = new Aluno("Kai", "numero1412", 8.9, 9.5);
        Aluno aluno02 = new Aluno("Marcos", "numero1807");

        //Notas do aluno 01
        aluno01.setNota01(9.8);
        aluno01.setNota02(6.8);

        //Notas do aluno 02
        aluno02.setNota01(4.6);
        aluno02.setNota02(8.7);

        //Média dos alunos
        aluno01.calcularMedia();
        aluno02.calcularMedia();

        //Chamando os métodos do aluno 01
        System.out.println("A média do aluno 01 é: " + aluno01.calcularMedia());
        System.out.println("Verificando a aprovação do aluno 01: " + aluno01.verificarAprovacao());

        //Chamando os métodos do aluno 02
        System.out.println("A média do aluno 02: " + aluno02.calcularMedia());
        System.out.println("Verificando a aprovação do aluno 02: " + aluno02.verificarAprovacao());


    }
}
