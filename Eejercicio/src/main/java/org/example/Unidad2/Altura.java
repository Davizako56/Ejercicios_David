package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Altura {

    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        int a = 0;
        boolean err = true;

        while (err == true) {
            try {
                System.out.println("Introduzca su altura...");
                a = entrada.nextInt();
                err = false;
            }catch (InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        if(a <= 150) {
            System.out.println("Persona de altura baja.");
        }else if(a >= 151 && a <= 175) {
            System.out.println("Persona de altura media");
        }else if(a > 175) {
            System.out.println("Persona alta");
        }
    }
}
