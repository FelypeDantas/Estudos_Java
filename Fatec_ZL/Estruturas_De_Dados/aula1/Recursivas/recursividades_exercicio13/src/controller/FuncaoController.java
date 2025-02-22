package controller;

public class FuncaoController {
    public FuncaoController(){
        super();
    }

    public static String converterParaBinario(int numero) {
        // Condição de parada: quando o número for 0
        if (numero == 0) {
            return "";
        }
        // Passo recursivo: divide o número por 2 e concatena o resto da divisão
        return converterParaBinario(numero / 2) + (numero % 2);
    }
}
