package org.example.Unidad2;
import java.util.Scanner;
import java.util.Random;

public class Ejr1Random {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int dado = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        System.out.println("El primer dado es: " + dado + ".");
        System.out.println("El segundo dado es: " + dado2 + ".");

        int total = dado + dado2;

        System.out.println("Has sacado en total un " + total + ".");

    }
}
