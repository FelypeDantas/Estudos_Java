package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = -1;

        while (valor < 0 || valor > 10) {
            System.out.print("Digite um valor inteiro entre 0 e 10: ");
            valor = scanner.nextInt();
            if (valor < 0 || valor > 10) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        FatController controller = new FatController();
        long resultado = controller.fatorial(valor);

        // Exibir o resultado
        System.out.println("O fatorial de " + valor + " é: " + resultado);
        scanner.close();
    }
}

