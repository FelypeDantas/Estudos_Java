import br.sp.fatec.BubbleSort;
import br.sp.fatec.MergeSort;

public class Exercicio1 {
        public static void main(String[] args) {
            int[] array = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};

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
