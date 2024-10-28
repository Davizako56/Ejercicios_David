package org.example.Unidad2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PreexamenEjr3 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int i;
        int mes = 0;
        int pag = 5;
        int tot = 0;
        boolean err = true;

        while(err) {
            try{
                System.out.println("¿Cuantos meses se financiarán?");
                mes = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        System.out.println("Financiación a " + mes + " meses.");

        for(i = 1; i <= mes; i++) {
            pag += pag;
            System.out.println("Mes " + i + ": " + pag + "€");
            tot += pag;
        }
        System.out.println("Total a pagar: " + tot + "€");
    }
}
