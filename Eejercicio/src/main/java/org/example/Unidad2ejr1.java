package org.example;
import java.util.Scanner;

public class Unidad2ejr1 {
    public static void main(String[] args) {
    }
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase");
        String frase = entrada.nextLine();
        int largo = frase.length();
        System.out.println("La longitud del texto es: " + largo + ".");
        String espacio = frase.replace(" ", "");
        System.out.println("La frase sin espacios es: " + espacio + ".");
        int num = largo/2;
        String part1 = frase.substring(0,num);
        String part2 = frase.substring(num,largo);
        System.out.println("La primera parte de la frase es: " + part1 + ". La segunda parte de la frase es: " + part2 + ".");
        String mayus = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es: " + mayus + ".");
    }
}