package view;

import java.util.Scanner;

import static controller.FuncaoController.fibonacci;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a posição na série de Fibonacci (até 20): ");
        int posicao = scanner.nextInt();
        if (posicao > 0 && posicao <= 20) {
            System.out.println("Valor da posição " + posicao + " na série de Fibonacci: " + fibonacci(posicao));
        }
        scanner.close();
    }
}
