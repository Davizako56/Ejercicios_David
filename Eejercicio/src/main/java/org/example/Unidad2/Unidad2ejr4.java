package org.example.Unidad2;
import java.util.Scanner;

public class Unidad2ejr4 {
    public static void main(String[] args) {
    }
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        String texto;

        System.out.println("Introduzca una frase...");
        texto = entrada.nextLine();
        System.out.println("Introduce la palabra repetida...");
        String R = entrada.nextLine();
        String Rp = R + "  ";

        String texto1 = " " + texto + " ";
        int letrasT = texto1.length();
        int letrasR = Rp.length();

        String sal = texto1.replace(" " + R + " ", "");
        int sall = sal.length();
        int resultado = (letrasT - sall) / letrasR;
        System.out.println("Tiene " + R + " " + resultado + " veces.");

    }
}
