package org.example;
import java.util.Scanner;

public class Unidad2ejr3 {
    public static void main(String[] args) {
    }
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        String N = String.valueOf(0);
        int m = 0;

        System.out.println("Introduce un número...");
        N = entrada.nextLine();
        System.out.println("Introduce el valor de m...");
        m = entrada.nextInt();

        int Nl = N.length();
        int fin = Nl - m;
        String N1 = N.substring(0, fin);
        System.out.println("El resultado es: " + N1 + ".");



    }
}
