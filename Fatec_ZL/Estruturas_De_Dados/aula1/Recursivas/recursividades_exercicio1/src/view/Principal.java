package view;

import controller.SomatoriaController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        int valor = sca.nextInt();
        System.out.println(SomatoriaController.somatoria(valor));
        sca.close();
    }
}
