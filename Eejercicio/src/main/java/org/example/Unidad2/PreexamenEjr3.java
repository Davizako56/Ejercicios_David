package org.example.Unidad2;
import java.util.Scanner;

public class PreexamenEjr3 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int i;
        int mes;
        int pag = 5;
        int tot = 0;

        System.out.println("¿Cuantos meses se financiarán?");
        mes = entrada.nextInt();

        System.out.println("Financiación a " + mes + " meses.");

        for(i = 1; i <= mes; i++) {
            pag += pag;
            System.out.println("Mes " + i + ": " + pag + "€");
            tot += pag;
        }
        System.out.println("Total a pagar: " + tot + "€");
    }
}
