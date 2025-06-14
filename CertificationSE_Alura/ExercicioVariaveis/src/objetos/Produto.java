package objetos;

public class Produto {

    String nome;
    double preco;
    double quantidade;

    public Produto(String nome, double preco, double quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "O valor inteiro do produto é: " + (int) quantidade;
    }

}
