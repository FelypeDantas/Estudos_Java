package view;

import java.util.Scanner;

import static controller.Somatoria.soma;

public class Principal {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int numero1 = sca.nextInt();
        int numero2 = sca.nextInt();

        System.out.println(soma(numero1, numero2));
    }
}
