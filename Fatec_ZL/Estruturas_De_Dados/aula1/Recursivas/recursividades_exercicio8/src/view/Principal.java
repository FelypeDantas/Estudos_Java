package view;

import java.util.Scanner;

import controller.Recursividade;

public class Principal {

	public static void main(String[] args) {
//		2. Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por
//		subtra��es, exiba o resto da divis�o. Os n�meros de entrada devem ser n�meros inteiros.

		Scanner sca = new Scanner(System.in);
		int valor1 = sca.nextInt();
		int valor2 = sca.nextInt();
		
		System.out.println("O resto da divis�o �: " + Recursividade.divisaoPorSubtracao(valor1, valor2));
		sca.close();
	}

}
