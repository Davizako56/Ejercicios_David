package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PreexamenEjr4 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int nota = 0;
        boolean err = true;
        boolean sol = true;

        while(err) {
            try{
                System.out.println("Introduzca su nota...");
                nota = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }
        while(sol) {
            try {
                while(nota < 0 || nota > 10) {
                    System.out.println("Tu nota no es válida");
                    System.out.println("Introduzca tu nota...");
                    nota = entrada.nextInt();
                }
                sol = false;
            }catch(InputMismatchException so) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        if(nota <= 4) {
           System.out.println("Tu nota es " + nota + ", es insuficiente.");
        }
        if(nota == 5) {
            System.out.println("Tu nota es " + nota + ", es suficiente.");
        }
        if(nota == 6) {
            System.out.println("Tu nota es " + nota + ", esta bien.");
        }
        if(nota == 7 || nota == 8) {
            System.out.println("Tu nota es " + nota + ", es notable.");
        }
        if(nota >= 9) {
            System.out.println("Tu nota es " + nota + ", es sobresaliente.");
        }
    }
}
