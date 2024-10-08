package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
    }
    public void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int multiplicando = 0;
        int multiplicador = 0;
        boolean err = true;

        while(err == true){
            try {
                System.out.println("Introduce el multiplicando (3 cifras):");
                multiplicando = entrada.nextInt();
                System.out.println("Introduce el multiplicador (3 cifras):");
                multiplicador = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto");
                entrada.nextLine();
            }
        }
        while (multiplicando > 999 || multiplicador > 999 || multiplicando < 100 || multiplicador < 100) {
            try {
                System.out.println("ERROR: Hay un número que no es de 3 cifras");
                System.out.println("Introduce el multiplicando (3 cifras):");
                multiplicando = entrada.nextInt();
                System.out.println("Introduce el multiplicador (3 cifras):");
                multiplicador = entrada.nextInt();
            } catch (InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto");
                entrada.nextLine();
            }
        }
        int producto = multiplicando * multiplicador;
        System.out.println("El producto de la multiplicación es: " + producto);
        System.out.println("El proceso es:");
        System.out.println("   " + multiplicando);
        System.out.println("x  " + multiplicador);
        System.out.println("_________");

        String multiplicadorC = Integer.toString(multiplicador);
        String num1 = multiplicadorC.substring(2, 3);
        String num2 = multiplicadorC.substring(1, 2);
        String num3 = multiplicadorC.substring(0, 1);

        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        int num_3 = Integer.parseInt(num3);

        System.out.println("   " + num_1 * multiplicando + "x");
        System.out.println("  " + num_2 * multiplicando + "xx");
        System.out.println(" " + num_3 * multiplicando);
        System.out.println("_________");
        System.out.println(producto);

    }
}
