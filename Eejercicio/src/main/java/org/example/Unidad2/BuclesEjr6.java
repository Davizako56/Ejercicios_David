package org.example.Unidad2;
import java.util.Scanner;

public class BuclesEjr6 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int num;
        int i = 1;
        int valor;
        int res = 0;

        System.out.println("¿Cuantos números quieres sumar?");
        num = entrada.nextInt();

        while(i <= num) {
            System.out.println("Inserta nº" + i + ":");
            valor = entrada.nextInt();
            res += valor;
            i++;
        }
        System.out.println("El resultado es: " + res + ".");
    }
}
