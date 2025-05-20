package model;

public class Morador {
    private int numeroApartamento;
    private String nome;
    private Carro carro;

    public Morador(int numeroApartamento, String nome, Carro carro) {
        this.numeroApartamento = numeroApartamento;
        this.nome = nome;
        this.carro = carro;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Morador{Apartamento= " + numeroApartamento + ", Nome='" + nome + "', Carro=" + carro + "}";
    }
}

