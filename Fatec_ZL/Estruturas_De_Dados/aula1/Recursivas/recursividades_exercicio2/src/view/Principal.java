package view;

import controller.FuncaoController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        // Lê o tamanho do vetor
        int tamanho = sca.nextInt();
        int[] vetor = new int[tamanho];

        for (int contador = 0; contador < vetor.length; contador++) {
            vetor[contador] = sca.nextInt();
        }

        int menorPosicao = FuncaoController.verificaMenor(vetor, vetor.length - 1, vetor.length - 1);
        System.out.println(vetor[menorPosicao]);

        sca.close();
    }
}
