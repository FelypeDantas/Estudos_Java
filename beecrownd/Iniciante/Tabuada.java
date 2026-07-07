import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        while (numero < 2 || numero > 1000) {
            System.out.print("Digite um valor entre 2 e 1000: ");
            numero = scanner.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, numero, i * numero);
        }

        scanner.close();
    }
}
