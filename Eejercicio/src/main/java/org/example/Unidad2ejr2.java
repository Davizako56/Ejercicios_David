package org.example;
import java.util.Scanner;

public class Unidad2ejr2 {
    public static void main(String[] args) {
    }

    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabara o frase.");
        String pal1 = entrada.nextLine();
        int lar1 = pal1.length();

        System.out.println("Introduce la segunda palabra o frase.");
        String pal2 = entrada.nextLine();
        int lar2 = pal2.length();

        if (lar1 == lar2) {
            System.out.println("ERROR: Las dos palabras no pueden ser iguales");
        }else{
            if (lar1 > lar2) {
                System.out.println("La palabra o frase más larga es: " + pal1 + ".");
            }else{
                System.out.println("La palabra o frase más larga es: " + pal2 + ".");
            }
        }


    }
}
