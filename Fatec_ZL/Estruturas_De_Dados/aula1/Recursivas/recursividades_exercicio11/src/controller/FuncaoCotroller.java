package controller;

public class FuncaoCotroller {

    public FuncaoCotroller(){
        super();
    }

    public static int contarOcorrencias(int numero, int digito) {
        // Condição de parada: se o número for 0, não há mais dígitos para contar
        if (numero == 0) {
            return 0;
        }

        // Obtendo o último dígito do número
        int ultimoDigito = numero % 10;

        // Verificando se o último dígito é igual ao dígito buscado
        if (ultimoDigito == digito) {
            return 1 + contarOcorrencias(numero / 10, digito);
        } else {
            return contarOcorrencias(numero / 10, digito);
        }
    }

}
