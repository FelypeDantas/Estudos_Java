package view;

import java.util.Scanner;

import static controller.FuncaoController.somaNegativos;

public class Principal {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        int tamanho = sca.nextInt();
        int[] vetor = new int[tamanho];
        int soma = 0;

        for(int contador = 0; contador < vetor.length; contador++){
            vetor[contador] = sca.nextInt();
        }

        System.out.println(somaNegativos(vetor, vetor.length, soma));

    }
}
