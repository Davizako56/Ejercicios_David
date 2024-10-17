package org.example.Unidad2;
import java.util.Scanner;

public class Ternario {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        int resp;
        int a = 2;
        int b = 4;
        int c = 9;
        int res = a++ == 3 && a > b ? a += c / 3 :
                a > 3 && a < c ? a += b :
                        a == b && a > 0 ? a++ * 2 : a++;

        System.out.println("Se introducirán las siguientes variables: a = 2, b = 4, c = 9");
        System.out.println("Esta es la operación a realizar: a++ == 3 && a > b ? a += c / 3 :" +
                " a > 3 && a < c ? a += b :" +
                " a == b && a > 0 ? a++ * 2 : a++;");
        System.out.println("Introduce la respuesta...");
        resp = entrada.nextInt();

        while (resp != res) {
            System.out.println("Has fallado, inténtalo de nuevo");
            resp = entrada.nextInt();
        }
            System.out.println("Felicidades, has acertado.");
        }

    }

