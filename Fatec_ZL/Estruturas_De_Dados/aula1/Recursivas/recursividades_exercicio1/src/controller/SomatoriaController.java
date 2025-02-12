package controller;

public class SomatoriaController {

    public SomatoriaController() {
        super();
    }

    public static int somatoria(int tamanho) {
        // se o N for igual ao tamanho
        if(tamanho <= 0) {
            return 0;
        } else {
            return tamanho + somatoria(tamanho- 1);
        }
    }
}
