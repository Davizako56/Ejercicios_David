package org.example.Unidad2;
import java.util.Scanner;

public class BuclesEjr5 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int num;
        int mul = 1;

        System.out.println("Introduzca un número...");
        num = entrada.nextInt();
        System.out.println("Aquí tiene la tabla de multiplicar de " + num + ":");

        while (mul <= 10) {
            int res = num * mul;
            System.out.println(num + " * " + mul + " = " + res);
            mul++;
        }
    }
}
