package org.example.Unidad2;
import java.util.Scanner;
import java.util.Random;

public class Ejr3Random {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int i;
        int cant;
        int min;
        int max;
        String num = "0123456789";

        System.out.println("¿Cual será el número mínimo?");
        min = entrada.nextInt();
        System.out.println("¿Cual será el número máximo?");
        max = entrada.nextInt();
        System.out.println("¿Cuantos números aleatorios quieres?");
        cant = entrada.nextInt();

        for (i = 0; i < cant; i++) {

            int rnd = random.nextInt(min,max + 1);
            String code = num.substring(rnd,rnd + 1);
            System.out.print(code);
        }
    }
}
