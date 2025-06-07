package br.inteiro;

public class ArvoreInt {
    private No raiz;

    public ArvoreInt() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No raiz, int valor) {
        if (raiz == null) {
            return new No(valor);
        }

        if (valor < raiz.dado) {
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        } else if (valor > raiz.dado) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }

        return raiz;
    }

    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    private No removerRec(No raiz, int valor) {
        if (raiz == null) return null;

        if (valor < raiz.dado) {
            raiz.esquerda = removerRec(raiz.esquerda, valor);
        } else if (valor > raiz.dado) {
            raiz.direita = removerRec(raiz.direita, valor);
        } else {
            // Nó com um ou nenhum filho
            if (raiz.esquerda == null) return raiz.direita;
            if (raiz.direita == null) return raiz.esquerda;

            // Nó com dois filhos
            raiz.dado = minValor(raiz.direita);
            raiz.direita = removerRec(raiz.direita, raiz.dado);
        }

        return raiz;
    }

    public int nivelDoNo(int valor) {
        return nivelDoNoRec(raiz, valor, 0);
    }

    private int nivelDoNoRec(No no, int valor, int nivel) {
        if (no == null) return -1;
        if (no.dado == valor) return nivel;

        int nivelEsquerda = nivelDoNoRec(no.esquerda, valor, nivel + 1);
        if (nivelEsquerda != -1) return nivelEsquerda;

        return nivelDoNoRec(no.direita, valor, nivel + 1);
    }


    private int minValor(No no) {
        int minv = no.dado;
        while (no.esquerda != null) {
            minv = no.esquerda.dado;
            no = no.esquerda;
        }
        return minv;
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
