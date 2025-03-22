package model;

import java.util.LinkedList;
import java.util.Queue;

public class PilhaInt {
    private static class No {
        int dado;
        No proximo;

        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No topo;

    public PilhaInt() {
        topo = null;
    }

    public void empilhar(int elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public int desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        int valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public int topo() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return topo.dado;
    }

    public int max() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }

        Queue<Integer> filaAuxiliar = new LinkedList<>();
        int maxValor = Integer.MIN_VALUE;

        // Percorre a pilha e encontra o maior valor
        No atual = topo;
        while (atual != null) {
            maxValor = Math.max(maxValor, atual.dado);
            filaAuxiliar.add(atual.dado);
            atual = atual.proximo;
        }

        // Reconstruir a pilha na ordem original
        while (!filaAuxiliar.isEmpty()) {
            this.empilhar(filaAuxiliar.poll());
        }

        return maxValor;
    }
}