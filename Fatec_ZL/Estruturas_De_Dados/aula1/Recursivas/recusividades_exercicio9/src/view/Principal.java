package view;

import java.util.Scanner;

import controller.Recursividade;

public class Principal {

	public static void main(String[] args) {
//		3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de
//		números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
//		diferentes de zero.
		Scanner sca = new Scanner(System.in);
		
		
		System.out.print("Insira o tamanho do vetor: ");
		int tamanho = sca.nextInt();
		int vetor[] = new int[tamanho];
		int resultado = 0;
		
		for(int contador = 0; contador < vetor.length; contador++) {
			vetor[contador] = sca.nextInt();
		}
		System.out.println("Os pares são: " + Recursividade.retornoVetorPar(vetor, vetor.length - 1, resultado));
		sca.close();
		
	}

}
