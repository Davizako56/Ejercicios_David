package org.example.Unidad2;
import java.util.Scanner;

public class PreexamenEjr1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

         String n;
         int i = 1;

        System.out.println("Introduzca un acantidad de números...");
        n = entrada.next();
        int largo = n.length();

        while (i < largo) {

            String n1 = n.substring(i,i + 1);
            int num = Integer.parseInt(n1);

            if (num > 0) {

                System.out.println(num + " es mayor que 0.");
            }
            if (num < 0) {

                System.out.print(num + " es menor que 0.");
            }
            if (num == 0) {

                System.out.println(num + " es igual a 0.");
            }
            i++;
        }
    }
}
