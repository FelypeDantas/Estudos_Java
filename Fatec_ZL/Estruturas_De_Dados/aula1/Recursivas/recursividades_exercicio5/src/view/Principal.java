package view;

import java.util.Scanner;

import static controller.FuncaoController.somas;

public class Principal {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        int valor = sca.nextInt();

        System.out.println(somas(valor, 1));
    }
}
