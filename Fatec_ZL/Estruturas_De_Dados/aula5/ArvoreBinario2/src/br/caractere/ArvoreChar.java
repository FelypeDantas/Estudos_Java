package br.caractere;

public class ArvoreChar {
    private No raiz;

    public ArvoreChar() {
        raiz = null;
    }

    public void inserir(String valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No raiz, String valor) {
        if (raiz == null) return new No(valor);

        if (valor.compareTo(raiz.dado) < 0) {
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        } else if (valor.compareTo(raiz.dado) > 0) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }
        return raiz;
    }

    public void remover(String valor) {
        raiz = removerRec(raiz, valor);
    }

    private No removerRec(No raiz, String valor) {
        if (raiz == null) return null;

        if (valor.compareTo(raiz.dado) < 0) {
            raiz.esquerda = removerRec(raiz.esquerda, valor);
        } else if (valor.compareTo(raiz.dado) > 0) {
            raiz.direita = removerRec(raiz.direita, valor);
        } else {
            if (raiz.esquerda == null) return raiz.direita;
            else if (raiz.direita == null) return raiz.esquerda;

            raiz.dado = minValor(raiz.direita);
            raiz.direita = removerRec(raiz.direita, raiz.dado);
        }

        return raiz;
    }

    private String minValor(No no) {
        String minv = no.dado;
        while (no.esquerda != null) {
            minv = no.esquerda.dado;
            no = no.esquerda;
        }
        return minv;
    }

    public void exibirPreOrdem() {
        preOrdem(raiz);
        System.out.println();
    }

    private void preOrdem(No raiz) {
        if (raiz != null) {
            System.out.print(raiz.dado + " ");
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }

    public void exibirInOrdem() {
        inOrdem(raiz);
        System.out.println();
    }

    private void inOrdem(No raiz) {
        if (raiz != null) {
            inOrdem(raiz.esquerda);
            System.out.print(raiz.dado + " ");
            inOrdem(raiz.direita);
        }
    }

    public void exibirPosOrdem() {
        posOrdem(raiz);
        System.out.println();
    }

    private void posOrdem(No raiz) {
        if (raiz != null) {
            posOrdem(raiz.esquerda);
            posOrdem(raiz.direita);
            System.out.print(raiz.dado + " ");
        }
    }
}