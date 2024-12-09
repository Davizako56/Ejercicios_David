package org.example.Unidad4;
import java.util.Scanner;
import java.util.Arrays;

public class MetodosEjr3 {
    public static void ejecuter() {
        texto();
        String cad_escogida = cadena();
        texto2();
        int num_escogido = numero();
        String[] cat_resultante = vector(num_escogido, cad_escogida);

    }

    public static void texto() {

        System.out.println("Introduzca una cadena");
    }

    public static String cadena() {
        Scanner entrada = new Scanner(System.in);

        String cad = entrada.nextLine();
        return cad;
    }

    public static void texto2() {

        System.out.println("Introduzca 1 para pasar a mayúsculas una cadena y 2 para contar las vocales de una cadena");
    }

    public static int numero() {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        return num;
    }

    public static String[] vector(int num,String cad) {

        String cat[] = cad.split("aeiou");
        if (num != 1 && num != 2) {
            System.out.println("ERROR: Este número no está dentro de las opciones");
        }
        if (num == 1) {
            System.out.println(cad.toUpperCase());
        }

        if (num == 2) {
            System.out.println(Arrays.toString(cat));
            System.out.println("En esta cadena hay " + cat.length + " vocales");
            return cat;
        }

        return cat;
    }
}
