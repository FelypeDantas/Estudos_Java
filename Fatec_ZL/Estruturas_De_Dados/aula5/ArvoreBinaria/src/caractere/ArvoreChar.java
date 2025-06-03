package caractere;

public class ArvoreChar {
    private No raiz;

    public ArvoreChar() {
        raiz = null;
    }

    public void inserir(char valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No raiz, char valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.dado) {
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        } else if (valor > raiz.dado) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }

        return raiz;
    }

    public void exibirInOrdem() {
        inOrdem(raiz);
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
    }

    private void posOrdem(No raiz) {
        if (raiz != null) {
            posOrdem(raiz.esquerda);
            posOrdem(raiz.direita);
            System.out.print(raiz.dado + " ");
        }
    }
}