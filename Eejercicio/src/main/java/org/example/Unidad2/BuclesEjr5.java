package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BuclesEjr5 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int mul = 1;
        boolean err = true;

        while(err == true) {

            try {
                System.out.println("Introduzca un número...");
                num = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        System.out.println("Aquí tiene la tabla de multiplicar de " + num + ":");

        while (mul <= 10) {
            int res = num * mul;
            System.out.println(num + " * " + mul + " = " + res);
            mul++;
        }
    }
}
