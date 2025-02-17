package view;

import java.util.Scanner;

import controller.Recursividade;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int A = sca.nextInt();
		int B = sca.nextInt();
		int aux = B;
		
		System.out.println("O valor da multiplicação é: " + Recursividade.multiplicaPorSoma(A, B, aux));
		sca.close();

	}

}
