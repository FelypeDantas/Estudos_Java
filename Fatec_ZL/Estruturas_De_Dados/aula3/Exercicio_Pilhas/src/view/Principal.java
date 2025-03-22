package view;

import controller.ConverteController;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverteController conversor = new ConverteController();

        System.out.print("Digite um número decimal (até 1000): ");
        int decimal = scanner.nextInt();

        if (decimal < 0 || decimal > 1000) {
            System.out.println("Número inválido! Digite um número entre 0 e 1000.");
        } else {
            String binario = conversor.decToBin(decimal);
            System.out.println("Binário: " + binario);
        }

        scanner.close();
    }
}

