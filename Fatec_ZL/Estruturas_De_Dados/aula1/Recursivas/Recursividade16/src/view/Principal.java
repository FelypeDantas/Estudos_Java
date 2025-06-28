package view;

import controller.Controller;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args){

        Controller controller = new Controller();

        Scanner sca = new Scanner(System.in);

        System.out.println("Informe o dividendo: ");
        int dividendo = sca.nextInt();

        System.out.println("Informe o divisor: ");
        int divisor = sca.nextInt();

        int resultado = controller.divisao(dividendo, divisor);

        System.out.println(resultado);
    }
}
