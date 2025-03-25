package controller;

import java.util.Stack;

public class FatController {

    public long fatorial(int valor) {
        Stack<Integer> pilha = new Stack<>(); 

        // Empilhando os valores de 1 até o valor de entrada
        for (int i = 1; i <= valor; i++) {
            pilha.push(i);
        }

        long resultado = 1;
        
        while (!pilha.isEmpty()) {
            resultado *= pilha.pop();
        }

        return resultado;
    }
}

