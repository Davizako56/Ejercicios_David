package org.example.Unidad2;
import java.util.Scanner;

public class BuclesEjr4 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        String palabra;
        int anch = 0;
        int x = 0;
        int y = 1;

        System.out.println("Introduce una palabra.");
        palabra = entrada.nextLine();
        int pal = palabra.length();

        while (anch < pal) {
            anch++;
            String p1 = palabra.substring(x,y);
            System.out.println(p1);
            x++;
            y++;
        }

    }
}
