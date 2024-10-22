package org.example.Unidad2;
import java.util.Scanner;

public class BuclesEjr7 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int num;
        int resp = 1;
        int res;

        System.out.println("Introduzca un número...");
        num = entrada.nextInt();
        int i = num;

        while(num > 0) {
            resp *= num;
            num--;
        }
        System.out.println("El factorial de " + i + " es: " + resp + ".");
    }
}
