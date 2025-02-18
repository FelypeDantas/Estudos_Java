package controller;

public class Recursividade {
	
	public Recursividade() {
		super();
	}
	
	public static int retornoVetorPar(int[] vetor, int tamanho, int resultado) {
		if(tamanho == 0) {
			return resultado;
		} else {
			if(vetor[tamanho] % 2 == 0) {
				resultado = resultado + 1;
			}
			return retornoVetorPar(vetor, tamanho - 1, resultado);
		}
	}
}
