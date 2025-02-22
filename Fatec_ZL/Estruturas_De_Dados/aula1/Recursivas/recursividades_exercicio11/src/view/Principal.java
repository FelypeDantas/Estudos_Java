package view;

import java.util.Scanner;

import static controller.FuncaoCotroller.contarOcorrencias;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e valida a entrada do usuário
        int numero;
        do {
            System.out.print("Digite um número entre 10 e 999999: ");
            numero = scanner.nextInt();
        } while (numero < 10 || numero > 999999);

        int digito;
        do {
            System.out.print("Digite um dígito entre 0 e 9: ");
            digito = scanner.nextInt();
        } while (digito < 0 || digito > 9);

        // Chama a função recursiva e exibe o resultado
        int ocorrencias = contarOcorrencias(numero, digito);
        System.out.println("O dígito " + digito + " aparece " + ocorrencias + " vezes no número " + numero);

        scanner.close();
    }
}
