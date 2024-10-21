package org.example.Unidad2;
import java.util.Scanner;

public class BuclesEjr2 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int i;

        System.out.println("Introduzca un número.");
        i = entrada.nextInt();

        while(i > 1) {
            i--;
            System.out.println(i);
        }
    }
}
