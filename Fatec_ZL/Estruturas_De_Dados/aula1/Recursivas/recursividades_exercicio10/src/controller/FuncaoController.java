package controller;

public class FuncaoController {

    public FuncaoController(){
        super();
    }

    public static int funcao(int numero){
        if(numero < 10){
            return 1;
        } else {
            return 1 + funcao((int) numero / 10);
        }
    }
}
