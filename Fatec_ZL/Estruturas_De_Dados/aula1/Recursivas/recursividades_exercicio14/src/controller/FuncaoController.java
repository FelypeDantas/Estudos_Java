package controller;

public class FuncaoController {
    public FuncaoController(){
        super();
    }

    // Função recursiva para calcular Fibonacci
    public static int fibonacci(int n) {
        // Condição de parada: os dois primeiros termos da série são 1
        if (n == 1 || n == 2) {
            return 1;
        }
        // Passo recursivo: soma dos dois termos anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
