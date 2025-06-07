package br.inteiro;

public class No {

        public int dado;
        public No esquerda;
        public No direita;

        public No() {
            this.dado = 0;
            this.esquerda = null;
            this.direita = null;
        }

        public No(int dado) {
            this.dado = dado;
            this.esquerda = null;
            this.direita = null;
        }
}
