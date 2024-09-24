package org.example;

import java.util.Scanner;

public class Actividad_inicial {
    public static void main(String[] args) {

        public void ejecuter(); {
        System.out.println("¿Como te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

        System.out.println("Introduce un número:");
        int número = entrada.nextInt();
        System.out.println(número);

        System.out.println("Introduce otro número");
        int numero2 = entrada.nextInt();
        int resultado = número + numero2;
        System.out.println("El resultado de la suma es: " + resultado);

        //System.in.read();


    }

    public void ejecuter() {
    }
}
