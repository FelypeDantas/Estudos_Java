import br.sp.fatec.BubbleSort;
import br.sp.fatec.MergeSort;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] array = {44, 43, 42, 41, 40, 39, 38};

        // Testando BubbleSort
        int[] bubbleArray = array.clone();
        BubbleSort.sort(bubbleArray);
        System.out.println("Bubble Sort:");
        for (int num : bubbleArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Testando MergeSort
        int[] mergeArray = array.clone();
        MergeSort.sort(mergeArray);
        System.out.println("Merge Sort:");
        for (int num : mergeArray) {
            System.out.print(num + " ");
        }
    }
}