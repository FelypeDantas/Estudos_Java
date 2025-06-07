//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import br.inteiro.ArvoreInt;
import br.caractere.ArvoreChar;


import br.inteiro.ArvoreInt;

public class Main {
    public static void main(String[] args) {
        int[] valores = {30, 15, 60, 10, 20, 40, 80};

        ArvoreInt arvore = new ArvoreInt();

        for (int valor : valores) {
            arvore.inserir(valor);
        }

        System.out.println("Atravessamento Pré-Ordem:");
        arvore.exibirPreOrdem();

        System.out.println("Atravessamento Em Ordem:");
        arvore.exibirInOrdem();

        System.out.println("Atravessamento Pós-Ordem:");
        arvore.exibirPosOrdem();

        System.out.println("\n=> O atravessamento EM ORDEM apresenta os dados em ordem crescente.");

        arvore.remover(60);

        System.out.println("\nAtravessamento Em Ordem após remover o 60:");
        arvore.exibirInOrdem();

        System.out.println("========================================================");

        System.out.println("Exercicio 2");

        int[] valores2 = {12, 4, 16, 8, 2, 6};
        for (int valor : valores2) {
            arvore.inserir(valor);
        }

        int nivel = arvore.nivelDoNo(6);
        if (nivel != -1) {
            System.out.println("Nível do nó com valor 6: " + nivel);
        } else {
            System.out.println("Nó com valor 6 não encontrado.");
        }

        System.out.println("\nPós-Ordem antes da remoção de 12:");
        arvore.exibirPosOrdem();

        arvore.remover(12);

        System.out.println("\nPós-Ordem após a remoção de 12:");
        arvore.exibirPosOrdem();
    }
}

