package org.example.Unidad2;
import java.util.Scanner;
import java.util.Random;

public class Ejr2Random {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int rang = random.nextInt(6,9);

        int i;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (i = 0; i < rang; i++) {

            int num = random.nextInt(0,61);
            String code = caracteres.substring(num,num + 1);
            System.out.print(code);
        }




    }
}
