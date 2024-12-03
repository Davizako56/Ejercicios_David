package org.example.Unidad3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class asListEjr1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String color[] = {"rojo", "negro"};
        Integer num[] = new Integer[37];
        String val[] = {"par", "impar"};
        int mun;
        String col;
        String lav;

        for (int i = 0; i < 37; i++) {
            num[i] = i;
        }

        System.out.println("Introduzca un número...");
        mun = entrada.nextInt();

        if (Arrays.asList(num).contains(mun)) {

            if (mun == 0) {
                System.out.println("ERROR");
                return;
            }
            System.out.println("Introduce un color...");
            col = entrada.next();

            if (Arrays.asList(color).contains(col.toLowerCase())) {
                System.out.println("Introduce par/impar...");
                lav = entrada.next();

                if (Arrays.asList(val).contains(lav.toLowerCase())) {

                }
            }else{
                System.out.println("ERROR");
                return;
            }


        }else{
            System.out.println("ERROR");
            return;
        }

    }
}
