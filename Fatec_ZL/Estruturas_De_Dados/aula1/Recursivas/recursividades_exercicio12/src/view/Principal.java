package view;

import java.util.Scanner;

import static controller.FuncaoCotroller.inverterString;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();
            String resultado = inverterString(entrada);
            System.out.println("Entrada: " + entrada);
            System.out.println("Saída: " + resultado);
            scanner.close();
        }
}
