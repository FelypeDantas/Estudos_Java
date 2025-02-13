package view;

import static controller.FatorialController.factorial;

public class Principal {
    public static void main(String[] args) {

        for(int counter = 0; counter <= 12; counter++) {
            System.out.printf("%d! = %d%n", counter , factorial(counter));
        }

    }
}
