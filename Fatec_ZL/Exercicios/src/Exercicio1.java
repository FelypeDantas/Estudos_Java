import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int valor = sca.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O número " + valor + " é par");
		} else {
			System.out.println("O número " + valor + " é impar");
		}
		
		sca.close();
	}

}
