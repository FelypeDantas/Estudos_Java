package controller;

public class FuncaoController {

    public FuncaoController(){
        super();
    }

    public static double somas(int valor, int  sequencia){
        if(sequencia == valor){
            return 0;
        } else {
            return 1.0 / sequencia + (double) somas(valor, sequencia + 1);
        }
    }

}
