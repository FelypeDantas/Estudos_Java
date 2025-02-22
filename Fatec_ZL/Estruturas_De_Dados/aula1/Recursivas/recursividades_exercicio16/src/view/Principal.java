package view;

import java.util.Scanner;

import static controller.FuncaoController.somaDosDigitos;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para somar os dígitos: ");
        int numSoma = scanner.nextInt();
        System.out.println("Soma dos dígitos: " + somaDosDigitos(numSoma));

        scanner.close();
    }
}
