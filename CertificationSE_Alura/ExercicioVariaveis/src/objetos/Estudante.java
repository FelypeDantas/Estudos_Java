package objetos;

public class Estudante {

    String nome;
    int idade;
    double altura;
    boolean estudante;

    public Estudante(String nome, int idade, double altura, boolean estudante){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return
                "nome: " + nome + "\n" +
                "idade: " + idade + "\n" +
                "altura: " + altura + "\n" +
                "estudante: " + estudante;
    }
}
