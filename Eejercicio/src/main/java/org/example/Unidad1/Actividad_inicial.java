package org.example.Unidad1;

import java.util.Scanner;

public class Actividad_inicial {

        public static void ejecuter() {
            System.out.println("¿Como te llamas?");
            Scanner entrada = new Scanner(System.in);
            String nombre = entrada.next();

            System.out.println("¿A que curso vas?");
            String curso = entrada.next();

            System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

            int número = 0;
            int numero2 = 0;

            while (número == 0 || numero2 == 0){System.out.println("Introduce un número:");
                número = entrada.nextInt();

                System.out.println("Introduce otro número");
                numero2 = entrada.nextInt();



                if (número == 0 || numero2 == 0) {
                    System.out.println("ERROR. Un sumando no puede ser 0.");}

                int resultado = número + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
            }

            //System.in.read();


        }


}
