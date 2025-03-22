package view;

import model.PilhaInt;

public class TestePilha {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();

        pilha.empilhar(10);
        pilha.empilhar(25);
        pilha.empilhar(7);
        pilha.empilhar(50);
        pilha.empilhar(30);

        System.out.println("Maior elemento da pilha: " + pilha.max()); // Saída esperada: 50

        System.out.println("Topo da pilha após max(): " + pilha.topo()); // Deve ser 30 (último inserido)
    }
}
