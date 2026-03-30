import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();
        String palavra3 = scanner.nextLine();

        String chave = palavra1 + "-" + palavra2 + "-" + palavra3;
        String animal;

        switch (chave) {
            case "vertebrado-ave-carnivoro":
                animal = "aguia";
                break;
            case "vertebrado-ave-onivoro":
                animal = "pomba";
                break;
            case "vertebrado-mamifero-onivoro":
                animal = "homem";
                break;
            case "vertebrado-mamifero-herbivoro":
                animal = "vaca";
                break;
            case "invertebrado-inseto-hematofago":
                animal = "pulga";
                break;
            case "invertebrado-inseto-herbivoro":
                animal = "lagarta";
                break;
            case "invertebrado-anelideo-hematofago":
                animal = "sanguessuga";
                break;
            case "invertebrado-anelideo-onivoro":
                animal = "minhoca";
                break;
            default:
                animal = "desconhecido";
        }

        System.out.println(animal);
        scanner.close();
    }
}
