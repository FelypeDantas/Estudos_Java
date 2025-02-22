package view;

import java.util.Scanner;

import static controller.FuncaoController.funcao;

public class Principal {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        int numero = sca.nextInt();


        System.out.println(funcao(Math.abs(numero)));
    }
}
