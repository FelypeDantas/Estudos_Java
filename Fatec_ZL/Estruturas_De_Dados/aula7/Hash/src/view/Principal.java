package view;

import java.util.*;

import controller.HashController;

public class Principal {

	public static void main(String[] args) {
		
	       int[] keys = {966, 763, 772, 818, 188, 968, 419, 583, 414, 484, 805, 19, 273, 824, 738, 373, 301, 996, 203, 387, 313, 925, 256};
	       int M = 6;

	        @SuppressWarnings("unchecked")
			List<Integer>[] tabelaDivisao = new ArrayList[M];
	        @SuppressWarnings("unchecked")
			List<Integer>[] tabelaMultiplicacao = new ArrayList[M];

	        for (int i = 0; i < M; i++) {
	            tabelaDivisao[i] = new ArrayList<>();
	            tabelaMultiplicacao[i] = new ArrayList<>();
	        }

	        for (int key : keys) {
	            tabelaDivisao[HashController.hashDivisao(key)].add(key);
	            tabelaMultiplicacao[HashController.hashMultiplicacao(key)].add(key);
	        }

	        System.out.println("Tabela Hash - Método da Divisão:");
	        for (int i = 0; i < M; i++) {
	            System.out.println("Posição " + i + ": " + tabelaDivisao[i]);
	        }

	        System.out.println("\nTabela Hash - Método da Multiplicação:");
	        for (int i = 0; i < M; i++) {
	            System.out.println("Posição " + i + ": " + tabelaMultiplicacao[i]);
	        }

	}

}
