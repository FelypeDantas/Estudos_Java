import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = sca.nextInt();
		System.out.print("Digite o primeiro n�mero: ");
		int numero2 = sca.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior n�mero � " + numero1 + ".");
		} else {
			System.out.println("O maior n�mero � " + numero2 + ".");
		}
		sca.close();

	}

}
