import java.util.ArrayList;
import java.util.Collections;

public class Exercico3 {

	public static void main(String[] args) {
		 ArrayList<Integer> L = new ArrayList<>();
	        L.add(3);
	        L.add(5);
	        L.add(8);
	        L.add(12);
	        L.add(9);
	        L.add(7);
	        L.add(16);

	        // Exibe a lista original
	        System.out.println("Lista original: " + L);

	        // b) Ordenar a lista usando Collections.sort()
	        Collections.sort(L);

	        // Exibe a lista ordenada
	        System.out.println("Lista ordenada: " + L);

	}

}
