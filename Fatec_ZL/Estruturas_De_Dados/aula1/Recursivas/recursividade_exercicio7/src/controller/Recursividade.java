package controller;

public class Recursividade {

	public static int multiplicaPorSoma(int A, int B, int aux) {
		if(aux == 0) {
			return 0;
		} else {
			return A + multiplicaPorSoma(A, B, aux - 1);
		}
	}
}
