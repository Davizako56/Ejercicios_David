package org.example;
import java.util.Scanner;
public class Ejercicio2 {
    public void ejecuter() {
        System.out.println("Introudce un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.println("Introduce segundo numero");
        int numero2 = entrada.nextInt();
        if (numero == numero2) {
            System.out.println("ERROR: los numeros introducidos son iguales");
        } else {
            if (numero > numero2) {
                System.out.println("El primer número es el mayor");
            } else {
                System.out.println("El segundo número es el mayor");


            }

        }
    }
}

