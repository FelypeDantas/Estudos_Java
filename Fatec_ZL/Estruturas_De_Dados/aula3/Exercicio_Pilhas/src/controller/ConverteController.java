package controller;

import model.PilhaInt;

public class ConverteController {

    public String decToBin(int decimal) {
        if (decimal < 0) {
            throw new IllegalArgumentException("O número deve ser positivo.");
        }

        PilhaInt pilha = new PilhaInt();

        // Empilha os restos da divisão por 2
        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.empilhar(resto);
            decimal /= 2;
        }

        // Monta o número binário desempilhando
        StringBuilder binario = new StringBuilder();
        while (!pilha.estaVazia()) {
            binario.append(pilha.desempilhar());
        }

        return !binario.isEmpty() ? binario.toString() : "0"; // Retorna "0" se for decimal 0
    }
}
