package controller;

public class Recursividade {
	
	public Recursividade() {
		super();
	}
	
		public static int divisaoPorSubtracao(int valor1, int valor2) {
			if(valor1 < valor2) {
				return valor1;
			} else {
				valor1 = valor1 - valor2;
				return divisaoPorSubtracao(valor1, valor2);
			}
		}
}
