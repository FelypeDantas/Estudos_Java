package controller;

public class FuncaoController {

    public static int somaNegativos(int[] vetor, int tamanho, int soma){
        // condição de parada: caso o vetor tenha acabado tamanho == 0;
        if(tamanho == 0){
            return soma;
        } else {
            if(vetor[tamanho - 1] < 0){
                soma += vetor[tamanho - 1];
            }
            // chama a recursão para o próximo índice
            return somaNegativos(vetor, tamanho - 1, soma);
        }
    }

}
