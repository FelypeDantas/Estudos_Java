import java.util.ArrayList;
import java.util.Collections;

public class OrdenaLista {
    public static void main(String[] args) {
        // a) Criar e inicializar a lista L
        ArrayList<Integer> L = new ArrayList<>();
        L.add(10);
        L.add(5);
        L.add(8);
        L.add(1);
        L.add(9);
        L.add(2);
        L.add(4);
        L.add(7);
        L.add(3);
        L.add(6);

        // Exibe a lista original
        System.out.println("Lista original: " + L);

        // b) Ordenar a lista usando Collections.sort()
        Collections.sort(L);

        // Exibe a lista ordenada
        System.out.println("Lista ordenada: " + L);
    }
}

