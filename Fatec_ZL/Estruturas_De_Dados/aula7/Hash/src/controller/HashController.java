package controller;

public class HashController {
	
    static int M = 6;
    static double A = Math.sqrt(7) / 2;

    public static int hashDivisao(int key) {
        return key % M;
    }

    public static int hashMultiplicacao(int key) {
        double frac = (key * A) % 1;
        return (int) Math.floor(M * frac);
    }

}
