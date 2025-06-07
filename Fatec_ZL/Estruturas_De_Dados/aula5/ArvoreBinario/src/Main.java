//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import br.inteiro.ArvoreInt;
import br.caractere.ArvoreChar;

public class Main {
    public static void main(String[] args) {
        int[] valores = {33, 15, 41, 38, 47, 34, 49, 43};

        ArvoreInt arvore = new ArvoreInt();

        for (int valor : valores) {
            arvore.inserir(valor);
        }

        System.out.println("Exercicio 2");

        System.out.print("Pré-ordem: ");
        arvore.exibirPreOrdem();
        System.out.println("\n");

        System.out.print("In-ordem: ");
        arvore.exibirInOrdem();
        System.out.println("\n");

        System.out.print("Pós-ordem: ");
        arvore.exibirPosOrdem();
        System.out.println("\n");

        System.out.println("=============================================================");

        String[] letras = {"M", "F", "S", "D", "J", "P", "U", "A", "E", "H", "Q", "T", "W", "K"};

        ArvoreChar arvoreChar = new ArvoreChar();

        for (String letra : letras) {
            arvoreChar.inserir(letra);
        }

        System.out.println("Exercicio 3");

        arvoreChar.remover("F");
        arvoreChar.remover("U");

        System.out.println("Pré-ordem:");
        arvoreChar.exibirPreOrdem();

        System.out.println("In-ordem:");
        arvoreChar.exibirInOrdem();

        System.out.println("Pós-ordem:");
        arvoreChar.exibirPosOrdem();

        System.out.println("=============================================================");

        System.out.println("Exercicio 4");

        int[] valores2 = {7, 8, 3, 4, 2, 1, 6, 5};


            for (int valor : valores2) {
                arvore.inserir(valor);
            }

            arvore.remover(7);
            arvore.remover(6);

            System.out.println("Pré-ordem:");
            arvore.exibirPreOrdem();

            System.out.println("In-ordem:");
            arvore.exibirInOrdem();

            System.out.println("Pós-ordem:");
            arvore.exibirPosOrdem();
    }
}
