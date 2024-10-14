package org.example.Unidad2;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {

    }

    public static void ejecuter() {

        Scanner entrada = new Scanner(System.in);
        String numero;
        int dividendo = 0;

        System.out.println("Introduce un numero...");
        numero = entrada.next();

        if (entrada.hasNextInt()) {
            System.out.println("Introduce el dividendo:");
            dividendo = entrada.nextInt();
        } else {
            System.out.println("ERROR: El formato no es numérico.");
        }

        int num_entero = 0;
        int division = 0;

    }
}
