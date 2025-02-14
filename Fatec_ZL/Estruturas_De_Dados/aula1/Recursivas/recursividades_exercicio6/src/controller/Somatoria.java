package controller;

public class Somatoria {

    public Somatoria(){
        super();
    }

    public static int soma(int a, int b) {
        // Condição de parada: Quando o segundo número (b) for 0, a recursão para
        // A soma de qualquer número com 0 é o próprio número, então retornamos "a"
        if (b == 0) {
            return a;
        }

        // Relação de chamada dos passos:
        // Subtraímos 1 de "b" e adicionamos 1 ao número "a" a cada chamada recursiva.
        return soma(a + 1, b - 1);
    }
}

