package model;

public class PilhaStrings {
    private static class No {
        String dado;
        No proximo;

        No(String dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No topo;

    public PilhaStrings() {
        topo = null;
    }

    public void empilhar(String elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public String desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        String valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public String topo() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return topo.dado;
    }
}

