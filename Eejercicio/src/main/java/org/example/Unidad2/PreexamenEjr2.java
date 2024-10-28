package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PreexamenEjr2 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int num = 1;
        int exp = 0;
        int i;
        int res = num;
        boolean err = true;
        boolean sol = true;

        while (err) {
            try {
                System.out.println("Introduce un número...");
                num = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er){
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        while (sol) {
            try {
                System.out.println("Introduce el exponente...");
                exp = entrada.nextInt();
                sol = false;
            }catch(InputMismatchException so) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        for (i = 1; i <= exp; i++) {
            res = res *= num;
        }
        System.out.println("El resultado es: " + res + ".");
    }
}
