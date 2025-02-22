package view;

import java.util.Scanner;

import static controller.FuncaoController.somatoriaSS;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular a somatória SS: ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("Somatória SS: " + somatoriaSS(n));
        }
        scanner.close();
    }
}
