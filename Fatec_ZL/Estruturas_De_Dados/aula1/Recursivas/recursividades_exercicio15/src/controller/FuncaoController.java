package controller;

public class FuncaoController {
    public FuncaoController(){
        super();
    }

    public static double somatoriaSS(int n) {
        // Condição de parada: quando n for 1
        if (n == 1) {
            return 1.0;
        }
        // Passo recursivo: 1/n! + chamada recursiva para (n-1)
        return (1.0 / fatorial(n)) + somatoriaSS(n - 1);
    }

    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
