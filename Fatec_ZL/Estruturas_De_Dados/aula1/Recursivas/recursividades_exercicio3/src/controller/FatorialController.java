package controller;

public class FatorialController {

    public static long factorial(int counter) {
        if(counter <= 1) {
            return 1;

        } else {
            return counter * factorial(counter - 1);
        }
    }
}
