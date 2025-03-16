import com.felype.sorting.QuickSort;

import static com.felype.sorting.QuickSort.sort;

public class Main {
    // Classe principal para testar a ordenação
    public static void main(String[] args) {
        int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
        int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};

        System.out.println("Vetor 1 antes da ordenação:");
        printArray(vetor1);
        sort(vetor1);
        System.out.println("Vetor 1 após a ordenação:");
        printArray(vetor1);

        System.out.println("\nVetor 2 antes da ordenação:");
        printArray(vetor2);
        sort(vetor2);
        System.out.println("Vetor 2 após a ordenação:");
        printArray(vetor2);

        System.out.println("\nVetor 3 antes da ordenação:");
        printArray(vetor3);
        sort(vetor3);
        System.out.println("Vetor 3 após a ordenação:");
        printArray(vetor3);
    }

    // Método auxiliar para imprimir um array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
