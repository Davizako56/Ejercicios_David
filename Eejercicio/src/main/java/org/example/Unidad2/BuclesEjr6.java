package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BuclesEjr6 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int i = 1;
        int valor;
        int res = 0;
        boolean err = true;

        while(err == true) {

            try {
                System.out.println("¿Cuantos números quieres sumar?");
                num = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        while(i <= num) {
            System.out.println("Inserta nº" + i + ":");
            valor = entrada.nextInt();
            res += valor;
            i++;
        }
        System.out.println("El resultado es: " + res + ".");
    }
}
