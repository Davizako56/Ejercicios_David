package org.example.Unidad3;
import java.util.Scanner;

public class BuclesanidadosEjr2 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        String ast = "*";
        int alt;

        System.out.println("Introduzca la altura del triángulo...");
        alt = entrada.nextInt();

        for (int i = 1; i <= alt; i++) {
            System.out.println(ast);
            ast += "*";
        }
    }
}
