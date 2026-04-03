import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();
        String palavra3 = scanner.nextLine();

        String chave = palavra1 + "-" + palavra2 + "-" + palavra3;

        Map<String, String> animais = new HashMap<>();

        animais.put("vertebrado-ave-carnivoro", "aguia");
        animais.put("vertebrado-ave-onivoro", "pomba");
        animais.put("vertebrado-mamifero-onivoro", "homem");
        animais.put("vertebrado-mamifero-herbivoro", "vaca");
        animais.put("invertebrado-inseto-hematofago", "pulga");
        animais.put("invertebrado-inseto-herbivoro", "lagarta");
        animais.put("invertebrado-anelideo-hematofago", "sanguessuga");
        animais.put("invertebrado-anelideo-onivoro", "minhoca");

        String animal = animais.getOrDefault(chave, "desconhecido");

        System.out.println(animal);
        scanner.close();
    }
}
