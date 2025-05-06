import java.util.ArrayList;

public class Exercicio5 {

    public static void main(String[] args) {
        // Inicializando as listas A e B
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(5);
        A.add(8);
        A.add(12);
        A.add(9);
        A.add(7);
        A.add(16);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(9);
        B.add(6);
        B.add(2);
        B.add(3);
        B.add(7);

        // Gerar e imprimir a interseção e união
        ArrayList<Integer> interseccao = intersecao(A, B);
        ArrayList<Integer> uniao = uniao(A, B);

        System.out.println("Interseção (I) de A e B: " + interseccao);
        System.out.println("União (U) de A e B: " + uniao);
    }

    // Método para gerar a interseção de duas listas
    public static ArrayList<Integer> intersecao(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> I = new ArrayList<>();

        // Percorrer a lista A e verificar se o elemento está na lista B
        for (Integer a : A) {
            if (B.contains(a) && !I.contains(a)) {  // Adiciona a interseção sem duplicar
                I.add(a);
            }
        }
        return I;
    }

    // Método para gerar a união de duas listas
    public static ArrayList<Integer> uniao(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> U = new ArrayList<>(A);  // Começa com os elementos de A

        // Adiciona os elementos de B se não estiverem presentes em U
        for (Integer b : B) {
            if (!U.contains(b)) {
                U.add(b);
            }
        }
        return U;
    }
}

