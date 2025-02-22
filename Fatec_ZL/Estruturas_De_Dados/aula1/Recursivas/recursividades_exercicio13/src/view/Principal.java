package view;

import java.util.Scanner;

import static controller.FuncaoController.converterParaBinario;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número até 2000 para converter em binário: ");
        int numero = scanner.nextInt();
        if (numero >= 0 && numero <= 2000) {
            System.out.println("Binário: " + converterParaBinario(numero));
        }

    }
}
