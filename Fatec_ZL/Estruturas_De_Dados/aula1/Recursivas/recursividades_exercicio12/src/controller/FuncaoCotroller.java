package controller;

public class FuncaoCotroller {

    public FuncaoCotroller(){
        super();
    }

    public static String inverterString(String str) {
        // Condição de parada: se a string for vazia ou tiver apenas um caractere, retorna a própria string
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Passo recursivo: pega o último caractere e concatena com a inversão do restante da string
        return str.substring(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
    }
}
