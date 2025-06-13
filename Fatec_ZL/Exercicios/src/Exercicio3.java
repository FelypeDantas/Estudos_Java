import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int senha = sca.nextInt();
		
		if(senha == 123456) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
		
		sca.close();

	}

}
