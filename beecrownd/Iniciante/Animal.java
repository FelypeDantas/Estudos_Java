import java.util.Map;
import java.util.Scanner;

public class Animal {

    private static final Map<String, String> ANIMAIS = Map.of(
        "vertebrado-ave-carnivoro", "aguia",
        "vertebrado-ave-onivoro", "pomba",
        "vertebrado-mamifero-onivoro", "homem",
        "vertebrado-mamifero-herbivoro", "vaca",
        "invertebrado-inseto-hematofago", "pulga",
        "invertebrado-inseto-herbivoro", "lagarta",
        "invertebrado-anelideo-hematofago", "sanguessuga",
        "invertebrado-anelideo-onivoro", "minhoca"
    );

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String chave = String.join("-",
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine()
            );

            System.out.println(
                ANIMAIS.getOrDefault(chave, "desconhecido")
            );
        }
    }
}
