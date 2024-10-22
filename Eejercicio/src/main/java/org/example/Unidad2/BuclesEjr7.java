package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BuclesEjr7 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int resp = 1;
        int res;
        boolean er = true;

        while(er == true) {

            try {
                System.out.println("Introduzca un número...");
                num = entrada.nextInt();
                er = false;
            }catch(InputMismatchException err) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        while(num > 0) {
            resp *= num;
            num--;
        }
        System.out.println("El factorial es: " + resp + ".");
    }
}
