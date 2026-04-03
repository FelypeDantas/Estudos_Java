package controller;

public class SomatoriaController {

    // Método recursivo para calcular a somatória de 1 até N
    public static int somatoria(int n) {
        if (n <= 0) {
            return 0; // caso base
        }

        return n + somatoria(n - 1);
    }
}
