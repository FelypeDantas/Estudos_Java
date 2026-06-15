import java.util.Map;
import java.util.Scanner;

public class Animal {

    private static final Map<String, String> ANIMAIS = Map.ofEntries(
        Map.entry("vertebrado-ave-carnivoro", "aguia"),
        Map.entry("vertebrado-ave-onivoro", "pomba"),
        Map.entry("vertebrado-mamifero-onivoro", "homem"),
        Map.entry("vertebrado-mamifero-herbivoro", "vaca"),
        Map.entry("invertebrado-inseto-hematofago", "pulga"),
        Map.entry("invertebrado-inseto-herbivoro", "lagarta"),
        Map.entry("invertebrado-anelideo-hematofago", "sanguessuga"),
        Map.entry("invertebrado-anelideo-onivoro", "minhoca")
    );

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String classificacao = lerClassificacao(scanner);
            System.out.println(buscarAnimal(classificacao));
        }
    }

    private static String lerClassificacao(Scanner scanner) {
        return String.join("-",
                scanner.nextLine().trim(),
                scanner.nextLine().trim(),
                scanner.nextLine().trim()
        );
    }

    private static String buscarAnimal(String classificacao) {
        return ANIMAIS.getOrDefault(classificacao, "desconhecido");
    }
}
