package controller;

public class FuncaoController {
    public FuncaoController(){
        super();
    }

    public static int somaDosDigitos(int numero) {
        // Condição de parada: se o número for 0, retorna 0
        if (numero == 0) {
            return 0;
        }
        // Passo recursivo: soma o último dígito ao resultado da chamada recursiva com o número sem o último dígito
        return (numero % 10) + somaDosDigitos(numero / 10);
    }
}
