import com.felype.sorting.QuickSort;
import com.felype.sorting.BubbleSort;
import com.felype.sorting.MergeSort;

public class Main {
    // Classe principal para testar a ordenação
    public static void main(String[] args) {
        int[] array = new int[1500];
        for (int i = 0; i < 1500; i++) {
            array[i] = 1499 - i;
        }

        int[] arrayBubble = array.clone();
        int[] arrayMerge = array.clone();
        int[] arrayQuick = array.clone();

        System.out.println("Ordenando um vetor de 1500 elementos:");

        long startTime = System.nanoTime();
        BubbleSort.sort(arrayBubble);
        long endTime = System.nanoTime();
        System.out.println("BubbleSort: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        MergeSort.sort(arrayMerge);
        endTime = System.nanoTime();
        System.out.println("MergeSort: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        QuickSort.sort(arrayQuick);
        endTime = System.nanoTime();
        System.out.println("QuickSort: " + (endTime - startTime) / 1e6 + " ms");
    }
}
