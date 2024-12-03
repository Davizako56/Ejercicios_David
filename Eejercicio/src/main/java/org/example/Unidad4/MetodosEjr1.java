package org.example.Unidad4;
import java.util.Scanner;

public class MetodosEjr1 {
    public static void ejecuter() {

        texto();
        int num_escogido = numero();
        resultado(num_escogido);

    }

    public static void texto() {

        System.out.println("Introduce el número a multiplicar");
    }

    public static int numero() {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        return num;
    }

    public static void resultado(int num) {

        int res = num * num * num;
        System.out.println("El número " + num + " al cubo es: " + res);
    }
}
