import java.util.Arrays;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] lados = {
            scanner.nextDouble(),
            scanner.nextDouble(),
            scanner.nextDouble()
        };

        Arrays.sort(lados);

        double a = lados[2];
        double b = lados[1];
        double c = lados[0];

        double a2 = a * a;
        double soma = (b * b) + (c * c);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a2 == soma) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a2 > soma) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
