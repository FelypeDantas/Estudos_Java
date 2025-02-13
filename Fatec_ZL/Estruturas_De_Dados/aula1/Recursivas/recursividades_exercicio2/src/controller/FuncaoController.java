package controller;

public class FuncaoController {

    public FuncaoController() {
        super();
    }

    public static int verificaMenor(int[] vetor, int tamanho, int ultimaPosicao) {
        // Caso base: quando tamanho é 0, significa que estamos na última posição
        if (tamanho < 0) {
            return ultimaPosicao;
        } else {
            if (vetor[tamanho] < vetor[ultimaPosicao]) {
                ultimaPosicao = tamanho; // Atualiza a última posição com o menor valor encontrado
            }
            // Chama a recursão para o próximo elemento
            return verificaMenor(vetor, tamanho - 1, ultimaPosicao);
        }
    }
}
