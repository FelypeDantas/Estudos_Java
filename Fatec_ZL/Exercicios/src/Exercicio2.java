import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		double nota1 = sca.nextDouble();
		double nota2 = sca.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.println("O estudante teve m�dia " + media + " e foi aprovado.");
		} else if(media >= 5.0 && media <= 6.9) {
			System.out.println("O estudante teve m�dia " + media + " e est� de recupera��o.");
		} else if (media <= 5.0) {
			System.out.println("O estudante teve m�dia " + media + " e foi reprovado. ");
		} else {
			System.out.println("N�o d� para lan�ar essa nota.");
		}

		sca.close();
	}

}
