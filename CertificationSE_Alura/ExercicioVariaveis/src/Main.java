import objetos.Estudante;
import objetos.Produto;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================================");
        System.out.println("Exercicio 1\n");
        Estudante Maria = new Estudante("Maria", 25, 1.68, true);
        System.out.println(Maria);

        System.out.println("==================================================================");
        System.out.println("Exercicio 2\n");
        Produto produto = new Produto("Arroz", 12.90, 19.5);
        System.out.println(produto);
    }
}