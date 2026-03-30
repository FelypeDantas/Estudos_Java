import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teclado {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        List<String> resultados = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            resultados.add(telefone(scn.next()));
        }

        scn.close();

        resultados.forEach(System.out::println);
    }

    public static String telefone(String entrada) {
        StringBuilder resultado = new StringBuilder();

        for (char c : entrada.toCharArray()) {
            resultado.append(mapearChar(c));
        }

        return resultado.toString();
    }

    private static char mapearChar(char c) {
        switch (c) {
            case 'A': case 'B': case 'C': return '2';
            case 'D': case 'E': case 'F': return '3';
            case 'G': case 'H': case 'I': return '4';
            case 'J': case 'K': case 'L': return '5';
            case 'M': case 'N': case 'O': return '6';
            case 'P': case 'Q': case 'R': case 'S': return '7';
            case 'T': case 'U': case 'V': return '8';
            case 'W': case 'X': case 'Y': case 'Z': return '9';
            default: return c; // caso venha algo inesperado
        }
    }
}
