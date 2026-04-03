package maratona;

import java.util.Arrays;
import java.util.Scanner;

public class Calcetis {

    private static final int FRETE_GRATIS_VALOR = 200;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int valorAtual = scanner.nextInt();
            int quantidade = scanner.nextInt();

            int[] precos = new int[quantidade];
            for (int i = 0; i < quantidade; i++) {
                precos[i] = scanner.nextInt();
            }

            boolean temCombinacao = podeFreteGratis(valorAtual, precos);

            System.out.println(temCombinacao ? "fretegratis" : "fretepago");
        }
    }

    private static boolean podeFreteGratis(int valorAtual, int[] precos) {
        Arrays.sort(precos);
        int alvo = FRETE_GRATIS_VALOR - valorAtual;

        for (int i = 0; i < precos.length - 2; i++) {
            int left = i + 1;
            int right = precos.length - 1;

            while (left < right) {
                int soma = precos[i] + precos[left] + precos[right];

                if (soma == alvo) {
                    return true;
                } else if (soma < alvo) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}
