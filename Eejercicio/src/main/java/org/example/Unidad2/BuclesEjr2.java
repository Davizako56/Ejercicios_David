package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BuclesEjr2 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        boolean err = true;

        while(err == true) {

            try {
                System.out.println("Introduzca un número.");
                i = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        while(i > 1) {
            i--;
            System.out.println(i);
        }
    }
}
