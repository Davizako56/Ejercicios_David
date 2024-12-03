package org.example.Unidad4;
import java.util.Scanner;
import java.util.Arrays;

public class MetodosEjr2 {
    public static void ejecuter() {

        texto();
        int num_escogido = numero();
        vector(num_escogido);
    }

    public static void texto() {

        System.out.println("Introduzca el tamaño del menú...");
    }

    public static int numero() {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        return num;
    }

    public static String[] vector(int num) {

        String vector[] = new String[num];
        vector[vector.length - 1] = "Salida";
        System.out.println(Arrays.toString(vector));
        return vector;
    }
}
