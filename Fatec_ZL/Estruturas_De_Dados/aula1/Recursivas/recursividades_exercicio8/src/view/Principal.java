package view;

import java.util.Scanner;

import controller.Recursividade;

public class Principal {

	public static void main(String[] args) {
//		2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
//		subtrações, exiba o resto da divisão. Os números de entrada devem ser números inteiros.

		Scanner sca = new Scanner(System.in);
		int valor1 = sca.nextInt();
		int valor2 = sca.nextInt();
		
		System.out.println("O resto da divisão é: " + Recursividade.divisaoPorSubtracao(valor1, valor2));
		sca.close();
	}

}
