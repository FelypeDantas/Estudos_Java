package view;

import controller.SomatoriaController;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            int resultado = SomatoriaController.somatoria(numero);
            System.out.println("Resultado da somatória: " + resultado);
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}
