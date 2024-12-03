package org.example.Unidad3;
import java.util.Scanner;

public class BuclesanidadosEjr4 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int m;

        System.out.println("Intrduzca el número máximo...");
        m = entrada.nextInt();
        System.out.print("Números primos: ");

        for (int i = 2; i <= m; i++) {

            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.print(i + " ");
            }

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
